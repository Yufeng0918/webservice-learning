package com.dbs.services.person;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-07-02T12:36:52.017+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://services.dbs.com/", name = "PersonService")
@XmlSeeAlso({ObjectFactory.class})
public interface PersonService {

    @WebMethod
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://services.dbs.com/", className = "com.dbs.services.person.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://services.dbs.com/", className = "com.dbs.services.person.GetPersonResponse")
    @WebResult(name = "personResult", targetNamespace = "")
    public java.util.List<com.dbs.services.person.Person> getPerson();
}
