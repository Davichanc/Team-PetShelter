import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The Pet Shelter");

        System.out.println("welcome to Pet shelter");
        System.out.println("Feed organic pets and oil robotic pets to increase its health");

        Scanner input = new Scanner(System.in);

        // create dog,cat and a robot
        InorganicPet RoboticPet = new InorganicPet("robo", "robot", 50, 10, 0, false, "robot pet", 10);
        OrganicPet Cat = new OrganicPet("shambu", "cat", 0, 0, 0, false, "cat", 10, 20);
        OrganicPet Dog = new OrganicPet("rockey", "dog", 0, 0, 0, false, "cat", 50, 10);
        // instance of pet shelter
        PetShelter shelter = new PetShelter();
        // add pets to pet shelter
        shelter.addPet(RoboticPet);
        shelter.addPet(Cat);
        shelter.addPet(Dog);
        // loop through the menu
        while (true) {
            shelter.allPets();
            shelter.startTasks();
            System.out.println("what do you want to do with your pet..??");
            System.out.println("1. play with your pet");
            System.out.println("2. feed your organic pet");
            System.out.println("3. oil your robotic pet");
            System.out.println("4. walk your organic dog");
            System.out.println("5. clean your cat's litter");
            System.out.println("6. clean your dog's cage");
            System.out.println("7. quit the game");

            int option = input.nextInt();
            input.nextLine();
            // switch through menu options
            switch (option) {
                // play with the pet
                case 1:
                    // to play with pet
                    System.out.println("\n enter the index number for the pet");
                    shelter.keyvalue = input.nextInt();
                    shelter.playWithPets(shelter.keyvalue);

                    break;
                case 2:
                    // feed all pets
                    shelter.feedOrganic();
                    System.out.println("you are feeding your organic pets ");
                    System.out.println("their hunger will reduce by 5 ");
                    Dog.hunger -= 5;
                    Cat.hunger -= 5;
                    break;
                case 3:
                    // water all the pets

                    shelter.oilRobots();

                    System.out.println("robots are oiled  ");
                    System.out.println("their rust will reduce by 10 ");

                    System.out.println("\n");
                    RoboticPet.rust -= 10;
                    break;
                case 4:
                    // walk the dog
                    System.out.println("you can walk only dogs");
                    System.out.println("\n enter the index number for the dog");
                    shelter.keyvalue = input.nextInt();

                    shelter.walkDogs(shelter.keyvalue);

                    break;
                case 5:
                    // clean the cat litter
                    System.out.println("\n enter the index number for the Dirty Cat");
                    shelter.keyvalue = input.nextInt();

                    shelter.cleanCatLitter(shelter.keyvalue);
                    Cat.litter = 0;
                    break;
                case 6:
                    // clean the dog cage
                    System.out.println("\n enter the index number for the Dirty dog");
                    shelter.keyvalue = input.nextInt();

                    shelter.cleanDogCage(shelter.keyvalue);
                    Dog.litter = 0;
                    break;
                case 7:
                    // exit
                    System.exit(0);
                    input.close();
            }
        }
    }
}