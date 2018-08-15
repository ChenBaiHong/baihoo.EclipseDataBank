
package com.baihoo.ws.personWS;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://server2.publish.ws.baihoo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://server2.publish.ws.baihoo.com/", className = "com.baihoo.ws.personWS.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://server2.publish.ws.baihoo.com/", className = "com.baihoo.ws.personWS.AddPersonResponse")
    @Action(input = "http://server2.publish.ws.baihoo.com/PersonService/addPersonRequest", output = "http://server2.publish.ws.baihoo.com/PersonService/addPersonResponse")
    public void addPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Person arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.baihoo.ws.personWS.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonAll", targetNamespace = "http://server2.publish.ws.baihoo.com/", className = "com.baihoo.ws.personWS.GetPersonAll")
    @ResponseWrapper(localName = "getPersonAllResponse", targetNamespace = "http://server2.publish.ws.baihoo.com/", className = "com.baihoo.ws.personWS.GetPersonAllResponse")
    @Action(input = "http://server2.publish.ws.baihoo.com/PersonService/getPersonAllRequest", output = "http://server2.publish.ws.baihoo.com/PersonService/getPersonAllResponse")
    public List<Person> getPersonAll();

}
