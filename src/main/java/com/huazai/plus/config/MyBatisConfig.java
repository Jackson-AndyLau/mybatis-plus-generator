package com.huazai.plus.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.IFileCreate;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.FileType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.huazai.plus.common.CString;
import com.huazai.plus.common.Constant;

/**
 * 
 * @description
 *              <li>MyBatis配置类
 * @class_name MyBatisConfig
 * @package com.huazai.plus.config
 * @created 2017年5月1日 下午6:01:02
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Configuration
@Component
public class MyBatisConfig
{

	public static void generation()
	{

		// 初始化代码生成器
		final AutoGenerator generator = new AutoGenerator();

		// 全局参数配置
		final GlobalConfig gConfig = new GlobalConfig();
		gConfig.setAuthor(Constant.GLOBAL_AUTHOR);
		// 从系统参数中获取
		final String projectPath = System.getProperty("user.dir");
		gConfig.setOutputDir(projectPath + "/src/main/java");
		// 自定义输出路径
		// gConfig.setOutputDir(Constant.GLOBAL_OUTDIR);
		// 是否覆盖同名文件，默认是false
		gConfig.setFileOverride(CString.C_TRUE_P);
		// 不需要ActiveRecord特性的请改为false
		gConfig.setActiveRecord(CString.C_TRUE_P);
		// XML 二级缓存
		gConfig.setEnableCache(CString.C_FALSE_P);
		// XML ResultMap
		gConfig.setBaseResultMap(CString.C_TRUE_P);
		// XML columList
		gConfig.setBaseColumnList(CString.C_TRUE_P);
		// 自定义文件命名，注意 %s 会自动填充表实体属性
		gConfig.setMapperName(Constant.GLOBAL_MAPPERNAME);
		gConfig.setXmlName(Constant.GLOBAL_XMLNAME);
		gConfig.setServiceName(Constant.GLOBAL_SERVICENAME);
		gConfig.setServiceImplName(Constant.GLOBAL_SERVICEIMPLNAME);
		gConfig.setControllerName(Constant.GLOBAL_CONTROLLERNAME);
		// true 生成后 open explorer;false 不打开
		gConfig.setOpen(CString.C_FALSE_P);
		generator.setGlobalConfig(gConfig);

		// 数据源配置
		final DataSourceConfig dbConfig = new DataSourceConfig();
		// 数据库类型
		dbConfig.setDbType(DbType.MYSQL);
		// 数据库驱动
		// 注意：MySQL5驱动为：com.mysql.jdbc.Driver；MySQL6驱动为：com.mysql.cj.jdbc.Driver
		dbConfig.setDriverName(Constant.MYSQL_DRIVER_NAME_SEX_BEFORE);
		// 数据库地址
		dbConfig.setUrl(Constant.MYSQL_URI);
		dbConfig.setUsername(Constant.MYSQL_USERNAME);
		dbConfig.setPassword(Constant.MYSQL_PASSWORD);
		generator.setDataSource(dbConfig);

		// 包配置
		final PackageConfig pConfig = new PackageConfig();
		pConfig.setModuleName(Constant.PACKAGE_MODELNAME);
		pConfig.setParent(Constant.PACKAGE_PARENT);
		pConfig.setEntity(Constant.PACKAGE_ENTITY);
		pConfig.setMapper(Constant.PACKAGE_MAPPER);
		pConfig.setService(Constant.PACKAGE_SERVICE);
		pConfig.setServiceImpl(Constant.PACKAGE_SERVICEIMPL);
		pConfig.setController(Constant.PACKAGE_CONTROLLER);
		generator.setPackageInfo(pConfig);

		/**
		 * 自定义配置
		 */
		final InjectionConfig iConfig = new InjectionConfig()
		{

			@Override
			public void initMap()
			{
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("aiyou", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
		final List<FileOutConfig> fConfigs = new ArrayList<>();
		// 自定义mapper模板（默认在 templates路径下加载），以及自定义输出路径
		fConfigs.add(new FileOutConfig(Constant.TEMPLATE_OF_MAPPER)
		{

			@Override
			public String outputFile(TableInfo tableInfo)
			{

				// 自定义输出文件名 ， 如果 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化
				return projectPath + Constant.OUTFILE_BASEURL + pConfig.getModuleName() + CString.C_SLASH
						+ tableInfo.getEntityName() + Constant.OUTFILE_MAPPER_SUFFIX + CString.C_DOT_XML;
			}
		});
		// TODO 。。。 这儿还可以添加多个自定义配置内容，包括指定HTMl、JSP等的模板以及输出路径
		// 配置是否创建文件
		iConfig.setFileCreate(new IFileCreate()
		{
			@Override
			public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath)
			{

				// true 创建目录和内容，false 只创建目录
				// return false;
				return true;
			}
		});
		iConfig.setFileOutConfigList(fConfigs);
		generator.setCfg(iConfig);

		/**
		 * 配置模板：
		 * <li>自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
		 * <li>放置到自己项目的 src/main/resources/templates 目录下,
		 * <li>默认名称可以不配置，也可以根据自己实际的业务需求自定义模板名称
		 */
		TemplateConfig tConfig = new TemplateConfig();
		// 配置自定义输出模板，指定自定义模板路径， 注意不要带上.ftl/.vm, 如果为null，则表示不生成文件，如果不指定模板，则会根据使用的模板引擎自动识别
		// tConfig.setEntity(null);
		// tConfig.setXml(null);
		// tConfig.setMapper(null);
		// tConfig.setService(null);
		// tConfig.setServiceImpl(null);
		// tConfig.setController(null);
		generator.setTemplate(tConfig);

		/**
		 * 策略配置
		 */
		StrategyConfig sConfig = new StrategyConfig();
		// 表名生成策略 （驼峰命名）
		sConfig.setNaming(NamingStrategy.underline_to_camel);
		// 列生成策略（驼峰命名）
		sConfig.setColumnNaming(NamingStrategy.underline_to_camel);
		// 自定义实体父类
		// sConfig.setSuperEntityClass(Constant.Strategy_SuperEntity);
		// 自定义公共字段
		sConfig.setSuperEntityColumns("id");
		// 实体是否使用 Lombok 模型
		sConfig.setEntityLombokModel(CString.C_TRUE_P);
		// 自定义 mapper 父类
		// sConfig.setSuperMapperClass(Constant.STRATEGY_SUPERMAPPER);
		// 自定义 service 父类
		// sConfig.setSuperServiceClass(Constant.STRATEGY_SUPERSERVICE);
		// 自定义 service 实现类父类
		// sConfig.setSuperServiceImplClass(Constant.STRATEGY_SUPERSERVICEIMPL);
		// 自定义 controller 父类
		// sConfig.setSuperControllerClass(Constant.STRATEGY_SUPERCONTROLLER);
		// controller 是否使用 rest 风格
		sConfig.setRestControllerStyle(CString.C_TRUE_P);
		// controller 的映射风格
		sConfig.setControllerMappingHyphenStyle(CString.C_TRUE_P);
		// 自定义表前缀
		// sConfig.setTablePrefix(pConfig.getModuleName() + "_");
		sConfig.setTablePrefix(Constant.STRATEGY_TABLEPREFIX);
		// 需要生成的表(多个表之前使用英文逗号隔开)
		sConfig.setInclude(Constant.STRATEGY_INCLUDE);
		generator.setStrategy(sConfig);

		/**
		 * 配置模板引擎
		 */
		// final FreemarkerTemplateEngine fTemplateEngine = new
		// FreemarkerTemplateEngine();
		// generator.setTemplateEngine(fTemplateEngine);

		/**
		 * 执行
		 */
		generator.execute();

		// 打印注入值
		System.err.println(generator.getCfg().getMap().get("aiyou"));
	}

}
