package com.example.demo;

import com.example.demo.Service.UserService;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	//	ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanannotationApplication.class);
		ApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
		String [] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		System.out.println("#############");
		for(String s:beans)
		{

			System.out.println(s + "  of type " + ctx.getBean(s).getClass());
		}

		System.out.println("###############");



		//System.out.println(mybean.getList());

		//SpringApplication.run(DemoApplication.class, args);
	}

}
