package com.andoliver46.SecutiryTestApp;

import com.andoliver46.SecutiryTestApp.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecutiryTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecutiryTestAppApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}
}
