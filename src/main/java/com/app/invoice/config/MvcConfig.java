/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.invoice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 *
 * @author adminit
 */
@Configuration
public class MvcConfig {

    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/hello").setViewName("hello");
////        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/login").setViewName("auth_login");//login controller, and user will redirect to this page auth_login.html
    }
}
