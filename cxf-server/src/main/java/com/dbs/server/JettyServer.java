package com.dbs.server;

import com.dbs.services.impl.HelloServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class JettyServer {

	public static void main(String[] args) {

		// Create WS Server Factory-
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

		// Set Service class and URL
		factory.setServiceClass(HelloServiceImpl.class);
		factory.setAddress("http://localhost:8080/helloService");

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		// Create Server from factory and startup
		Server server = factory.create();
		server.start();
	}
}
