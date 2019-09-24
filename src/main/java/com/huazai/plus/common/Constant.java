package com.huazai.plus.common;

/**
 * 
 * @description
 *              <li>常量池
 * @class_name Constant
 * @package com.huazai.plus.common
 * @created 2017年5月1日 下午5:58:52
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class Constant
{

	// MyBatis-Config 全局配置相关
	public static final String GLOBAL_AUTHOR = "zhaozhenhua";  // 修改作者
	public static final String GLOBAL_OUTDIR = "D:/";
	public static final String GLOBAL_MAPPERNAME = "%sMapper";
	public static final String GLOBAL_XMLNAME = "%sMapper";
	public static final String GLOBAL_SERVICENAME = "%sService";
	public static final String GLOBAL_SERVICEIMPLNAME = "%sServiceImpl";
	public static final String GLOBAL_CONTROLLERNAME = "%sController";

	// MySQL 数据源配置相关	 修改数据源
	public static final String MYSQL_URI = "jdbc:mysql://localhost:3306/aiyou_mybatis?useUnicode=true&useSSL=false&characterEncoding=utf8";
	// mysql-connector-java 6或者以上的驱动，主要针对新版本
	public static final String MYSQL_DRIVER_NAME_SEX_BEFORE = "com.mysql.cj.jdbc.Driver";
	// mysql-connector-java 5或者以下的驱动，主要针对老版本
	public static final String MYSQL_DRIVER_NAME_FIVE_LATER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_USERNAME = "****";
	public static final String MYSQL_PASSWORD = "********";
	
	// Oracle 数据源配置相关
	public static final String ORACLE_URI = "jdbc:oracle:thin:@localhost:1521:orcl/aiyou_mybatis?useUnicode=true&useSSL=false&characterEncoding=utf8";
	// Oracle 驱动
	public static final String ORACLE_DRIVER_NAME_SEX_BEFORE = "oracle.jdbc.driver.OracleDriver";
	public static final String ORACLE_USERNAME = "****";
	public static final String ORACLE_PASSWORD = "********";
	
	// PostgrepSQL 数据源配置相关
	public static final String POSTGREPSQL_URI = "jdbc:postgresql://localhost:5432/aiyou_mybatis?useUnicode=true&characterEncoding=utf-8&useSSL=true&allowMultiQueries=true";
	// PostgrepSQL 驱动
	public static final String POSTGREPSQL_DRIVER_NAME_SEX_BEFORE = "org.postgresql.Driver";
	public static final String POSTGREPSQL_USERNAME = "****";
	public static final String POSTGREPSQL_PASSWORD = "********";

	// 自定义配置相关，HTML模板路径、XML模板路径、JSP模板路径
	public static final String TEMPLATE_OF_MAPPER = "/templates/mapper.xml.vm";
	public static final String TEMPLATE_OF_HTML_LIST = "/templates/mapper.xml.vm";
	public static final String TEMPLATE_OF_JSP = "/templates/mapper.xml.vm";

	// Package 包配置相关	修改配置包
	public static final String PACKAGE_MODELNAME = "/";
	public static final String PACKAGE_PARENT = "com.huazai.b2c.aiyou";
	public static final String PACKAGE_ENTITY = "entity";
	public static final String PACKAGE_MAPPER = "mapper";
	public static final String PACKAGE_SERVICE = "service";
	public static final String PACKAGE_SERVICEIMPL = "service.impl";
	public static final String PACKAGE_CONTROLLER = "controller";

	// OutFile 配置
	public static final String OUTFILE_BASEURL = "/src/main/resources/mapper/";
	public static final String OUTFILE_MAPPER_SUFFIX = "Mapper";

	// 策略配置
	public static final String STRATEGY_SUPERENTITY = "com.huazai.b2c.aiyou.base.entity.BaseEntity";
	public static final String STRATEGY_SUPERMAPPER = "com.huazai.b2c.aiyou.base.mapper.BaseMapper";
	public static final String STRATEGY_SUPERSERVICE = "com.huazai.b2c.aiyou.base.service.BaseService";
	public static final String STRATEGY_SUPERSERVICEIMPL = "com.huazai.b2c.aiyou.base.service.impl.BaseServiceImpl";
	public static final String STRATEGY_SUPERCONTROLLER = "com.huazai.b2c.aiyou.base.controller.BaseController";
	// 单个前缀 修改生成的表
	public static final String STRATEGY_TABLEPREFIX = "o_";
	// 多个前缀
	public static final String[] STRATEGY_TABLEPREFIX_COLLECTION = new String[] { "b2c_","aiyou_" };
	// 单表
	public static final String STRATEGY_INCLUDE = "b2c_dict_type";
	// 多表
	public static final String[] STRATEGY_INCLUDE_COLLECTION = new String[] {"b2c_dict_type","b2c_dict_value"};

	// 样式表
	public static final String RESULT_SUCCEED = "<div style='text-align:center;margin:0 auto;border:1px solid #FFF;width:300px;height:100px'><h1> <font color='red'>Successfully</font></h1></div>";
	public static final String RESULT_FAILED = "<div style='text-align:center;margin:0 auto;border:1px solid #FFF;width:300px;height:100px'><h1> <font color='red'>Successfully</font></h1></div>";

}
