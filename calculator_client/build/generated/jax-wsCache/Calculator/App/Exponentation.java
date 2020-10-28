
package App;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "base",
    "exp"
})
@XmlRootElement(name = "exponentation")
public class Exponentation {

    protected Integer base;
    protected Integer exp;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBase(Integer value) {
        this.base = value;
    }

    /**
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExp(Integer value) {
        this.exp = value;
    }

}
