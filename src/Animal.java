public class Animal {

    int Id;
    String name;
    int birthday;
    String gender;
    String species;
    boolean adopted;

    public Animal(int id, String name, int birthday, String gender, String species, boolean adopted) {
        Id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.species = species;
        this.adopted = adopted;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
}

