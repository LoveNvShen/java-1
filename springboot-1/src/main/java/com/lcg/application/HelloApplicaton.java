package com.lcg.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
@SpringBootApplication
//mybatis-spring 1.3 整合jar包 有该注解
//Spring Boot项目的核心注解，主要目的是开启自动配置。
//Configuration 声明当前类 为配置类
/**
 * 注意这个类 放在一级目录下
 * 从本目录下匹配对应的action service。。。
 * @author Administrator
 */
public class HelloApplicaton {
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplicaton.class, args);
	}
}
