package com.issac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 
 * 			相当于@Configuration、@EnableAutoConfiguration和@ComponentScan
 * @author cuizhanyou
 */
@SpringBootApplication
@MapperScan("com.issac.dao")
public class GroupShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupShareApplication.class, args);
	}
}