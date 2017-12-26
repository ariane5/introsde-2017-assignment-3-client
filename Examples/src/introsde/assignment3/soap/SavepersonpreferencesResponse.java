
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savepersonpreferencesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savepersonpreferencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActivityPreference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savepersonpreferencesResponse", propOrder = {
    "idActivityPreference"
})
public class SavepersonpreferencesResponse {

    protected int idActivityPreference;

    /**
     * Gets the value of the idActivityPreference property.
     * 
     */
    public int getIdActivityPreference() {
        return idActivityPreference;
    }

    /**
     * Sets the value of the idActivityPreference property.
     * 
     */
    public void setIdActivityPreference(int value) {
        this.idActivityPreference = value;
    }

}
