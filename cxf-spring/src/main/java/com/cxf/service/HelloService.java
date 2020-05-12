package com.cxf.service;


import javax.jws.WebService;

@WebService(targetNamespace = "com.cxf.service")
public interface HelloService {

	public String sayHello(String name);
}
