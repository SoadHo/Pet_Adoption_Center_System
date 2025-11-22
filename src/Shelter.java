import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Shelter {
    Queue<Person> waitlist;
    ArrayList<Adoption> adoptionHistory;

    public Shelter() {
        waitlist = new LinkedList<>();
        adoptionHistory = new ArrayList<>();
    }

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

        int position = 1;
        for (Person person : waitlist) {
            System.out.println(position + ". " + person);
            position++;
        }
    }

    public void recordAdoption(Animal animal, Person person) {
        Adoption adoption = new Adoption(LocalDate.now(), animal, person);
        adoptionHistory.add(adoption);
    }

    public void printAdoptionHistory() {
        if (adoptionHistory.isEmpty()) {
            System.out.println("No adoption history");
            return;
        }

        for (Adoption adoption : adoptionHistory) {
            System.out.println(adoption);
        }
    }
}





