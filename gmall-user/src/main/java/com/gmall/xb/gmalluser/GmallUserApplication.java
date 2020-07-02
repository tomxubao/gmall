package com.gmall.xb.gmalluser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.gmall.xb.gmalluser.mapper")
@MapperScan(basePackages = "com.gmall.xb.gmalluser.mapper")
public class GmallUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(GmallUserApplication.class, args);
	}

}
