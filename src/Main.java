import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Shelter");

        while(true) {
            System.out.println("Please choose an option");
            System.out.println("1. View available animals");
            System.out.println("2. View adopted animals");
            System.out.println("3. View waitlist");
            System.out.println("4. Add a person to the waitlist");
            System.out.println("5. View adoption history");
            System.out.println("6. Make an adoption");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Available animals:");
                    break;
                case 2:
                    System.out.println("Adopted animals:");
                    break;
                case 3:
                    System.out.println("Waitlist:");
                    shelter.printWaitlist();
                    break;
                case 4:
                    System.out.println("Add a person to the waitlist:");
                    System.out.println("Enter the customer's name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the customer's phone number:");
                    int phone = scanner.nextInt();
                    Person person = new Person(name, phone);
                    shelter.addtoWaitlist(person);
                    break;
                case 5:
                    System.out.println("Adopted History:");
                    shelter.printAdoptionHistory();
                    break;
                case 6:
                    System.out.println("Make an adoption");
                    
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}