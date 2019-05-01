package com.huazai.plus.common;

/**
 * 常量池
 * <p>
 * 
 * @ClassName : Constant
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 * 
 * @Author : HuaZai
 * @CreateDate : 2019年4月28日 下午3:47:58
 * @ContactInformation : 1461522031@qq.com/huazai6789@aliyun.com
 *
 * @PackgeName : com.huazai.plus.common.Constant
 *
 * @Version : V1.0.0
 */
public class Constant {

	// MyBatis-Config 全局配置相关
	public static final String GLOBAL_AUTHOR = "huazai";
	public static final String GLOBAL_OUTDIR = "D:/Work_Documents/projects";
	public static final String GLOBAL_MAPPERNAME = "%sMapper";
	public static final String GLOBAL_XMLNAME = "%sMapper";
	public static final String GLOBAL_SERVICENAME = "%sService";
	public static final String GLOBAL_SERVICEIMPLNAME = "%sServiceImpl";
	public static final String GLOBAL_CONTROLLERNAME = "%sController";

	// MySQL 数据源配置相关
	public static final String MYSQL_URI = "jdbc:mysql://***.***.***.***:3306/b2c_aiyou?useUnicode=true&useSSL=false&characterEncoding=utf8";
	public static final String MYSQL_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String MYSQL_USERNAME = "*****";
	public static final String MYSQL_PASSWORD = "*********";

	// 模板引擎配置相关
	public static final String TEMPLATE_FREEMARKER_PATH = "/templates/mapper.xml.vm";
	public static final String TEMPLATE_VELOCITY_PATH = "/templates/mapper.xml.vm";

	// Package 包配置相关
	public static final String PACKAGE_PARENT = "com.huazai.b2c.aiyou";
	public static final String PACKAGE_ENTITY = "entity";
	public static final String PACKAGE_MAPPER = "mapper";
	public static final String PACKAGE_SERVICE = "service";
	public static final String PACKAGE_SERVICEIMPL = "service.impl";
	public static final String PACKAGE_CONTROLLER = "controller";

	// OutFile 配置
	public static final String OUTFILE_XMLBASEURL = "/src/main/resources/mapper/";
	public static final String OUTFILE_XMLSUFFIXNAME = "Mapper";

	// 策略配置
	public static final String STRATEGY_SUPERENTITY = "com.huazai.b2c.aiyou.base.entity.BaseEntity";
	public static final String STRATEGY_SUPERMAPPER = "com.huazai.b2c.aiyou.base.mapper.BaseMapper";
	public static final String STRATEGY_SUPERSERVICE = "com.huazai.b2c.aiyou.base.service.BaseService";
	public static final String STRATEGY_SUPERSERVICEIMPL = "com.huazai.b2c.aiyou.base.service.impl.BaseServiceImpl";
	public static final String STRATEGY_SUPERCONTROLLER = "com.huazai.b2c.aiyou.base.controller.BaseController";
	public static final String STRATEGY_TABLEPREFIX = "aiyou_";
	public static final String STRATEGY_INCLUDE = "aiyou_employee_role";

	// 样式表
	public static final String RESULT_SUCCEED = "<div style='text-align:center;margin:0 auto;border:1px solid #FFF;width:300px;height:100px'><h1> <font color='red'>Successfully</font></h1></div>";
	public static final String RESULT_FAILED = "<div style='text-align:center;margin:0 auto;border:1px solid #FFF;width:300px;height:100px'><h1> <font color='red'>Successfully</font></h1></div>";

}
