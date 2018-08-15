
package com.haihoo.ws.cxf.soap12.hiWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.haihoo.ws.cxf.soap12.hiWS package. 
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

    private final static QName _SysHi_QNAME = new QName("http://soap12.server.cxf.ws.haihoo.com/", "sysHi");
    private final static QName _SysHiResponse_QNAME = new QName("http://soap12.server.cxf.ws.haihoo.com/", "sysHiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.haihoo.ws.cxf.soap12.hiWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SysHi }
     * 
     */
    public SysHi createSysHi() {
        return new SysHi();
    }

    /**
     * Create an instance of {@link SysHiResponse }
     * 
     */
    public SysHiResponse createSysHiResponse() {
        return new SysHiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SysHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap12.server.cxf.ws.haihoo.com/", name = "sysHi")
    public JAXBElement<SysHi> createSysHi(SysHi value) {
        return new JAXBElement<SysHi>(_SysHi_QNAME, SysHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SysHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap12.server.cxf.ws.haihoo.com/", name = "sysHiResponse")
    public JAXBElement<SysHiResponse> createSysHiResponse(SysHiResponse value) {
        return new JAXBElement<SysHiResponse>(_SysHiResponse_QNAME, SysHiResponse.class, null, value);
    }

}
