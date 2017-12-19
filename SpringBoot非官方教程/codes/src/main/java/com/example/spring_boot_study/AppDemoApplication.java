package com.example.spring_boot_study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties//这个直接开启了属性配置
public class AppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args->{
			System.out.println("view the bean started by spring-boot");
			String[] beanNames= ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames){
				System.out.println(beanName);
			}
		};

	}
}
