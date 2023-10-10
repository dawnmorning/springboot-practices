package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. Bootstrapping class : 스프링 application의 부트스트래핑 역할 2. 설정 클래스 역할 :
 * Configuration Class
 */

@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {

		/*
		 * SpringApplication.ru(...) 안에서 일어나는 일 1. Application Context 생성(Application
		 * Context, Spring Container) 2. 어노테이션 스캐닝(Component Scaning + Configuration
		 * Class을 통한 Bean 생성 및 등록, di(AutoWired) 작업 3. 만약, 웹 어플리케이션이라면 웹app 타입을
		 * 결정(Spring MVC, Reactive) 4. 만약, web app이고 타입이 SpringMVC이면 - 내장(embedded) 서버
		 * (TomcatEmbeddedServiceServletContainer) 인스턴스 생성 - 서버 인스턴스 Web app 배포(mvc,
		 * aop, security, jpa, ... auto Configuration) - 서버 인스턴스 스타트 5.
		 * ApplicationRunner 인터페이스를 구현한 Bean을 Application Context에서 찾아서 실행
		 */
//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		} finally {
//			if(ac!=null) {
//				ac.close();				
//			}
//		}
		
		
		// try ~ with ~ resources 구문
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){
			// web application 인 경우
			// SpringApplication.run(HelloWorldApplication.class, args);
			
			System.out.println("some code.....");
			System.out.println("some code.....");
			System.out.println("some code.....");
			System.out.println("some code.....");
			
		}

	}
}
