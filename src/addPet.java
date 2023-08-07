import java.util.Scanner;

public class addPet {

    Scanner input;

    // to pass the scanner as a parameter
    public addPet(Scanner input) {
        this.input = input;
    }

    // add a new organic pet to shelter
    public OrganicPet NewOrganicPet() {

        System.out.println("add new pet\n");
        System.out.println("Enter pet's Name");
        String Name = input.nextLine();
        System.out.print("enter pet's type   ");
        String type = input.nextLine();
        System.out.println("enter hunger ");
        int hunger = input.nextInt();
        input.nextLine();
        System.out.println("enter info in no");
        int info = input.nextInt();
        input.nextLine();
        System.out.println("enter health ");
        int health = input.nextInt();
        input.nextLine();
        System.out.println("enter fullness in no ");
        int full = input.nextInt();
        input.nextLine();

        System.out.println("enter description ");
        String description = input.nextLine();

        System.out.println("enter litter ");
        int litter = input.nextInt();
        input.nextLine();
        Boolean dirty = false;

        // create a new pet object
        OrganicPet organicPet = new OrganicPet(Name, type, info, health, full, dirty, description, litter, hunger);

        return organicPet;
    }
//add robot pets
    public InorganicPet NewInorganicPet() {

        System.out.println("add new pet\n");
        System.out.println("Enter pet's Name");
        String Name = input.nextLine();
        System.out.print("enter pet's type   ");
        String type = input.nextLine();

        System.out.println("enter info ");
        int info = input.nextInt();
        input.nextLine();
        System.out.println("enter health ");
        int health = input.nextInt();
        input.nextLine();
        System.out.println("enter full ");
        int full = input.nextInt();
        input.nextLine();

        Boolean dirty = false;
        System.out.println("enter description ");
        String description = input.nextLine();

        System.out.println("enter rust ");
        int rust = input.nextInt();
        input.nextLine();
        // create a new pet object
        InorganicPet inorganicPet = new InorganicPet(Name, type, info, health, full, dirty, description, rust);
        return inorganicPet;
    }

}
