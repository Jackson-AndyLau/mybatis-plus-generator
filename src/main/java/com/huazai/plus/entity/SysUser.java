package com.huazai.plus.entity;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 
 * @description
 *              <li>系统用户类
 * @class SysUser
 * @package com.huazai.plus.entity
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Data
@ToString
@Builder
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel
public class SysUser {

    private String userId;
    private String name;
    private String username;
    private String deptId;
    private String areaCode;
    private String digest;
}
