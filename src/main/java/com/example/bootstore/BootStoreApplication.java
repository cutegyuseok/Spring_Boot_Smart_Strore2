package com.example.bootstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.bootstore.mapper"})
public class BootStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStoreApplication.class, args);
	}

}
