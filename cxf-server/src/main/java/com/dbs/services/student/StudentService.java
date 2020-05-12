package com.dbs.services.student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-07-02T22:04:05.074+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://cxf.student.com/", name = "StudentService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentService {

    @WebMethod
    @WebResult(name = "uploadFileResponse", targetNamespace = "http://cxf.student.com/", partName = "parameters")
    public UploadFileResponse uploadFile(
        @WebParam(partName = "parameters", name = "uploadFileRequest", targetNamespace = "http://cxf.student.com/")
        UploadFile parameters
    );

    @WebMethod
    @WebResult(name = "queryStudentByIdResponse", targetNamespace = "http://cxf.student.com/", partName = "parameters")
    public Student queryStudentById(
        @WebParam(partName = "parameters", name = "queryStudentByIdRequest", targetNamespace = "http://cxf.student.com/")
        QueryStudentByIdRequest parameters
    );

    @WebMethod
    @WebResult(name = "queryStudentsByAddressResponse", targetNamespace = "http://cxf.student.com/", partName = "parameters")
    public ListOfStudent queryStudentByAddress(
        @WebParam(partName = "parameters", name = "queryStudentsByAddressRequest", targetNamespace = "http://cxf.student.com/")
        QueryStudentsByAddressRequest parameters
    );

    @WebMethod
    @WebResult(name = "queryRolesByIdResponse", targetNamespace = "http://cxf.student.com/", partName = "parameters")
    public Role queryRolesById(
        @WebParam(partName = "parameters", name = "queryRolesByIdRequest", targetNamespace = "http://cxf.student.com/")
        QueryRolesByIdRequest parameters
    );
}