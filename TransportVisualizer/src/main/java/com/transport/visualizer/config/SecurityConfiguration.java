package com.transport.visualizer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author Chaklader on 2020-01-07
 */
@Configuration
@EnableWebSecurity
@Profile("development")
public class SecurityConfiguration {


    // Authentication
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("rac")
                .password("secret")
                .roles("USER", "ADMIN");
    }

    @Configuration
    @Order(1)
    @Profile("development")
    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {


        @Override
        public void configure(HttpSecurity http) throws Exception {

            http.antMatcher("/website/**").authorizeRequests()
                    .anyRequest().hasRole("USER")
                    .and()
                    .formLogin().loginPage("/website/login.jsp")
                    .failureUrl("/website/login.jsp?error=1")
                    .loginProcessingUrl("/website/login")
                    .permitAll()
                    .and()
                    .logout()
                    .logoutSuccessUrl("/website/vehicles/list.html");
        }
    }

    // Authorization
    @Configuration
    @Order(2)
    @Profile("development")
    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {

        protected void configure(HttpSecurity http) throws Exception {

            http
                    .antMatcher("/**")
                    .authorizeRequests()
                    .anyRequest().hasRole("ADMIN")
                    .and()
                    .httpBasic()
                    .and()
                    .csrf()
                    .disable();
        }
    }

}
