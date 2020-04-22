
package org.me.statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.statistics package. 
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

    private final static QName _GetCountryData_QNAME = new QName("http://statistics.me.org/", "getCountryData");
    private final static QName _GetMostNewCases_QNAME = new QName("http://statistics.me.org/", "getMostNewCases");
    private final static QName _GetMostInfected_QNAME = new QName("http://statistics.me.org/", "getMostInfected");
    private final static QName _GetMostInfectedResponse_QNAME = new QName("http://statistics.me.org/", "getMostInfectedResponse");
    private final static QName _GetGlobalDataResponse_QNAME = new QName("http://statistics.me.org/", "getGlobalDataResponse");
    private final static QName _GetMostDeathsResponse_QNAME = new QName("http://statistics.me.org/", "getMostDeathsResponse");
    private final static QName _GetMostNewCasesResponse_QNAME = new QName("http://statistics.me.org/", "getMostNewCasesResponse");
    private final static QName _GetCountryDataResponse_QNAME = new QName("http://statistics.me.org/", "getCountryDataResponse");
    private final static QName _GetGlobalData_QNAME = new QName("http://statistics.me.org/", "getGlobalData");
    private final static QName _GetMostDeaths_QNAME = new QName("http://statistics.me.org/", "getMostDeaths");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.statistics
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGlobalDataResponse }
     * 
     */
    public GetGlobalDataResponse createGetGlobalDataResponse() {
        return new GetGlobalDataResponse();
    }

    /**
     * Create an instance of {@link GetMostInfectedResponse }
     * 
     */
    public GetMostInfectedResponse createGetMostInfectedResponse() {
        return new GetMostInfectedResponse();
    }

    /**
     * Create an instance of {@link GetMostInfected }
     * 
     */
    public GetMostInfected createGetMostInfected() {
        return new GetMostInfected();
    }

    /**
     * Create an instance of {@link GetMostNewCases }
     * 
     */
    public GetMostNewCases createGetMostNewCases() {
        return new GetMostNewCases();
    }

    /**
     * Create an instance of {@link GetCountryData }
     * 
     */
    public GetCountryData createGetCountryData() {
        return new GetCountryData();
    }

    /**
     * Create an instance of {@link GetGlobalData }
     * 
     */
    public GetGlobalData createGetGlobalData() {
        return new GetGlobalData();
    }

    /**
     * Create an instance of {@link GetMostDeaths }
     * 
     */
    public GetMostDeaths createGetMostDeaths() {
        return new GetMostDeaths();
    }

    /**
     * Create an instance of {@link GetCountryDataResponse }
     * 
     */
    public GetCountryDataResponse createGetCountryDataResponse() {
        return new GetCountryDataResponse();
    }

    /**
     * Create an instance of {@link GetMostDeathsResponse }
     * 
     */
    public GetMostDeathsResponse createGetMostDeathsResponse() {
        return new GetMostDeathsResponse();
    }

    /**
     * Create an instance of {@link GetMostNewCasesResponse }
     * 
     */
    public GetMostNewCasesResponse createGetMostNewCasesResponse() {
        return new GetMostNewCasesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getCountryData")
    public JAXBElement<GetCountryData> createGetCountryData(GetCountryData value) {
        return new JAXBElement<GetCountryData>(_GetCountryData_QNAME, GetCountryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostNewCases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostNewCases")
    public JAXBElement<GetMostNewCases> createGetMostNewCases(GetMostNewCases value) {
        return new JAXBElement<GetMostNewCases>(_GetMostNewCases_QNAME, GetMostNewCases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostInfected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostInfected")
    public JAXBElement<GetMostInfected> createGetMostInfected(GetMostInfected value) {
        return new JAXBElement<GetMostInfected>(_GetMostInfected_QNAME, GetMostInfected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostInfectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostInfectedResponse")
    public JAXBElement<GetMostInfectedResponse> createGetMostInfectedResponse(GetMostInfectedResponse value) {
        return new JAXBElement<GetMostInfectedResponse>(_GetMostInfectedResponse_QNAME, GetMostInfectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGlobalDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getGlobalDataResponse")
    public JAXBElement<GetGlobalDataResponse> createGetGlobalDataResponse(GetGlobalDataResponse value) {
        return new JAXBElement<GetGlobalDataResponse>(_GetGlobalDataResponse_QNAME, GetGlobalDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostDeathsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostDeathsResponse")
    public JAXBElement<GetMostDeathsResponse> createGetMostDeathsResponse(GetMostDeathsResponse value) {
        return new JAXBElement<GetMostDeathsResponse>(_GetMostDeathsResponse_QNAME, GetMostDeathsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostNewCasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostNewCasesResponse")
    public JAXBElement<GetMostNewCasesResponse> createGetMostNewCasesResponse(GetMostNewCasesResponse value) {
        return new JAXBElement<GetMostNewCasesResponse>(_GetMostNewCasesResponse_QNAME, GetMostNewCasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getCountryDataResponse")
    public JAXBElement<GetCountryDataResponse> createGetCountryDataResponse(GetCountryDataResponse value) {
        return new JAXBElement<GetCountryDataResponse>(_GetCountryDataResponse_QNAME, GetCountryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGlobalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getGlobalData")
    public JAXBElement<GetGlobalData> createGetGlobalData(GetGlobalData value) {
        return new JAXBElement<GetGlobalData>(_GetGlobalData_QNAME, GetGlobalData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMostDeaths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.me.org/", name = "getMostDeaths")
    public JAXBElement<GetMostDeaths> createGetMostDeaths(GetMostDeaths value) {
        return new JAXBElement<GetMostDeaths>(_GetMostDeaths_QNAME, GetMostDeaths.class, null, value);
    }

}
