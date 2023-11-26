package com.app.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTodoApplication {

	public static void main(String[] args) {
		SpringApplication.from(TodoApplication::main).with(TestTodoApplication.class).run(args);
	}

}
