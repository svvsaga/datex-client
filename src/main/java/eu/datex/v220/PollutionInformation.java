
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollutionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollution" type="{http://datex2.eu/schema/2/2_0}Pollution" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pollutionInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionInformation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pollution",
    "pollutionInformationExtension"
})
public class PollutionInformation
    extends WeatherData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<Pollution> pollution;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType pollutionInformationExtension;

    /**
     * Gets the value of the pollution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pollution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pollution }
     * 
     * 
     */
    public List<Pollution> getPollution() {
        if (pollution == null) {
            pollution = new ArrayList<Pollution>();
        }
        return this.pollution;
    }

    /**
     * Gets the value of the pollutionInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionInformationExtension() {
        return pollutionInformationExtension;
    }

    /**
     * Sets the value of the pollutionInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionInformationExtension(ExtensionType value) {
        this.pollutionInformationExtension = value;
    }

}
