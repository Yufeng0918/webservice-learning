package com.dbs.services.hello;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-07-02T11:08:27.332+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "HelloServiceImplService", 
                  wsdlLocation = "http://localhost:8080/helloService?wsdl",
                  targetNamespace = "http://services.dbs.com/") 
public class HelloServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.dbs.com/", "HelloServiceImplService");
    public final static QName HelloServiceImplPort = new QName("http://services.dbs.com/", "HelloServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/helloService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/helloService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort() {
        return super.getPort(HelloServiceImplPort, HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloServiceImplPort, HelloService.class, features);
    }

}
