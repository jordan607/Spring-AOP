package com.jr.spring.aop.springaop;

import com.jr.spring.aop.springaop.buisness.Business1;
import com.jr.spring.aop.springaop.buisness.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private Business1 business1;
	private Business2 business2;

	@Autowired
	public SpringAopApplication(Business1 business1, Business2 business2) {
		this.business1 = business1;
		this.business2 = business2;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}
