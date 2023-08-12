package main.java.Pet;

import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetShelter shelter = new PetShelter();

        // Add some initial pets to the shelter
        shelter.addPet(new Pet("Organic Dog", "Dark Brown short fur Dog", 50, 50, 50, 50, 100, 100));
        shelter.addPet(new Pet("Organic Cat", "Black and White furry Cat", 50, 50, 50, 50, 100, 100));
        shelter.addPet(new Pet("Robotic Dog", "Shinny Red", 50, 50, 50, 50, 100, 100));
        shelter.addPet(new Pet("Robotic Cat", "Shinny Pink", 50, 50, 50, 50, 100, 100));

        System.out.println("Welcome to Our Virtual Pet Shelter!");
        shelter.displayPets();

        while (true) {
            System.out.println("\n-----------------------");
            System.out.println("Current Pets in Shelter:");
            for (Pet pet : shelter.getAllPets()) {
                System.out.println(pet);
            }
            System.out.println("-----------------------");
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed all pets");
            System.out.println("2. Feed organic pets");
            System.out.println("3. Feed robotic pets");
            System.out.println("4. Play with a pet");
            System.out.println("5. Adopt a pet");
            System.out.println("6. Intake a pet");
            System.out.println("7. Give organic pets water");
            System.out.println("8. Give robotic pets oil");
            System.out.println("9. Clean up all pets");
            System.out.println("0. Quit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                // Feed all pets
                case 1:
                    shelter.feedAllPets();
                    break;
                // Feed organic pets
                case 2:
                    shelter.feedOrganicPets();
                    break;
                // Feed robotic pets
                case 3:
                    shelter.feedInorganicPets();
                    break;
                // pick a pet to play with
                case 4:
                    System.out.println("Select a pet to play with:");
                    for (Pet pet : shelter.getAllPets()) {
                        System.out.println(pet.getName() + " - " + pet.getDescription());
                    }
                    String petToPlay = input.nextLine();
                    shelter.playWithPet(petToPlay);
                    break;
                // Adopt a pet
                case 5:
                    System.out.println("Select a pet to adopt:");
                    for (Pet pet : shelter.getAllPets()) {
                        System.out.println(pet.getName() + " - " + pet.getDescription());
                    }
                    String petToAdopt = input.nextLine();
                    Pet adoptedPet = shelter.getPetByName(petToAdopt);
                    if (adoptedPet != null) {
                        shelter.removePet(adoptedPet);
                        System.out.println("Congratulations! You adopted " + petToAdopt + "!");
                    } else {
                        System.out.println("Pet not found in the shelter.");
                    }
                    break;
                // Intake a pet
                case 6:
                    System.out.println("Enter the pet's name:");
                    String name = input.nextLine();
                    System.out.println("Enter the pet's description:");
                    String description = input.nextLine();
                    Pet newPet = new Pet(name, description, choice, choice, choice, choice, choice, choice);
                    shelter.addPet(newPet);
                    break;
                // Give organic pets water
                case 7:
                    shelter.giveWaterOrganicPets();
                    break;
                case 8:
                    shelter.giveInorganicPetsOil();
                    break;
                case 9:
                    shelter.tickOrganicPets();
                    break;
                // Give robotic pets oil
                case 10:
                    shelter.tickInorganicPets();
                    break;
                // Clean up all pets
                case 11:
                    shelter.tickAllPets();
                    break;
                case 0:
                    System.out.println("Thanks for visiting the Virtual Pet Shelter!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            // Call tick after each interaction
            shelter.tickAllPets();
        }
    }
}