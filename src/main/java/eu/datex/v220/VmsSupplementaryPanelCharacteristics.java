
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsSupplementaryPanelCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsSupplementaryPanelCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPictogramCodeListIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelPixelsAcross" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelPixelsDown" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelDisplayHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelDisplayWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelPositionX" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPanelPositionY" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="relativePositionToPictogramArea" type="{http://datex2.eu/schema/2/2_0}PositionRelativeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsSupplementaryPanelCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsSupplementaryPanelCharacteristics", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "supplementaryPictogramCodeListIdentifier",
    "supplementaryPanelPixelsAcross",
    "supplementaryPanelPixelsDown",
    "supplementaryPanelDisplayHeight",
    "supplementaryPanelDisplayWidth",
    "supplementaryPanelPositionX",
    "supplementaryPanelPositionY",
    "relativePositionToPictogramArea",
    "vmsSupplementaryPanelCharacteristicsExtension"
})
public class VmsSupplementaryPanelCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String supplementaryPictogramCodeListIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplementaryPanelPixelsAcross;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supplementaryPanelPixelsDown;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float supplementaryPanelDisplayHeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float supplementaryPanelDisplayWidth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float supplementaryPanelPositionX;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float supplementaryPanelPositionY;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected PositionRelativeEnum relativePositionToPictogramArea;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsSupplementaryPanelCharacteristicsExtension;

    /**
     * Gets the value of the supplementaryPictogramCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryPictogramCodeListIdentifier() {
        return supplementaryPictogramCodeListIdentifier;
    }

    /**
     * Sets the value of the supplementaryPictogramCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryPictogramCodeListIdentifier(String value) {
        this.supplementaryPictogramCodeListIdentifier = value;
    }

    /**
     * Gets the value of the supplementaryPanelPixelsAcross property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplementaryPanelPixelsAcross() {
        return supplementaryPanelPixelsAcross;
    }

    /**
     * Sets the value of the supplementaryPanelPixelsAcross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplementaryPanelPixelsAcross(BigInteger value) {
        this.supplementaryPanelPixelsAcross = value;
    }

    /**
     * Gets the value of the supplementaryPanelPixelsDown property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplementaryPanelPixelsDown() {
        return supplementaryPanelPixelsDown;
    }

    /**
     * Sets the value of the supplementaryPanelPixelsDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplementaryPanelPixelsDown(BigInteger value) {
        this.supplementaryPanelPixelsDown = value;
    }

    /**
     * Gets the value of the supplementaryPanelDisplayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplementaryPanelDisplayHeight() {
        return supplementaryPanelDisplayHeight;
    }

    /**
     * Sets the value of the supplementaryPanelDisplayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplementaryPanelDisplayHeight(Float value) {
        this.supplementaryPanelDisplayHeight = value;
    }

    /**
     * Gets the value of the supplementaryPanelDisplayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplementaryPanelDisplayWidth() {
        return supplementaryPanelDisplayWidth;
    }

    /**
     * Sets the value of the supplementaryPanelDisplayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplementaryPanelDisplayWidth(Float value) {
        this.supplementaryPanelDisplayWidth = value;
    }

    /**
     * Gets the value of the supplementaryPanelPositionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplementaryPanelPositionX() {
        return supplementaryPanelPositionX;
    }

    /**
     * Sets the value of the supplementaryPanelPositionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplementaryPanelPositionX(Float value) {
        this.supplementaryPanelPositionX = value;
    }

    /**
     * Gets the value of the supplementaryPanelPositionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplementaryPanelPositionY() {
        return supplementaryPanelPositionY;
    }

    /**
     * Sets the value of the supplementaryPanelPositionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplementaryPanelPositionY(Float value) {
        this.supplementaryPanelPositionY = value;
    }

    /**
     * Gets the value of the relativePositionToPictogramArea property.
     * 
     * @return
     *     possible object is
     *     {@link PositionRelativeEnum }
     *     
     */
    public PositionRelativeEnum getRelativePositionToPictogramArea() {
        return relativePositionToPictogramArea;
    }

    /**
     * Sets the value of the relativePositionToPictogramArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionRelativeEnum }
     *     
     */
    public void setRelativePositionToPictogramArea(PositionRelativeEnum value) {
        this.relativePositionToPictogramArea = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPanelCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsSupplementaryPanelCharacteristicsExtension() {
        return vmsSupplementaryPanelCharacteristicsExtension;
    }

    /**
     * Sets the value of the vmsSupplementaryPanelCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsSupplementaryPanelCharacteristicsExtension(ExtensionType value) {
        this.vmsSupplementaryPanelCharacteristicsExtension = value;
    }

}
