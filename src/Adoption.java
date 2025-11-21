public class Adoption {
    int date;
    Animal animal;
    Person person;

    public Adoption(int date, Animal animal, Person person) {
        this.date = date;
        this.animal = animal;
        this.person = person;
    }
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return date + ": " + animal.toString() + " adopted by " + person.toString();

    }
}
