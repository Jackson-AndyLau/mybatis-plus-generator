package com.huazai.plus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.plus.common.Constant;
import com.huazai.plus.config.MyBatisConfig;

/**
 * 
 * @description
 *              <li>控制层
 * @class_name MyBatisController
 * @package com.huazai.plus.controller
 * @created 2019年5月1日 下午6:01:23
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
@RestController
@RequestMapping(value = "/mybatis")
public class MyBatisController
{

	@GetMapping(value = "/plus/generation")
	public String generationNow()
	{
		MyBatisConfig.generation();

		return Constant.RESULT_SUCCEED;
	}

}
