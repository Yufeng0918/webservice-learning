package com.dbs.services.impl;

import com.dbs.services.HelloService;

import javax.jws.WebService;

@WebService(targetNamespace = "http://services.dbs.com/")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String username, String address, String school) {

		System.out.println("sayHello is invoked!");
		String result = "hello: " + username + ", your info is: " + address
				+ ", " + school;
		return result;
	}
}
