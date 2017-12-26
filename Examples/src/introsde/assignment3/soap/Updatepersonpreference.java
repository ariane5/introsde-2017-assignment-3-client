
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatepersonpreference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatepersonpreference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name=" activity" type="{http://ws.document.introsde/}activityPreference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatepersonpreference", propOrder = {
    "personId",
    "_0020Activity"
})
public class Updatepersonpreference {

    protected int personId;
    @XmlElement(name = " activity")
    protected ActivityPreference _0020Activity;

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
     * Gets the value of the 0020Activity property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityPreference }
     *     
     */
    public ActivityPreference get_0020Activity() {
        return _0020Activity;
    }

    /**
     * Sets the value of the 0020Activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityPreference }
     *     
     */
    public void set_0020Activity(ActivityPreference value) {
        this._0020Activity = value;
    }

}
