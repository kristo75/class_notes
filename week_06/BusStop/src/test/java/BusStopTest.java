import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before(){
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        busStop = new BusStop("Lothian Road");
        busStop.addPerson(person1);
    }

    @Test
    public void getBusStopName(){
        assertEquals("Lothian Road", busStop.getName());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person2);
        assertEquals(2, busStop.getQueueCount());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPerson(person2);
        busStop.addPerson(person3);
        busStop.removePerson();
        assertEquals(2, busStop.getQueueCount());
    }


}
