package com.bp.server;

import com.bp.service.impl.PersonServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;


public class PersonServiceServer {

	public static void main(String[] args) {
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		factory.setAddress("http://localhost:8080/rest/cxf");
		factory.setResourceClasses(PersonServiceImpl.class);

		factory.create();
	}
}