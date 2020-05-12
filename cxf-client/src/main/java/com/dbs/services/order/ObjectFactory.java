
package com.dbs.services.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dbs.services.order package. 
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

    private final static QName _QueryByProductNameRequest_QNAME = new QName("http://cxf.order.com/", "queryByProductNameRequest");
    private final static QName _QueryByProductNameResponse_QNAME = new QName("http://cxf.order.com/", "queryByProductNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dbs.services.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryByProductName }
     * 
     */
    public QueryByProductName createQueryByProductName() {
        return new QueryByProductName();
    }

    /**
     * Create an instance of {@link QueryByProductNameResponse }
     * 
     */
    public QueryByProductNameResponse createQueryByProductNameResponse() {
        return new QueryByProductNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByProductName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.order.com/", name = "queryByProductNameRequest")
    public JAXBElement<QueryByProductName> createQueryByProductNameRequest(QueryByProductName value) {
        return new JAXBElement<QueryByProductName>(_QueryByProductNameRequest_QNAME, QueryByProductName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByProductNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.order.com/", name = "queryByProductNameResponse")
    public JAXBElement<QueryByProductNameResponse> createQueryByProductNameResponse(QueryByProductNameResponse value) {
        return new JAXBElement<QueryByProductNameResponse>(_QueryByProductNameResponse_QNAME, QueryByProductNameResponse.class, null, value);
    }

}
