/**
 * 
 */
package com.formula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Leon(Liu Yang) Ideas from Formula Innovation
 */
@Configuration
@EnableAutoConfiguration
@PropertySource("test.properties")
public class UnitTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(UnitTestApplication.class, args);
	}
}
