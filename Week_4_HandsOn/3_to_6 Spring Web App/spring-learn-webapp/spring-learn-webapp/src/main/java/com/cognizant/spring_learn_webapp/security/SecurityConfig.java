/*package com.cognizant.spring_learn_webapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/authenticate").permitAll() // ✅ Allow open access to /authenticate
            .anyRequest().authenticated()
            .and()
            .httpBasic(); // ✅ Enable basic auth

        return http.build();
    }
}*/


package com.cognizant.spring_learn_webapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF for API endpoints (enable if you have web views)
            .csrf(csrf -> csrf.disable())
            
            // Configure authorization rules
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/authenticate").permitAll()  // Public endpoint
                .anyRequest().authenticated()                  // All others need auth
            )
            
            // Enable Basic Authentication
            .httpBasic(basic -> basic.realmName("Your App Name"));
        
        return http.build();
    }
}
