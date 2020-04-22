
package org.me.riskservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.riskservice package. 
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

    private final static QName _Risk_QNAME = new QName("http://riskService.me.org/", "risk");
    private final static QName _RiskResponse_QNAME = new QName("http://riskService.me.org/", "riskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.riskservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RiskResponse }
     * 
     */
    public RiskResponse createRiskResponse() {
        return new RiskResponse();
    }

    /**
     * Create an instance of {@link Risk }
     * 
     */
    public Risk createRisk() {
        return new Risk();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Risk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://riskService.me.org/", name = "risk")
    public JAXBElement<Risk> createRisk(Risk value) {
        return new JAXBElement<Risk>(_Risk_QNAME, Risk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://riskService.me.org/", name = "riskResponse")
    public JAXBElement<RiskResponse> createRiskResponse(RiskResponse value) {
        return new JAXBElement<RiskResponse>(_RiskResponse_QNAME, RiskResponse.class, null, value);
    }

}
