package com.bp.server;

import com.bp.service.CustomerService;
import com.bp.service.impl.CustomerServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;




public class CustomerServiceServer {

	public static void main(String[] args) {
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		factory.setResourceClasses(CustomerService.class);
		factory.setResourceProvider(CustomerService.class,
				new SingletonResourceProvider(new CustomerServiceImpl()));
		
		factory.setAddress("http://localhost:8080");
		factory.create();
	}
}