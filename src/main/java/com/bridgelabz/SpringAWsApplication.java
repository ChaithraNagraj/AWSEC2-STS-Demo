package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class SpringAWsApplication {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Greetings from AWS Ec2 instance";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAWsApplication.class, args);
		System.out.println("Here is the frst Aws Ec2 sts project");
	}

}
