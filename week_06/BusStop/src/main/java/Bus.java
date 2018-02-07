import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        String copyDestination = this.destination;
        return copyDestination;
    }

    public int getCapacity() {
        int copyCapacity = this.capacity;
        return copyCapacity;
    }

    public void addPassenger(BusStop busStop) {
        Person passenger = busStop.removePerson();
        if(this.passengers.size() < this.capacity) {
            this.passengers.add(passenger);
        }

        else{busStop.addPerson(passenger);}
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }
}
