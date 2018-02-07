import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {


    Bus bus;
    Bus bus2;
    Person person1;
    Person person2;
    Person person3;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Stockholm", 16);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        bus2 = new Bus("Glasgow", 2);
        busStop = new BusStop("Lothian Road");
        busStop.addPerson(person1);
        busStop.addPerson(person2);
        busStop.addPerson(person3);

    }


    @Test
    public void getDestination(){
        assertEquals("Stockholm", bus.getDestination());
    }

    @Test
    public void getCapacity(){
        assertEquals(16, bus.getCapacity());
    }

    @Test
    public void getPassengerCount(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());

    }

    @Test
    public void addPassengerFromStop(){
        bus2.addPassenger(busStop);
        assertEquals(1, bus2.getPassengerCount());
        assertEquals(2, busStop.getQueueCount());
    }

    @Test
    public void checkCapacityLimitWorks(){
        bus2.addPassenger(busStop);
        bus2.addPassenger(busStop);
        bus2.addPassenger(busStop);
        assertEquals(2, bus2.getPassengerCount());

    }

    @Test
    public void removePassenger(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger(person3);

        assertEquals(2, bus.getPassengerCount());
    }
}
