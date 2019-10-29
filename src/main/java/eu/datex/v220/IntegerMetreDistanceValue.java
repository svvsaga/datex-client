
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegerMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegerMetreDistanceValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="integerMetreDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="integerMetreDistanceValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerMetreDistanceValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "integerMetreDistance",
    "integerMetreDistanceValueExtension"
})
public class IntegerMetreDistanceValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger integerMetreDistance;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType integerMetreDistanceValueExtension;

    /**
     * Gets the value of the integerMetreDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerMetreDistance() {
        return integerMetreDistance;
    }

    /**
     * Sets the value of the integerMetreDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerMetreDistance(BigInteger value) {
        this.integerMetreDistance = value;
    }

    /**
     * Gets the value of the integerMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIntegerMetreDistanceValueExtension() {
        return integerMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the integerMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIntegerMetreDistanceValueExtension(ExtensionType value) {
        this.integerMetreDistanceValueExtension = value;
    }

}
