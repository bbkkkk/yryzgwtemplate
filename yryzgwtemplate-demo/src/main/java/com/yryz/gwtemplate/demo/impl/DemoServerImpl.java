/**
 *
 */
package com.yryz.gwtemplate.demo.impl;

import com.alibaba.fastjson.JSONObject;
import com.kgw.annotation.KgwRegister;
import com.kgw.api.KgwApi;
import com.yryz.gwtemplate.demo.DemoServer;


import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lixiaokang
 * @email lixiaokang@163.com
 * @date 2016年10月23日 下午1:31:47
 */
public class DemoServerImpl implements DemoServer {


    @KgwRegister(gwindex = "bbb", gwname = "initcase", checkSession = true, expireTime = 30000, developer = "lixiaokang")
    public JSONObject sayHello(Map<String, Object> params) {

        System.err.println("server:这是收到的客户端数据：" + params);
        //加个标记
//		str=str+"-（来自服务端的标记）";
        params.put("str_", "-（来自服务端的标记）");
        params.put("rstcode", "120");
        System.err.println("server:这是返回客户端的数据：" + params);
        return (JSONObject) JSONObject.toJSON(params);
    }
}
