# mybatis-plus-generator
基于Mybatis-Plus代码生成的项目

> ## 生成后的目录结构如下图：
![MyBatis-Plus的Generator生成代码的树形目录结构](https://raw.githubusercontent.com/Jackson-AndyLau/pictures-storage/master/001/201906/20190615184509.png)

> ## 示例代码内容

<kbd>Employee.java</kbd>
```java
package com.huazai.b2c.aiyou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Company:     b2c哎呦商城
 * Department:  研发一组
 * Title:       [aiyou — Employee模块]
 * Description: [Employee类信息的实体类]
 * Created on:  2017-06-15
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("aiyou_employee")
public class Employee extends Model<Employee>
{

	private static final long serialVersionUID = 1L;

	/**
	 * 主建ID
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 电话号码
	 */
	private String phone;
	/**
	 * 住址
	 */
	private String address;
	/**
	 * 部门ID
	 */
	private Integer deptId;
	/**
	 * 身份证
	 */
	private String idCard;
	/**
	 * 状态，0：删除，1：启用，2：停用
	 */
	private Integer status;

	@Override
	protected Serializable pkVal()
	{
		return this.id;
	}

}

```

<kbd>EmployeeMapper.java</kbd>
```java
package com.huazai.b2c.aiyou.mapper;

import com.huazai.b2c.aiyou.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * Company:     b2c哎呦商城
 * Department:  研发一组
 * Title:       [aiyou — Employee模块]
 * Description: [Employee类信息的dao层接口]
 * Created on:  2017-06-15
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
public interface EmployeeMapper extends BaseMapper<Employee>
{

}

```

<kbd>EmployeeMapper.xml</kbd>
```html
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.huazai.b2c.aiyou.mapper.EmployeeMapper">

	<!-- 通用查询映射结果 -->
	<resultMap id="BaseResultMap"
		type="com.huazai.b2c.aiyou.entity.Employee">
		<id column="id" property="id" />
		<result column="name" property="name" />
		<result column="phone" property="phone" />
		<result column="address" property="address" />
		<result column="dept_id" property="deptId" />
		<result column="id_card" property="idCard" />
		<result column="status" property="status" />
	</resultMap>

	<!-- 通用查询结果列 -->
	<sql id="Base_Column_List">
		id, name, phone, address, dept_id, id_card, status
	</sql>
</mapper>
```

<kbd>EmployeeService.java</kbd>
```java
package com.huazai.b2c.aiyou.service;

import com.huazai.b2c.aiyou.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * Company:     b2c哎呦商城
 * Department:  研发一组
 * Title:       [aiyou — Employee模块]
 * Description: [Employee类信息的service层接口]
 * Created on:  2017-06-15
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
public interface EmployeeService extends IService<Employee>
{
	Page<Employee> selectPageWithParam(Page<Employee> page, Employee param);
}

```

<kbd>EmployeeServiceImpl.java</kbd>
```java
package com.huazai.b2c.aiyou.service.impl;

import com.huazai.b2c.aiyou.entity.Employee;
import com.huazai.b2c.aiyou.mapper.EmployeeMapper;
import com.huazai.b2c.aiyou.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * Company:     b2c哎呦商城
 * Department:  研发一组
 * Title:       [aiyou — Employee模块]
 * Description: [Employee类信息的service层实现类]
 * Created on:  2017-06-15
 * Contacts:    [who.seek.me@java98k.vip]
 *
 * @author huazai
 * @version V1.1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService
{

	@Override
	public Page<Employee> selectPageWithParam(Page<Employee> page, Employee param)
	{
		EntityWrapper<Employee> entityWrapper = new EntityWrapper<>(param);
		Page<Employee> pageEmployee = selectPage(page, entityWrapper);
		return pageEmployee;
	}
}

```

