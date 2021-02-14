# Configuration


### Spring Boots Default Spring Security Configuration
> When you add Spring Security, it has default settings.


#### Default Filter Chain
> org.springframework.security.web.DefaultSecurityFilterChain

- EntryPoint


#### autoconfigure

Spring has autoconfig package, and it has a spring.factories file which records:
```
security.servlet.UserDetailsServiceAutoConfiguration
security.servlet.SecurityFilter
```

SecurityAutoConfiguration will enable default config if user doesn't have one.

```java
@Configuration
@ConditionalOnClass(DefaultAuthenticationEventPublisher.class)
@EnableConfigurationProperties(SecurityProperties.class)
@Import({ SpringBootWebSecurityConfiguration.class, WebSecurityEnablerConfiguration.class,
		SecurityDataConfiguration.class })
public class SecurityAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean(AuthenticationEventPublisher.class)
	public DefaultAuthenticationEventPublisher authenticationEventPublisher(ApplicationEventPublisher publisher) {
		return new DefaultAuthenticationEventPublisher(publisher);
	}
}
```

##### WebSecurityConfigurerAdapter
> It is enabled by DefaultConfigurerAdapter, the core logic is in WebSecurityConfigurerAdapter
```java
public class SpringBootWebSecurityConfiguration {
	@Configuration
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	static class DefaultConfigurerAdapter extends WebSecurityConfigurerAdapter {
	}
}
```
##### WebSecurityConfiguration
> It is enabled by WebSecurityEnablerConfiguration, the core logic is in WebSecurityConfiguration

```java
@Configuration
@ConditionalOnBean(WebSecurityConfigurerAdapter.class)
@ConditionalOnMissingBean(name = BeanIds.SPRING_SECURITY_FILTER_CHAIN)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@EnableWebSecurity
public class WebSecurityEnablerConfiguration {

}
```

##### UserDetailsServiceAutoConfiguration

```
private String getOrDeducePassword(SecurityProperties.User user, PasswordEncoder encoder) {
	String password = user.getPassword();
	if (user.isPasswordGenerated()) {
		logger.info(String.format("%n%nUsing generated security password: %s%n", user.getPassword()));
	}
	if (encoder != null || PASSWORD_ALGORITHM_PATTERN.matcher(password).matches()) {
		return password;
	}
	return NOOP_PASSWORD_PREFIX + password;
}
```

