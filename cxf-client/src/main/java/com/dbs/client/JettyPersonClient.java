package com.dbs.client;

import com.dbs.services.hello.HelloService;
import com.dbs.services.person.PersonService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by ribbo on 6/29/2017.
 */
public class JettyPersonClient {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(PersonService.class);
        factory.setAddress("http://localhost:8080/personService");
        PersonService personService = (PersonService) factory.create();
        personService.getPerson().forEach(person-> System.out.println(person.toString()));
    }
}
