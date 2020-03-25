package com.douzone.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.mysite.config.web.MvcConfig;

@Configuration
@ComponentScan({"com.douzone.mysite.controller"})
@Import({MvcConfig.class})
public class WebConfig {
}