package com.huazai.plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @description
 *              <li>主项目启动类
 *              <li>启动成功后，访问地址进行生成->
 *              http://localhost:8083/mybatis/plus/generation
 * @class_name MybatisPlusGeneratorApplication
 * @package com.huazai.plus
 * @created 2017年5月1日 下午6:01:45
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
@SpringBootApplication
public class MybatisPlusGeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(MybatisPlusGeneratorApplication.class, args);
	}

}
