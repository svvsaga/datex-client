
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc03JunctionPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03JunctionPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="junctionName"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03JunctionPointDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum TpegLoc03JunctionPointDescriptorSubtypeEnum {

    @XmlEnumValue("junctionName")
    JUNCTION_NAME("junctionName");
    private final String value;

    TpegLoc03JunctionPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03JunctionPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03JunctionPointDescriptorSubtypeEnum c: TpegLoc03JunctionPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
