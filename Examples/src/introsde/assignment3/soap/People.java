
package introsde.assignment3.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.document.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.document.ws.Person>
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "filldb", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.Filldb")
    @ResponseWrapper(localName = "filldbResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.FilldbResponse")
    @Action(input = "http://ws.document.introsde/People/filldbRequest", output = "http://ws.document.introsde/People/filldbResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://ws.document.introsde/People/filldb/Fault/IOException")
    })
    public List<Person> filldb()
        throws IOException_Exception
    ;

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonRequest", output = "http://ws.document.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.document.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPeopleList", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPeopleList")
    @ResponseWrapper(localName = "readPeopleListResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPeopleListResponse")
    @Action(input = "http://ws.document.introsde/People/readPeopleListRequest", output = "http://ws.document.introsde/People/readPeopleListResponse")
    public List<Person> readPeopleList();

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/createPersonRequest", output = "http://ws.document.introsde/People/createPersonResponse")
    public int createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonRequest", output = "http://ws.document.introsde/People/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePersonResponse")
    @Action(input = "http://ws.document.introsde/People/deletePersonRequest", output = "http://ws.document.introsde/People/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Integer> personId);

    /**
     * 
     * @param activitypreference
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonPreferences", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonPreferences")
    @ResponseWrapper(localName = "updatePersonPreferencesResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonPreferencesResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonPreferencesRequest", output = "http://ws.document.introsde/People/updatePersonPreferencesResponse")
    public int updatePersonPreferences(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "activitypreference", targetNamespace = "")
        ActivityPreference activitypreference);

    /**
     * 
     * @param activitypreference
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "savePersonPP", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonPP")
    @ResponseWrapper(localName = "savePersonPPResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonPPResponse")
    @Action(input = "http://ws.document.introsde/People/savePersonPPRequest", output = "http://ws.document.introsde/People/savePersonPPResponse")
    public int savePersonPP(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "activitypreference", targetNamespace = "")
        ActivityPreference activitypreference);

    /**
     * 
     * @param activityId
     * @param personId
     * @return
     *     returns java.util.List<introsde.document.ws.ActivityPreference>
     */
    @WebMethod
    @WebResult(name = "preferences", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPPID", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonPPID")
    @ResponseWrapper(localName = "readPersonPPIDResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonPPIDResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonPPIDRequest", output = "http://ws.document.introsde/People/readPersonPPIDResponse")
    public List<ActivityPreference> readPersonPPID(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "activity_id", targetNamespace = "")
        int activityId);

    /**
     * 
     * @param activity
     * @param personId
     * @return
     *     returns java.util.List<introsde.document.ws.ActivityPreference>
     */
    @WebMethod
    @WebResult(name = "preferences", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPP", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonPP")
    @ResponseWrapper(localName = "readPersonPPResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonPPResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonPPRequest", output = "http://ws.document.introsde/People/readPersonPPResponse")
    public List<ActivityPreference> readPersonPP(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "activity", targetNamespace = "")
        String activity);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.document.ws.ActivityPreference>
     */
    @WebMethod
    @WebResult(name = "preferences", targetNamespace = "")
    @RequestWrapper(localName = "readpreferences", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.Readpreferences")
    @ResponseWrapper(localName = "readpreferencesResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadpreferencesResponse")
    @Action(input = "http://ws.document.introsde/People/readpreferencesRequest", output = "http://ws.document.introsde/People/readpreferencesResponse")
    public List<ActivityPreference> readpreferences();

    /**
     * 
     * @param _0020ActivityId
     * @param personId
     * @param _0020Activity
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "idActivityPreference", targetNamespace = "")
    @RequestWrapper(localName = "savepersonpreferences", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.Savepersonpreferences")
    @ResponseWrapper(localName = "savepersonpreferencesResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavepersonpreferencesResponse")
    @Action(input = "http://ws.document.introsde/People/savepersonpreferencesRequest", output = "http://ws.document.introsde/People/savepersonpreferencesResponse")
    public int savepersonpreferences(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = " activity", targetNamespace = "")
        ActivityPreference _0020Activity,
        @WebParam(name = " activity_id", targetNamespace = "")
        int _0020ActivityId);

    /**
     * 
     * @param personId
     * @param _0020Activity
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "ppId", targetNamespace = "")
    @RequestWrapper(localName = "updatepersonpreference", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.Updatepersonpreference")
    @ResponseWrapper(localName = "updatepersonpreferenceResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatepersonpreferenceResponse")
    @Action(input = "http://ws.document.introsde/People/updatepersonpreferenceRequest", output = "http://ws.document.introsde/People/updatepersonpreferenceResponse")
    public int updatepersonpreference(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = " activity", targetNamespace = "")
        ActivityPreference _0020Activity);

}
