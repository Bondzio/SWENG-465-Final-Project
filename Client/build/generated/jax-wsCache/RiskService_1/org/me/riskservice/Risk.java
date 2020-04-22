
package org.me.riskservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for risk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="risk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cases" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "risk", propOrder = {
    "population",
    "cases"
})
public class Risk {

    protected int population;
    protected int cases;

    /**
     * Gets the value of the population property.
     * 
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     */
    public int getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     */
    public void setCases(int value) {
        this.cases = value;
    }

}
