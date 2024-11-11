/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.invoice.security;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author adminit
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private DataSource datasource;

    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.requestMatchers("/", "/home").permitAll()
                .requestMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/img/**", "/icon/**").permitAll()
                .anyRequest().authenticated())
                .formLogin((form) -> form.loginPage("/login").permitAll()
                .successForwardUrl("/home"))
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder().username("admin")
                .password("admin123")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        //Use Spring Boots User detailsManager
//        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
//
//        //Set our Datasource to use the one defined in application.properties
//        userDetailsService.setDataSource(datasource);
//
//        //Create BCryptPassword encoder
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        //add components
//        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
//        auth.jdbcAuthentication().dataSource(datasource);
//
//        // add new user "user" with password "password" - password will be encrypted
//        if (!userDetailsService.userExists("admin")) {
//            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//            authorities.add(new SimpleGrantedAuthority("USER"));
//            User userDetails = new User("admin", encoder.encode("admin123"), authorities);
//            userDetailsService.createUser(userDetails);
//        }
//    }

}
