package com.frankmoley.lil.fid.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages =  "com.frankmoley.lil.fid")
// allows aspect proxy to load
@EnableAspectJAutoProxy
public class ApplicationConfig {

}
