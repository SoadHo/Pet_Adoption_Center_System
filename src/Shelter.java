import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Shelter {
    HashMap<Integer, Animal> animalMap;
    Queue<Person> waitlist;
    ArrayList<Adoption> adoptionHistory;

    public void addtoWaitlist(Person person) {
        waitlist.add(person);
    }

    public Person viewNextInLine() {
        return waitlist.peek();
    }

    public Person removeFromWaitlist() {
        return waitlist.poll();
    }

    public void printWaitlist() {
        if (waitlist.isEmpty()) {
            System.out.println("No waitlist");
        }

        System.out.println();
    }






}
