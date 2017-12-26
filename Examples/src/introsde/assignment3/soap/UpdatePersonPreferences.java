
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePersonPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activitypreference" type="{http://ws.document.introsde/}activityPreference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonPreferences", propOrder = {
    "personId",
    "activitypreference"
})
public class UpdatePersonPreferences {

    protected int personId;
    protected ActivityPreference activitypreference;

    /**
     * Gets the value of the personId property.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Gets the value of the activitypreference property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityPreference }
     *     
     */
    public ActivityPreference getActivitypreference() {
        return activitypreference;
    }

    /**
     * Sets the value of the activitypreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityPreference }
     *     
     */
    public void setActivitypreference(ActivityPreference value) {
        this.activitypreference = value;
    }

}
