package com.hx.servlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/10/10 9:11
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.hx.controller")
public class WebConfig {
}
