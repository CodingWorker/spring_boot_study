package com.example.spring_boot_study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Arrays;
import java.util.concurrent.Executor;

@SpringBootApplication
@EnableConfigurationProperties//这个直接开启了属性配置
@EnableScheduling//开启任务调度
@EnableAsync//开启异步任务
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

	/**
	 * 异步任务配置最大线程数为2
	 * @return
	 */
//	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("GithubLookup-");
		executor.initialize();
		return executor;
	}

}
