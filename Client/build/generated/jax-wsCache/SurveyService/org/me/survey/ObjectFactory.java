
package org.me.survey;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.survey package. 
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

    private final static QName _SurveyResponse_QNAME = new QName("http://survey.me.org/", "surveyResponse");
    private final static QName _Survey_QNAME = new QName("http://survey.me.org/", "survey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.survey
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SurveyResponse }
     * 
     */
    public SurveyResponse createSurveyResponse() {
        return new SurveyResponse();
    }

    /**
     * Create an instance of {@link Survey }
     * 
     */
    public Survey createSurvey() {
        return new Survey();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurveyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://survey.me.org/", name = "surveyResponse")
    public JAXBElement<SurveyResponse> createSurveyResponse(SurveyResponse value) {
        return new JAXBElement<SurveyResponse>(_SurveyResponse_QNAME, SurveyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Survey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://survey.me.org/", name = "survey")
    public JAXBElement<Survey> createSurvey(Survey value) {
        return new JAXBElement<Survey>(_Survey_QNAME, Survey.class, null, value);
    }

}
