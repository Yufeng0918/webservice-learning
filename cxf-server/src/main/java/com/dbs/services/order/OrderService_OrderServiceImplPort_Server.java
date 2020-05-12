
package com.dbs.services.order;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-07-02T14:03:39.010+08:00
 * Generated source version: 3.1.10
 * 
 */
 
public class OrderService_OrderServiceImplPort_Server{

    protected OrderService_OrderServiceImplPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new OrderServiceImplPortImpl();
        String address = "http://localhost:8080/orderService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new OrderService_OrderServiceImplPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
    }
}
