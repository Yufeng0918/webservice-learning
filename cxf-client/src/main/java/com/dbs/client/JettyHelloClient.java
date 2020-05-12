package com.dbs.client;

import com.dbs.services.hello.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by ribbo on 6/29/2017.
 */
public class JettyHelloClient {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloService.class);
        factory.setAddress("http://localhost:8080/helloService");
        HelloService helloService = (HelloService) factory.create();
        System.out.println(helloService.sayHello("username", "address", "school"));
    }
}
