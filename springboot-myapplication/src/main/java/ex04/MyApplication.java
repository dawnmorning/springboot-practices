package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex03.component.MyComponent;

/**
 * @SpringBootApplication 메타 어노테이션:
 * 
 * + @SpringBootConfiguration : cf) ex01, ex02
 * + @ComponentScan : ex04, 하부 패키지를 스캔한다. 비교) ex03
 * + @EnableAutoConfiguration:
 * 1. MVC, AOP, Security, JPA 등을 자동으로 설정
 * 2. 발견된 Starter Dependency(Library) 기반으로 설정 ( 관례를 따르는 Default 설정 )
 * 3. +application.properties or application.yml 안의 미세설정
 */


@SpringBootApplication
public class MyApplication {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {

		}

	}

}
