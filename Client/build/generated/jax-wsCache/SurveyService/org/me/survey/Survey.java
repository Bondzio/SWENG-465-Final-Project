
package org.me.survey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for survey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="survey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fever" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cough" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shortnessOfBreath" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="troubleBreathing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="persistentChestPain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bluishLipsOrFace" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="confusion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "survey", propOrder = {
    "fever",
    "cough",
    "shortnessOfBreath",
    "troubleBreathing",
    "persistentChestPain",
    "bluishLipsOrFace",
    "confusion"
})
public class Survey {

    protected boolean fever;
    protected boolean cough;
    protected boolean shortnessOfBreath;
    protected boolean troubleBreathing;
    protected boolean persistentChestPain;
    protected boolean bluishLipsOrFace;
    protected boolean confusion;

    /**
     * Gets the value of the fever property.
     * 
     */
    public boolean isFever() {
        return fever;
    }

    /**
     * Sets the value of the fever property.
     * 
     */
    public void setFever(boolean value) {
        this.fever = value;
    }

    /**
     * Gets the value of the cough property.
     * 
     */
    public boolean isCough() {
        return cough;
    }

    /**
     * Sets the value of the cough property.
     * 
     */
    public void setCough(boolean value) {
        this.cough = value;
    }

    /**
     * Gets the value of the shortnessOfBreath property.
     * 
     */
    public boolean isShortnessOfBreath() {
        return shortnessOfBreath;
    }

    /**
     * Sets the value of the shortnessOfBreath property.
     * 
     */
    public void setShortnessOfBreath(boolean value) {
        this.shortnessOfBreath = value;
    }

    /**
     * Gets the value of the troubleBreathing property.
     * 
     */
    public boolean isTroubleBreathing() {
        return troubleBreathing;
    }

    /**
     * Sets the value of the troubleBreathing property.
     * 
     */
    public void setTroubleBreathing(boolean value) {
        this.troubleBreathing = value;
    }

    /**
     * Gets the value of the persistentChestPain property.
     * 
     */
    public boolean isPersistentChestPain() {
        return persistentChestPain;
    }

    /**
     * Sets the value of the persistentChestPain property.
     * 
     */
    public void setPersistentChestPain(boolean value) {
        this.persistentChestPain = value;
    }

    /**
     * Gets the value of the bluishLipsOrFace property.
     * 
     */
    public boolean isBluishLipsOrFace() {
        return bluishLipsOrFace;
    }

    /**
     * Sets the value of the bluishLipsOrFace property.
     * 
     */
    public void setBluishLipsOrFace(boolean value) {
        this.bluishLipsOrFace = value;
    }

    /**
     * Gets the value of the confusion property.
     * 
     */
    public boolean isConfusion() {
        return confusion;
    }

    /**
     * Sets the value of the confusion property.
     * 
     */
    public void setConfusion(boolean value) {
        this.confusion = value;
    }

}
