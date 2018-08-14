package com.kk.Springbootmanger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kk.Springbootmanger.dao")
public class SpringbootMangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMangerApplication.class, args);
	}
}
