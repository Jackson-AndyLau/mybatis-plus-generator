package com.huazai.plus.base;

import com.huazai.plus.annotation.LogOperate;
import com.huazai.plus.response.ResponseData;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 
 * @description
 *              <li>公共Controller类
 * @class BaseController
 * @package com.huazai.plus.base
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class BaseController<S extends BaseService<T, D>, T extends BaseEntity, D extends BaseDto> extends BasicController{

    protected static final String MODULE = "NOMODULE";

    @Autowired
    protected S baseService;

    /**
     * Description:[单表分页查询]
     *
     * @param dto [实体]
     * @return Page
     * @date 2017年5月1日
     * @author HuaZai
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "单表分页查询", httpMethod = "POST", response = ResponseData.class)
    @LogOperate(function = "getPageList()", module = MODULE,description = "单表分页查询")
    public ResponseData getPageList(@RequestBody D dto) {
    	
        return ResponseData.success(baseService.getPageList(dto));
    }
    


    /**
     * Description:[根据ID获取实体数据信息]
     *
     * @param entity [实体]
     * @return ResponseData
     * @date 2017年5月1日
     * @author HuaZai
     */
    @GetMapping(value = "/getInfoById")
    @ApiOperation(value = "根据ID获取实体数据信息", httpMethod = "GET", response = ResponseData.class)
    @LogOperate(function = "getInfoById()", module = MODULE,description = "根据ID获取实体数据信息")
    public ResponseData getInfoById(String id) {
    	
        return ResponseData.success(baseService.getInfoById(id));
    }

    /**
     * Description:[新增实体数据信息]
     *
     * @param entity [实体]
     * @return ResponseData
     * @date 2017年5月1日
     * @author HuaZai
     */
    @PostMapping(value = "/save")
    @ApiOperation(value = "新增实体数据信息", httpMethod = "POST", response = ResponseData.class)
    @LogOperate(function = "save()", module = MODULE,description = "新增实体数据信息")
    public ResponseData save(@RequestBody @Valid T entity,BindingResult bindingResult) throws Exception {
    	
        // 校验通过
        if (!bindingResult.hasErrors()) {
            return baseService.save(entity) ? ResponseData.success() : ResponseData.failure();
        } else {
            return ResponseData.failure(bindingResult);
        }
    }

    /**
     * Description:[修改实体数据信息]
     *
     * @param entity [实体]
     * @return ResponseData
     * @date 2017年5月1日
     * @author HuaZai
     */
    @PutMapping(value = "/updateById")
    @ApiOperation(value = "修改实体数据信息", httpMethod = "PUT", response = ResponseData.class)
    @LogOperate(function = "updateById()", module = MODULE,description = "修改实体数据信息")
    public ResponseData updateById(@RequestBody T entity) throws Exception {
    	
        return baseService.updateById(entity) ? ResponseData.success() : ResponseData.failure();
    }

    /**
     * Description:[根据ID删除实体信息]
     *
     * @param id [ID]
     * @return ResponseData
     * @date 2017年5月1日
     * @author HuaZai
     */
    @DeleteMapping(value = "/deleteById")
    @ApiOperation(value = "根据ID删除实体信息", httpMethod = "DELETE", response = ResponseData.class)
    @LogOperate(function = "deleteById()", module = MODULE,description = "根据ID删除实体信息")
    public ResponseData deleteById(String id) {
    	
        return baseService.delete(id) ? ResponseData.success() : ResponseData.failure();
    }
}
