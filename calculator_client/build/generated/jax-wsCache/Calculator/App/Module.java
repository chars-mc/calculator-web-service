
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
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "a",
    "b"
})
@XmlRootElement(name = "module")
public class Module {

    protected Float a;
    protected Float b;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setA(Float value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setB(Float value) {
        this.b = value;
    }

}
