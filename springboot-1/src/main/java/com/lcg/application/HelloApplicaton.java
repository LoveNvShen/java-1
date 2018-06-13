package com.lcg.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
@SpringBootApplication
//mybatis-spring 1.3 ����jar�� �и�ע��
//Spring Boot��Ŀ�ĺ���ע�⣬��ҪĿ���ǿ����Զ����á�
//Configuration ������ǰ�� Ϊ������
/**
 * ע������� ����һ��Ŀ¼��
 * �ӱ�Ŀ¼��ƥ���Ӧ��action service������
 * @author Administrator
 */
public class HelloApplicaton {
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplicaton.class, args);
	}
}
