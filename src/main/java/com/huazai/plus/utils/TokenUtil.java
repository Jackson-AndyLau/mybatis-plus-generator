package com.huazai.plus.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Base64;

/**
 * @author HuaZai
 * @version V1.0.0
 * @description <li>TokenUtil token工具类
 * @class_name TokenUtil
 * @package com.huazai.plus
 * @created 2017年4月1日 下午6:01:45
 * @contact who.seek.me@java98k.vip
 */
public class TokenUtil {

    public static JSONObject getPlayload(String token) throws UnsupportedEncodingException {
        String play = token.split("\\.")[1];
        String json = new String(Base64.getDecoder().decode(play), "utf-8");
        return JSON.parseObject(json).getJSONObject("playload");
    }

    public static String getUserId(String token) throws UnsupportedEncodingException {
        return getPlayload(token).getString("userId");
    }

    public static String getName(String token) throws UnsupportedEncodingException {
        String name = getPlayload(token).getString("name");
        if (name != null) {
            name = URLDecoder.decode(name, "utf-8");
        }
        return name;
    }

    public static String getUserName(String token) throws UnsupportedEncodingException {
        String username = getPlayload(token).getString("username");
        if (username != null) {
            username = URLDecoder.decode(username, "utf-8");
        }
        return username;
    }

    public static String getDeptId(String token) throws UnsupportedEncodingException {
        return getPlayload(token).getString("deptId");
    }

    public static String getAreaCode(String token) throws UnsupportedEncodingException {
        return getPlayload(token).getString("areaCode");
    }

}
