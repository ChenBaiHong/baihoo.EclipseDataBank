
package com.haihoo.ws.cxf.web.soap.userService2WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.haihoo.ws.cxf.web.soap.userService2WS package. 
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

    private final static QName _GetUserByName_QNAME = new QName("http://server2.cxf.web.baihoo.com/", "getUserByName");
    private final static QName _GetUserByNameResponse_QNAME = new QName("http://server2.cxf.web.baihoo.com/", "getUserByNameResponse");
    private final static QName _SetUser_QNAME = new QName("http://server2.cxf.web.baihoo.com/", "setUser");
    private final static QName _SetUserResponse_QNAME = new QName("http://server2.cxf.web.baihoo.com/", "setUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.haihoo.ws.cxf.web.soap.userService2WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserByName }
     * 
     */
    public GetUserByName createGetUserByName() {
        return new GetUserByName();
    }

    /**
     * Create an instance of {@link GetUserByNameResponse }
     * 
     */
    public GetUserByNameResponse createGetUserByNameResponse() {
        return new GetUserByNameResponse();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link SetUserResponse }
     * 
     */
    public SetUserResponse createSetUserResponse() {
        return new SetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server2.cxf.web.baihoo.com/", name = "getUserByName")
    public JAXBElement<GetUserByName> createGetUserByName(GetUserByName value) {
        return new JAXBElement<GetUserByName>(_GetUserByName_QNAME, GetUserByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server2.cxf.web.baihoo.com/", name = "getUserByNameResponse")
    public JAXBElement<GetUserByNameResponse> createGetUserByNameResponse(GetUserByNameResponse value) {
        return new JAXBElement<GetUserByNameResponse>(_GetUserByNameResponse_QNAME, GetUserByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server2.cxf.web.baihoo.com/", name = "setUser")
    public JAXBElement<SetUser> createSetUser(SetUser value) {
        return new JAXBElement<SetUser>(_SetUser_QNAME, SetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server2.cxf.web.baihoo.com/", name = "setUserResponse")
    public JAXBElement<SetUserResponse> createSetUserResponse(SetUserResponse value) {
        return new JAXBElement<SetUserResponse>(_SetUserResponse_QNAME, SetUserResponse.class, null, value);
    }

}
