package com.huazai.plus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mybatis")
public class MyBatisController {

	@GetMapping(value = "/plus/generation")
	public String generationNow() {
		
		return "hell world";
	}

}
