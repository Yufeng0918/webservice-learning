package com.dbs.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.transport.common.gzip.GZIPInInterceptor;
import org.apache.cxf.transport.common.gzip.GZIPOutInterceptor;

import com.dbs.services.impl.PersonServiceImpl;



public class DataCompressServer {
	
	public static void main(String[] args) {
		
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		
		factory.setAddress("http://localhost:8080/personService");
		factory.setServiceClass(PersonServiceImpl.class);
		
		factory.getInInterceptors().add(new GZIPInInterceptor());
		factory.getInInterceptors().add(new LoggingInInterceptor());

		factory.getOutInterceptors().add(new GZIPOutInterceptor(0));
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		
		Server server = factory.create();
		server.start();
	}
}
