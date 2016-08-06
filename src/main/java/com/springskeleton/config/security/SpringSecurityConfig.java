/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springskeleton.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author krystofurr
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
    /**
     *  For use when you have your own custom designed login form
     * 
     * @param auth
     * @param http
     * @throws Exception 
     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//        .authorizeRequests()
//            .antMatchers("/webjars/**", "/js/**", "/css/**").permitAll()
//            .antMatchers("/rest/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//        .formLogin()
//            .loginPage("/login")
//            .permitAll()
//            .and()
//        .logout()
//            .permitAll();
//    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
        .inMemoryAuthentication()
            .withUser("user").password("abc123").roles("ADMIN");
    }
}
