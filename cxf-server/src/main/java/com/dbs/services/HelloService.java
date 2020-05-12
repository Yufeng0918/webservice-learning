package com.dbs.services;

import javax.jws.WebService;

@WebService(targetNamespace = "http://services.dbs.com/")
public interface HelloService {

	public String sayHello(String username, String address, String school);
}
