
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savepersonpreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savepersonpreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name=" activity" type="{http://ws.document.introsde/}activityPreference" minOccurs="0"/>
 *         &lt;element name=" activity_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savepersonpreferences", propOrder = {
    "personId",
    "_0020Activity",
    "_0020ActivityId"
})
public class Savepersonpreferences {

    protected int personId;
    @XmlElement(name = " activity")
    protected ActivityPreference _0020Activity;
    @XmlElement(name = " activity_id")
    protected int _0020ActivityId;

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

    /**
     * Gets the value of the 0020ActivityId property.
     * 
     */
    public int get_0020ActivityId() {
        return _0020ActivityId;
    }

    /**
     * Sets the value of the 0020ActivityId property.
     * 
     */
    public void set_0020ActivityId(int value) {
        this._0020ActivityId = value;
    }

}
