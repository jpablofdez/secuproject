package com.security.jwt;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.security.jwt.service.FilesStorageService;

@SpringBootApplication
public class SpringBootSecuprojectApplication {

  @Resource
  FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecuprojectApplication.class, args);
	}

}
