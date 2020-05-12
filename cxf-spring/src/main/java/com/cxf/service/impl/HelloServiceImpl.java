package com.cxf.service.impl;

import com.cxf.service.HelloService;

import javax.jws.WebService;

@WebService(targetNamespace = "com.cxf.service")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name;
	}
}
