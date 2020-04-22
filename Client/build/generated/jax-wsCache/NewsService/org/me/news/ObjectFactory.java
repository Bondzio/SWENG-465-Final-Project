
package org.me.news;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.news package. 
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

    private final static QName _RandomSafetyTip_QNAME = new QName("http://news.me.org/", "RandomSafetyTip");
    private final static QName _NewsLink_QNAME = new QName("http://news.me.org/", "NewsLink");
    private final static QName _NewsLinkResponse_QNAME = new QName("http://news.me.org/", "NewsLinkResponse");
    private final static QName _RandomSafetyTipResponse_QNAME = new QName("http://news.me.org/", "RandomSafetyTipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.news
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewsLinkResponse }
     * 
     */
    public NewsLinkResponse createNewsLinkResponse() {
        return new NewsLinkResponse();
    }

    /**
     * Create an instance of {@link RandomSafetyTipResponse }
     * 
     */
    public RandomSafetyTipResponse createRandomSafetyTipResponse() {
        return new RandomSafetyTipResponse();
    }

    /**
     * Create an instance of {@link RandomSafetyTip }
     * 
     */
    public RandomSafetyTip createRandomSafetyTip() {
        return new RandomSafetyTip();
    }

    /**
     * Create an instance of {@link NewsLink }
     * 
     */
    public NewsLink createNewsLink() {
        return new NewsLink();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomSafetyTip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://news.me.org/", name = "RandomSafetyTip")
    public JAXBElement<RandomSafetyTip> createRandomSafetyTip(RandomSafetyTip value) {
        return new JAXBElement<RandomSafetyTip>(_RandomSafetyTip_QNAME, RandomSafetyTip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://news.me.org/", name = "NewsLink")
    public JAXBElement<NewsLink> createNewsLink(NewsLink value) {
        return new JAXBElement<NewsLink>(_NewsLink_QNAME, NewsLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://news.me.org/", name = "NewsLinkResponse")
    public JAXBElement<NewsLinkResponse> createNewsLinkResponse(NewsLinkResponse value) {
        return new JAXBElement<NewsLinkResponse>(_NewsLinkResponse_QNAME, NewsLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomSafetyTipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://news.me.org/", name = "RandomSafetyTipResponse")
    public JAXBElement<RandomSafetyTipResponse> createRandomSafetyTipResponse(RandomSafetyTipResponse value) {
        return new JAXBElement<RandomSafetyTipResponse>(_RandomSafetyTipResponse_QNAME, RandomSafetyTipResponse.class, null, value);
    }

}
