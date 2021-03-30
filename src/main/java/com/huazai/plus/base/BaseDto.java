package com.huazai.plus.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 
 * @description
 *              <li>公共BaseDto类
 * @class BaseDto
 * @package com.huazai.plus.base
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class BaseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "每页大小")
    private long size = 10;

    @ApiModelProperty(value = "当前页")
    private long current = 1;

    @ApiModelProperty(value = "主键ID")
    private String id;
}
