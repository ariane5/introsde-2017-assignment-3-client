
package introsde.assignment3.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.document.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadPeopleListResponse_QNAME = new QName("http://ws.document.introsde/", "readPeopleListResponse");
    private final static QName _UpdatepersonpreferenceResponse_QNAME = new QName("http://ws.document.introsde/", "updatepersonpreferenceResponse");
    private final static QName _FilldbResponse_QNAME = new QName("http://ws.document.introsde/", "filldbResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.document.introsde/", "deletePersonResponse");
    private final static QName _ReadPersonPPResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonPPResponse");
    private final static QName _Filldb_QNAME = new QName("http://ws.document.introsde/", "filldb");
    private final static QName _Type_QNAME = new QName("http://ws.document.introsde/", "type");
    private final static QName _ReadPersonPPIDResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonPPIDResponse");
    private final static QName _Updatepersonpreference_QNAME = new QName("http://ws.document.introsde/", "updatepersonpreference");
    private final static QName _UpdatePersonPreferencesResponse_QNAME = new QName("http://ws.document.introsde/", "updatePersonPreferencesResponse");
    private final static QName _ReadPersonPPID_QNAME = new QName("http://ws.document.introsde/", "readPersonPPID");
    private final static QName _Readpreferences_QNAME = new QName("http://ws.document.introsde/", "readpreferences");
    private final static QName _UpdatePersonPreferences_QNAME = new QName("http://ws.document.introsde/", "updatePersonPreferences");
    private final static QName _ReadpreferencesResponse_QNAME = new QName("http://ws.document.introsde/", "readpreferencesResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.document.introsde/", "updatePerson");
    private final static QName _Activitypreference_QNAME = new QName("http://ws.document.introsde/", "activitypreference");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.document.introsde/", "updatePersonResponse");
    private final static QName _Savepersonpreferences_QNAME = new QName("http://ws.document.introsde/", "savepersonpreferences");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonResponse");
    private final static QName _Person_QNAME = new QName("http://ws.document.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.document.introsde/", "readPerson");
    private final static QName _SavepersonpreferencesResponse_QNAME = new QName("http://ws.document.introsde/", "savepersonpreferencesResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.document.introsde/", "createPerson");
    private final static QName _ReadPeopleList_QNAME = new QName("http://ws.document.introsde/", "readPeopleList");
    private final static QName _IOException_QNAME = new QName("http://ws.document.introsde/", "IOException");
    private final static QName _SavePersonPPResponse_QNAME = new QName("http://ws.document.introsde/", "savePersonPPResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.document.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.document.introsde/", "createPersonResponse");
    private final static QName _SavePersonPP_QNAME = new QName("http://ws.document.introsde/", "savePersonPP");
    private final static QName _ReadPersonPP_QNAME = new QName("http://ws.document.introsde/", "readPersonPP");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.document.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Updatepersonpreference }
     * 
     */
    public Updatepersonpreference createUpdatepersonpreference() {
        return new Updatepersonpreference();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferencesResponse }
     * 
     */
    public UpdatePersonPreferencesResponse createUpdatePersonPreferencesResponse() {
        return new UpdatePersonPreferencesResponse();
    }

    /**
     * Create an instance of {@link ReadPersonPPResponse }
     * 
     */
    public ReadPersonPPResponse createReadPersonPPResponse() {
        return new ReadPersonPPResponse();
    }

    /**
     * Create an instance of {@link Filldb }
     * 
     */
    public Filldb createFilldb() {
        return new Filldb();
    }

    /**
     * Create an instance of {@link ReadPersonPPIDResponse }
     * 
     */
    public ReadPersonPPIDResponse createReadPersonPPIDResponse() {
        return new ReadPersonPPIDResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPeopleListResponse }
     * 
     */
    public ReadPeopleListResponse createReadPeopleListResponse() {
        return new ReadPeopleListResponse();
    }

    /**
     * Create an instance of {@link UpdatepersonpreferenceResponse }
     * 
     */
    public UpdatepersonpreferenceResponse createUpdatepersonpreferenceResponse() {
        return new UpdatepersonpreferenceResponse();
    }

    /**
     * Create an instance of {@link FilldbResponse }
     * 
     */
    public FilldbResponse createFilldbResponse() {
        return new FilldbResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonPP }
     * 
     */
    public SavePersonPP createSavePersonPP() {
        return new SavePersonPP();
    }

    /**
     * Create an instance of {@link ReadPersonPP }
     * 
     */
    public ReadPersonPP createReadPersonPP() {
        return new ReadPersonPP();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadPeopleList }
     * 
     */
    public ReadPeopleList createReadPeopleList() {
        return new ReadPeopleList();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link SavePersonPPResponse }
     * 
     */
    public SavePersonPPResponse createSavePersonPPResponse() {
        return new SavePersonPPResponse();
    }

    /**
     * Create an instance of {@link ActivityPreference }
     * 
     */
    public ActivityPreference createActivityPreference() {
        return new ActivityPreference();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Savepersonpreferences }
     * 
     */
    public Savepersonpreferences createSavepersonpreferences() {
        return new Savepersonpreferences();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link SavepersonpreferencesResponse }
     * 
     */
    public SavepersonpreferencesResponse createSavepersonpreferencesResponse() {
        return new SavepersonpreferencesResponse();
    }

    /**
     * Create an instance of {@link ReadPersonPPID }
     * 
     */
    public ReadPersonPPID createReadPersonPPID() {
        return new ReadPersonPPID();
    }

    /**
     * Create an instance of {@link Readpreferences }
     * 
     */
    public Readpreferences createReadpreferences() {
        return new Readpreferences();
    }

    /**
     * Create an instance of {@link UpdatePersonPreferences }
     * 
     */
    public UpdatePersonPreferences createUpdatePersonPreferences() {
        return new UpdatePersonPreferences();
    }

    /**
     * Create an instance of {@link ReadpreferencesResponse }
     * 
     */
    public ReadpreferencesResponse createReadpreferencesResponse() {
        return new ReadpreferencesResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person.Preferences }
     * 
     */
    public Person.Preferences createPersonPreferences() {
        return new Person.Preferences();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPeopleListResponse")
    public JAXBElement<ReadPeopleListResponse> createReadPeopleListResponse(ReadPeopleListResponse value) {
        return new JAXBElement<ReadPeopleListResponse>(_ReadPeopleListResponse_QNAME, ReadPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatepersonpreferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatepersonpreferenceResponse")
    public JAXBElement<UpdatepersonpreferenceResponse> createUpdatepersonpreferenceResponse(UpdatepersonpreferenceResponse value) {
        return new JAXBElement<UpdatepersonpreferenceResponse>(_UpdatepersonpreferenceResponse_QNAME, UpdatepersonpreferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilldbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "filldbResponse")
    public JAXBElement<FilldbResponse> createFilldbResponse(FilldbResponse value) {
        return new JAXBElement<FilldbResponse>(_FilldbResponse_QNAME, FilldbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonPPResponse")
    public JAXBElement<ReadPersonPPResponse> createReadPersonPPResponse(ReadPersonPPResponse value) {
        return new JAXBElement<ReadPersonPPResponse>(_ReadPersonPPResponse_QNAME, ReadPersonPPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filldb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "filldb")
    public JAXBElement<Filldb> createFilldb(Filldb value) {
        return new JAXBElement<Filldb>(_Filldb_QNAME, Filldb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPPIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonPPIDResponse")
    public JAXBElement<ReadPersonPPIDResponse> createReadPersonPPIDResponse(ReadPersonPPIDResponse value) {
        return new JAXBElement<ReadPersonPPIDResponse>(_ReadPersonPPIDResponse_QNAME, ReadPersonPPIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updatepersonpreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatepersonpreference")
    public JAXBElement<Updatepersonpreference> createUpdatepersonpreference(Updatepersonpreference value) {
        return new JAXBElement<Updatepersonpreference>(_Updatepersonpreference_QNAME, Updatepersonpreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonPreferencesResponse")
    public JAXBElement<UpdatePersonPreferencesResponse> createUpdatePersonPreferencesResponse(UpdatePersonPreferencesResponse value) {
        return new JAXBElement<UpdatePersonPreferencesResponse>(_UpdatePersonPreferencesResponse_QNAME, UpdatePersonPreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPPID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonPPID")
    public JAXBElement<ReadPersonPPID> createReadPersonPPID(ReadPersonPPID value) {
        return new JAXBElement<ReadPersonPPID>(_ReadPersonPPID_QNAME, ReadPersonPPID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Readpreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readpreferences")
    public JAXBElement<Readpreferences> createReadpreferences(Readpreferences value) {
        return new JAXBElement<Readpreferences>(_Readpreferences_QNAME, Readpreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonPreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonPreferences")
    public JAXBElement<UpdatePersonPreferences> createUpdatePersonPreferences(UpdatePersonPreferences value) {
        return new JAXBElement<UpdatePersonPreferences>(_UpdatePersonPreferences_QNAME, UpdatePersonPreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadpreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readpreferencesResponse")
    public JAXBElement<ReadpreferencesResponse> createReadpreferencesResponse(ReadpreferencesResponse value) {
        return new JAXBElement<ReadpreferencesResponse>(_ReadpreferencesResponse_QNAME, ReadpreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityPreference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "activitypreference")
    public JAXBElement<ActivityPreference> createActivitypreference(ActivityPreference value) {
        return new JAXBElement<ActivityPreference>(_Activitypreference_QNAME, ActivityPreference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Savepersonpreferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savepersonpreferences")
    public JAXBElement<Savepersonpreferences> createSavepersonpreferences(Savepersonpreferences value) {
        return new JAXBElement<Savepersonpreferences>(_Savepersonpreferences_QNAME, Savepersonpreferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavepersonpreferencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savepersonpreferencesResponse")
    public JAXBElement<SavepersonpreferencesResponse> createSavepersonpreferencesResponse(SavepersonpreferencesResponse value) {
        return new JAXBElement<SavepersonpreferencesResponse>(_SavepersonpreferencesResponse_QNAME, SavepersonpreferencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPeopleList")
    public JAXBElement<ReadPeopleList> createReadPeopleList(ReadPeopleList value) {
        return new JAXBElement<ReadPeopleList>(_ReadPeopleList_QNAME, ReadPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savePersonPPResponse")
    public JAXBElement<SavePersonPPResponse> createSavePersonPPResponse(SavePersonPPResponse value) {
        return new JAXBElement<SavePersonPPResponse>(_SavePersonPPResponse_QNAME, SavePersonPPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonPP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savePersonPP")
    public JAXBElement<SavePersonPP> createSavePersonPP(SavePersonPP value) {
        return new JAXBElement<SavePersonPP>(_SavePersonPP_QNAME, SavePersonPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonPP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonPP")
    public JAXBElement<ReadPersonPP> createReadPersonPP(ReadPersonPP value) {
        return new JAXBElement<ReadPersonPP>(_ReadPersonPP_QNAME, ReadPersonPP.class, null, value);
    }

}
