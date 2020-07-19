package com.spider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 *
 */
@MapperScan("com.spider.*.mapper")
@SpringBootApplication
public class Application 
{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
