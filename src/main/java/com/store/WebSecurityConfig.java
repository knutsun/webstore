package com.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin()
            .and()
                .logout()
                .logoutSuccessUrl("/")
            .and()
                .rememberMe()
                .tokenValiditySeconds(60)
                .key("webstorePrivateKey")
            .and()
                .authorizeRequests()
                .antMatchers("/dash").authenticated()
                .anyRequest().permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {

        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("dev")
                .password("dev123")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}