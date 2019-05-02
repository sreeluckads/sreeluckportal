package com.sreeluck.demo;

import com.sreeluck.demo.entity.Skill;
import com.sreeluck.demo.entity.User;
import com.sreeluck.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		User user= new User("Sreedhar", null);
		user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}
}
