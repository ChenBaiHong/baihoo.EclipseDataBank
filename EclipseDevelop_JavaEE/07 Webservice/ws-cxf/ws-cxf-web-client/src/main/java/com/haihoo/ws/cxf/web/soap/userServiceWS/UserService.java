package com.haihoo.ws.cxf.web.soap.userServiceWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.16
 * 2018-07-18T02:07:14.191+08:00
 * Generated source version: 3.0.16
 * 
 */
@WebService(targetNamespace = "http://server.cxf.web.baihoo.com/", name = "UserService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserService {

    @WebMethod
    @RequestWrapper(localName = "setUser", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.SetUser")
    @ResponseWrapper(localName = "setUserResponse", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.SetUserResponse")
    public void setUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.haihoo.ws.cxf.web.soap.userServiceWS.User arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUserByName", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.GetUserByName")
    @ResponseWrapper(localName = "getUserByNameResponse", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.GetUserByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.haihoo.ws.cxf.web.soap.userServiceWS.User getUserByName(
        @WebParam(name = "uName", targetNamespace = "")
        java.lang.String uName
    );

    @WebMethod
    @RequestWrapper(localName = "findByAll", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.FindByAll")
    @ResponseWrapper(localName = "findByAllResponse", targetNamespace = "http://server.cxf.web.baihoo.com/", className = "com.haihoo.ws.cxf.web.soap.userServiceWS.FindByAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.haihoo.ws.cxf.web.soap.userServiceWS.User> findByAll();
}
