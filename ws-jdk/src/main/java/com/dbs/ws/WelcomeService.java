package com.dbs.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WelcomeService {

	@WebMethod
	public String welcome(String name) {
		return "Welcome, " + name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//http://localhost:7075/WelcomeServices?wsdl
		Endpoint.publish("http://localhost:7075/WelcomeServices",
				new WelcomeService());
	}

}
