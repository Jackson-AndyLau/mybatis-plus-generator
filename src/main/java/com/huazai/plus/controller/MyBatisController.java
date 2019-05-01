package com.huazai.plus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.plus.common.Constant;
import com.huazai.plus.config.MyBatisConfig;

@RestController
@RequestMapping(value = "/mybatis")
public class MyBatisController {

	@GetMapping(value = "/plus/generation")
	public String generationNow() {
		MyBatisConfig.generation();

		return Constant.RESULT_SUCCEED;
	}

}
