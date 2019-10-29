
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegPointLocation" type="{http://datex2.eu/schema/2/2_0}TpegPointLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/2/2_0}AlertCPoint" minOccurs="0"/&gt;
 *         &lt;element name="pointAlongLinearElement" type="{http://datex2.eu/schema/2/2_0}PointAlongLinearElement" minOccurs="0"/&gt;
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/2/2_0}PointByCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegPointLocation",
    "alertCPoint",
    "pointAlongLinearElement",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TpegPointLocation tpegPointLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected AlertCPoint alertCPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected PointAlongLinearElement pointAlongLinearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected PointByCoordinates pointByCoordinates;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType pointExtension;

    /**
     * Gets the value of the tpegPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPointLocation }
     *     
     */
    public TpegPointLocation getTpegPointLocation() {
        return tpegPointLocation;
    }

    /**
     * Sets the value of the tpegPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPointLocation }
     *     
     */
    public void setTpegPointLocation(TpegPointLocation value) {
        this.tpegPointLocation = value;
    }

    /**
     * Gets the value of the alertCPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCPoint }
     *     
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Sets the value of the alertCPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCPoint }
     *     
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

    /**
     * Gets the value of the pointAlongLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link PointAlongLinearElement }
     *     
     */
    public PointAlongLinearElement getPointAlongLinearElement() {
        return pointAlongLinearElement;
    }

    /**
     * Sets the value of the pointAlongLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAlongLinearElement }
     *     
     */
    public void setPointAlongLinearElement(PointAlongLinearElement value) {
        this.pointAlongLinearElement = value;
    }

    /**
     * Gets the value of the pointByCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Sets the value of the pointByCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Gets the value of the pointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Sets the value of the pointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointExtension(ExtensionType value) {
        this.pointExtension = value;
    }

}
