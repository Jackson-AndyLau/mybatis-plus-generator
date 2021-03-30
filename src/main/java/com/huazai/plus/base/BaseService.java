package com.huazai.plus.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 
 * @description
 *              <li>公共BaseService类
 * @class BaseService
 * @package com.huazai.plus.base
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
public interface BaseService<T extends BaseEntity, D extends BaseDto> extends IService<T> {

    /**
     * Description:[单表分页查询]
     *
     * @param dto [实体]
     * @return Page
     * @date 2017年5月1日
     * @author HuaZai
     */
    Page<?> getPageList(D dto);

    /**
     * Description:[根据ID获取实体信息]
     *
     * @param id
     * @return Object
     * @date 2017年5月1日
     * @author HuaZai
     */
    Object getInfoById(String id);

    /**
     * Description:[根据ID删除实体信息]
     *
     * @param id
     * @return boolean
     * @date 2017年5月1日
     * @author HuaZai
     */
    boolean delete(String id);

}

