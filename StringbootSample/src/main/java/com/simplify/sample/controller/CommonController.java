package com.simplify.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	@RequestMapping("/")
	public String root_test() {
		return "Hello Root";
	}
	
	@RequestMapping("/demo")
	public String demo_test() {
		return "Hello Demo";
	}
}
