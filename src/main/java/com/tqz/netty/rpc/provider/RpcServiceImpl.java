package com.tqz.netty.rpc.provider;

import com.tqz.netty.rpc.api.IRpcService;

/**
 * @Author: tian
 * @Date: 2020/8/9 14:50
 * @Desc:
 */
public class RpcServiceImpl implements IRpcService {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
