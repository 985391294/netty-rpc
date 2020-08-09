package com.tqz.netty.rpc.provider;

import com.tqz.netty.rpc.api.IRpcHelloService;

/**
 * @Author: tian
 * @Date: 2020/8/9 14:51
 * @Desc:
 */
public class RpcHelloServiceImpl implements IRpcHelloService {

    public String hello(String name) {  
        return "Hello " + name + "!";  
    }  
  
}  
