
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvolvementRolesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvolvementRolesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cyclist"/&gt;
 *     &lt;enumeration value="pedestrian"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="vehicleDriver"/&gt;
 *     &lt;enumeration value="vehicleOccupant"/&gt;
 *     &lt;enumeration value="vehiclePassenger"/&gt;
 *     &lt;enumeration value="witness"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvolvementRolesEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum InvolvementRolesEnum {

    @XmlEnumValue("cyclist")
    CYCLIST("cyclist"),
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vehicleDriver")
    VEHICLE_DRIVER("vehicleDriver"),
    @XmlEnumValue("vehicleOccupant")
    VEHICLE_OCCUPANT("vehicleOccupant"),
    @XmlEnumValue("vehiclePassenger")
    VEHICLE_PASSENGER("vehiclePassenger"),
    @XmlEnumValue("witness")
    WITNESS("witness");
    private final String value;

    InvolvementRolesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvolvementRolesEnum fromValue(String v) {
        for (InvolvementRolesEnum c: InvolvementRolesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
