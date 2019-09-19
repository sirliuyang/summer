# Architecture And Workflow

### Servlets and Filters

Filter Chain: Authentication Filter

### Authentication Manager

AuthenticationManager
```java
public interface AuthenticationManager {
    Authentioncation authenticate(Authentication authentication)
}
```

Authentication
```java
public interface Authentication extends Principal, Serializable {
    Collection<? extends GrantedAuthority> getAuthorities();
    Object getCredentials();
    Object getDetails();
    Object getPrincipal();

    boolean isAuthenticated();
    void setAuthenticated(boolean b) throws IllegalArgumentException;
}
```

Before

Authentication request

```
isAuthenticated: False
Principle: Username
Credentials: Password
Authories:
```

After

Authentication principle
```
isAuthenticated: True
Principle: UserDetails
Credentials: (removed)
Authories: Roles
```


### Authentication Provider

AuthenticationProvider

```java
public interface AuthenticationProvider {

	Authentication authenticate(Authentication authentication)
			throws AuthenticationException;

	boolean supports(Class<?> authentication);
}
```

UserDetails

```java
public interface UserDetailsService {
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
```

### Workflow

1. AuthenticationFilter: generates
2. Authenticated Principle: ask for authenticating
3. AuthenticationManager: find delegates
4. AuthenticationProviders: get UserDetails from
5. UserDetailsService: fill the Authentication
6. AuthenticationFilter: stores at SecurityContextHolder->Security Context->Authenticated Principle

