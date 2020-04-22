
package org.me.news;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsLink", propOrder = {
    "cdc"
})
public class NewsLink {

    @XmlElement(name = "CDC")
    protected boolean cdc;

    /**
     * Gets the value of the cdc property.
     * 
     */
    public boolean isCDC() {
        return cdc;
    }

    /**
     * Sets the value of the cdc property.
     * 
     */
    public void setCDC(boolean value) {
        this.cdc = value;
    }

}
