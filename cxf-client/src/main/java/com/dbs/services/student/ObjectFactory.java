
package com.dbs.services.student;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dbs.services.student package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryStudentByIdRequest_QNAME = new QName("http://cxf.student.com/", "queryStudentByIdRequest");
    private final static QName _QueryStudentByIdResponse_QNAME = new QName("http://cxf.student.com/", "queryStudentByIdResponse");
    private final static QName _QueryStudentsByAddressRequest_QNAME = new QName("http://cxf.student.com/", "queryStudentsByAddressRequest");
    private final static QName _QueryStudentsByAddressResponse_QNAME = new QName("http://cxf.student.com/", "queryStudentsByAddressResponse");
    private final static QName _QueryRolesByIdRequest_QNAME = new QName("http://cxf.student.com/", "queryRolesByIdRequest");
    private final static QName _QueryRolesByIdResponse_QNAME = new QName("http://cxf.student.com/", "queryRolesByIdResponse");
    private final static QName _UploadFileRequest_QNAME = new QName("http://cxf.student.com/", "uploadFileRequest");
    private final static QName _UploadFileResponse_QNAME = new QName("http://cxf.student.com/", "uploadFileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dbs.services.student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryStudentByIdRequest }
     * 
     */
    public QueryStudentByIdRequest createQueryStudentByIdRequest() {
        return new QueryStudentByIdRequest();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link QueryStudentsByAddressRequest }
     * 
     */
    public QueryStudentsByAddressRequest createQueryStudentsByAddressRequest() {
        return new QueryStudentsByAddressRequest();
    }

    /**
     * Create an instance of {@link ListOfStudent }
     * 
     */
    public ListOfStudent createListOfStudent() {
        return new ListOfStudent();
    }

    /**
     * Create an instance of {@link QueryRolesByIdRequest }
     * 
     */
    public QueryRolesByIdRequest createQueryRolesByIdRequest() {
        return new QueryRolesByIdRequest();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link Director }
     * 
     */
    public Director createDirector() {
        return new Director();
    }

    /**
     * Create an instance of {@link Head }
     * 
     */
    public Head createHead() {
        return new Head();
    }

    /**
     * Create an instance of {@link Teacher }
     * 
     */
    public Teacher createTeacher() {
        return new Teacher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryStudentByIdRequest")
    public JAXBElement<QueryStudentByIdRequest> createQueryStudentByIdRequest(QueryStudentByIdRequest value) {
        return new JAXBElement<QueryStudentByIdRequest>(_QueryStudentByIdRequest_QNAME, QueryStudentByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryStudentByIdResponse")
    public JAXBElement<Student> createQueryStudentByIdResponse(Student value) {
        return new JAXBElement<Student>(_QueryStudentByIdResponse_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentsByAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryStudentsByAddressRequest")
    public JAXBElement<QueryStudentsByAddressRequest> createQueryStudentsByAddressRequest(QueryStudentsByAddressRequest value) {
        return new JAXBElement<QueryStudentsByAddressRequest>(_QueryStudentsByAddressRequest_QNAME, QueryStudentsByAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryStudentsByAddressResponse")
    public JAXBElement<ListOfStudent> createQueryStudentsByAddressResponse(ListOfStudent value) {
        return new JAXBElement<ListOfStudent>(_QueryStudentsByAddressResponse_QNAME, ListOfStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRolesByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryRolesByIdRequest")
    public JAXBElement<QueryRolesByIdRequest> createQueryRolesByIdRequest(QueryRolesByIdRequest value) {
        return new JAXBElement<QueryRolesByIdRequest>(_QueryRolesByIdRequest_QNAME, QueryRolesByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "queryRolesByIdResponse")
    public JAXBElement<Role> createQueryRolesByIdResponse(Role value) {
        return new JAXBElement<Role>(_QueryRolesByIdResponse_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "uploadFileRequest")
    public JAXBElement<UploadFile> createUploadFileRequest(UploadFile value) {
        return new JAXBElement<UploadFile>(_UploadFileRequest_QNAME, UploadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.student.com/", name = "uploadFileResponse")
    public JAXBElement<UploadFileResponse> createUploadFileResponse(UploadFileResponse value) {
        return new JAXBElement<UploadFileResponse>(_UploadFileResponse_QNAME, UploadFileResponse.class, null, value);
    }

}
