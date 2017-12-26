package introsde.document.client;
import introsde.document.model.Activity;
import introsde.document.model.ActivityPreference;
import introsde.document.model.Person;
import introsde.document.ws.People;

import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class PeopleClient{
	    private static PrintWriter LogWriter;
	    
        public static void main(String[] args) throws Exception {
        	
        URL url = new URL("http://localhost:6902/ws/people?wsdl");
        
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        
        QName qname = new QName("http://ws.document.introsde/", "PeopleService");
        Service service = Service.create(url, qname);
        
        LogWriter = new PrintWriter("client-server-xml.log", "UTF-8");
        People people = service.getPort(People.class);
        LogWriter.println("#Request0: the url:"+url);
        LogWriter.println("#Request0:fill the data base\n");
        people.filldb();
        
        LogWriter.println("#Request1:read person p identified by 1 \n");
        Person p = people.readPerson(1);
        printDetailsPerson(p);
        
        LogWriter.println("#Request2:get the list of people  \n");
        List<Person> pList = people.getPeople();
        for (Person p1:pList){
        	printDetailsPerson(p1);
       	   LogWriter.println("\n");

        }
        
        
        LogWriter.println("#Request3:add person p \n");
          
        Person person = new Person();
        person.setBirthdate("12-12-2012");
        person.setFirstname("Mario");
        person.setLastname("Marco");
        LogWriter.println( "Result==> the new created person with id:"+people.addPerson(person) +" \n");
        printDetailsPerson(person);
        
        LogWriter.println("#Request4:update person p \n");
        
        Person person1= new Person();//Person.getPersonById(1);
        person1.setLastname("Paul");
        person1.setFirstname("Peter");
        person1.setBirthdate("12-12-2012");
        person1.setIdPerson(2);
        LogWriter.println( people.updatePerson(person1) +" \n");
        
        LogWriter.println("#Request5:delete person p \n");
        
        LogWriter.println("Result ==> "+ people.deletePerson(1) +" \n");
        
        LogWriter.println("#Request6:read person preference identified by id:1 and activity_type:sport");
        
        List<ActivityPreference> aList =people.readPersonPP(1,"sport");
        for(ActivityPreference a:aList){
        	printDetailsActivity(a);
        	 LogWriter.println("\n");
        }
        LogWriter.println("#Request7:return the list of all preferences");
        List<ActivityPreference> aList1 =people.readPreferences();
        for(ActivityPreference a1:aList1){
        	printDetailsActivity(a1);
        	 LogWriter.println("\n");
        }
        
        LogWriter.println("#Request8:return the value identified by {activity_id :1} for a Person identified by {id :1}");
        
        List<ActivityPreference> aList2 =people.readPersonPPID(3,1);
        for(ActivityPreference a2:aList2){
        	printDetailsActivity(a2);
        	 LogWriter.println("\n");
        }
        
        LogWriter.println("#Request9:should save a new activity object {activity} of a Person identified by {id}");
        Activity a2 = Activity.getActivityById(3);
        ActivityPreference ap = new ActivityPreference();
        ap.setDescription("teaching history");
        ap.setActivity(a2);
        ap.setName("sde");
        ap.setPlace("povo");
        ap.setStartdate("10-10-2017");
        LogWriter.println("Result ==> the saved activity with id_activity:"+people.savePersonPP(3,ap));
        
        LogWriter.println("#Request10:should update the activity identified with {activity,id}, related to the Person identified by {id");
        Activity a1 = Activity.getActivityById(1);
        ActivityPreference ac = new ActivityPreference();
        ac.setDescription("teaching sde");
        ac.setActivity(a1);
        ac.setIdActivityPreference(2);
        ac.setName("sde");
        ac.setPlace("povo");
        ac.setStartdate("10-10-2017");
        LogWriter.println("Result ==> the updated activity with id_activity:"+people.updatePersonPP(1,ac));
        
        
       
        
        LogWriter.close();
		   
        

        }
        
       public static void printDetailsPerson(Person p){
    	   LogWriter.println("person id:"+p.getIdPerson());
    	   LogWriter.println("person firstname:"+p.getFirstname());
    	   LogWriter.println("person lastname:"+p.getLastname());
    	   LogWriter.println("person birthday:"+p.getBirthdate()+"\n");
       }
       public static void printDetailsActivity(ActivityPreference a){
    	   LogWriter.println("idActivity:"+a.getIdActivityPreference());
    	   LogWriter.println("name:"+a.getName());
    	   LogWriter.println("description:"+a.getDescription());
    	   LogWriter.println("place:"+a.getPlace());
    	   LogWriter.println("startdate:"+a.getStartdate());
    	   LogWriter.println("activity type:"+a.getActivity().getName()+"\n");
    	   
       }
}