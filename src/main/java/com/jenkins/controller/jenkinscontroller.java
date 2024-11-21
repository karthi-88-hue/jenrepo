package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/jenkins")

public class jenkinscontroller {
	@GetMapping("/gett")
	public String getjenkins() {
		return "hello jenkins";
	}
	

}
