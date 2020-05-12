package com.dbs.services.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-07-02T14:03:38.994+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://cxf.order.com/", name = "OrderService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderService {

    @WebMethod
    @WebResult(name = "queryByProductNameResponse", targetNamespace = "http://cxf.order.com/", partName = "parameters")
    public QueryByProductNameResponse queryByProductName(
        @WebParam(partName = "parameters", name = "queryByProductNameRequest", targetNamespace = "http://cxf.order.com/")
        QueryByProductName parameters
    );
}
