package com.neusoft.ele;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.neusoft.ele.mapper")
public class EleMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleMallApplication.class, args);
	}

}
