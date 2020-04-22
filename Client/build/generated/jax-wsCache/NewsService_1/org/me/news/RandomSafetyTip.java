
package org.me.news;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RandomSafetyTip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RandomSafetyTip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SafetyTip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomSafetyTip", propOrder = {
    "safetyTip"
})
public class RandomSafetyTip {

    @XmlElement(name = "SafetyTip")
    protected boolean safetyTip;

    /**
     * Gets the value of the safetyTip property.
     * 
     */
    public boolean isSafetyTip() {
        return safetyTip;
    }

    /**
     * Sets the value of the safetyTip property.
     * 
     */
    public void setSafetyTip(boolean value) {
        this.safetyTip = value;
    }

}
