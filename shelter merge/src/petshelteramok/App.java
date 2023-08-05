package petshelteramok;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Pet pets = new OrganicDog("Khaleesi", 10, 10, 10, 10, 10);
        PetShelter myShelter = new PetShelter();
        myShelter.addPet(pets);
        Pet oCat = new OrganicCat("Fluff", 10, 10, 10, 10, 10);
        myShelter.addPet(oCat);
        Pet rDog = new RoboticDog("Asia", 10, 10, 10);
        myShelter.addPet(rDog);
        Pet rCat = new RoboticCat("Tails", 10, 10, 10);
        myShelter.addPet(rCat);
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello and welcome to our Pet shelter!");
            System.out.println("Name\t\t|Hunger\t|Thirst\t|Maintenance");
            System.out.println("----------------|-------|-------|-------");
            System.out.println();
            System.out.println("What would you like to do today?");
            System.out.println("0. Exit");
            System.out.println("1. Feed all pets");
            System.out.println("2. Give all pets water");
            System.out.println("3. Clean organic pet's cages");
            System.out.println("4. Oil robotic pets");
            System.out.println("5. Play with a pet");
            System.out.println("6. Adopt a pet");
            System.out.println("7. Admit a new pet");

            String userChoice;
            while (myShelter.hasPets()) {
                userChoice = input.next();
                switch (userChoice) {
                    case "0": // quit game
                        System.out.println("Thank you for stopping by our Pet Shelter!");
                        System.exit(0);
                        break;
                    case "1": // feed all organics
                        myShelter.tickAllPets();
                        myShelter.feedPets();
                        System.out.println("All organic pets are full!");
                        break;
                    case "2": // water all organics
                        myShelter.tickAllPets();
                        myShelter.waterAllPets();
                        System.out.println("All organic pets have enough water");
                        break;
                    case "3": // clean all organic cages
                        myShelter.tickAllPets();
                        myShelter.cleanCages();
                        System.out.println("The cages are all clean!");
                        break;
                    case "4": // oil robotic pets
                        myShelter.tickAllPets();
                        myShelter.oilRobots();
                        System.out.println("All robotic pets are good and oiled up!");
                        break;
                    case "5": // play with pets
                        myShelter.tickAllPets();
                        System.out.println("Which pet would you like to play with today?");
                        myShelter.showPetNames(pets);
                        String selectPet = input.next();
                        Pet playPet = myShelter.getPetName(selectPet);
                        playPet.play();
                        System.out.println(selectPet + " had so much fun! Thank you human!");
                        break;
                    case "6": // adopt a pet
                        myShelter.tickAllPets();
                        myShelter.showPets(pets);
                        System.out.println("Which pet would you like to take home today?");
                        String adoptPet = input.next();
                        myShelter.removePet(adoptPet);
                        System.out.println("Congratulations on your new pet, " + adoptPet);
                        break;
                    case "7": // admit a new pet
                        myShelter.tickAllPets();
                        System.out.println(
                                "What kind of pet would you like to admit? \n\tA. Organic dog \n\tB. Organic cat \n\tC. Robotic dog \n\tD. Robotic cat");
                        String petType = input.next();
                        switch (petType.toUpperCase()) {
                            case "A": // admit organic dog
                                System.out.println("What's the organic dog's name?");
                                String organicDogName = input.next();
                                Pet newOrganicDog = new OrganicDog(organicDogName, 10, 10, 10, 10, 0);
                                myShelter.addPet(newOrganicDog);
                                break;
                            case "B": // admit organic cat
                                System.out.println("What's the organic cat's name?");
                                String organicCatName = input.next();
                                Pet newOrganicCat = new OrganicCat(organicCatName, 10, 10, 10, 10, 0);
                                myShelter.addPet(newOrganicCat);
                                break;
                            case "C": // admit robotic dog
                                System.out.println("What's the robotic dog's name?");
                                String roboticDogName = input.next();
                                Pet newRoboticDog = new RoboticDog(roboticDogName, 10, 10, 10);
                                myShelter.addPet(newRoboticDog);
                                break;
                            case "D": // admit robotic cat
                                System.out.println("What's the robotic cat's name?");
                                String roboticCatName = input.next();
                                Pet newRoboticCat = new RoboticCat(roboticCatName, 10, 10, 10);
                                myShelter.addPet(newRoboticCat);
                                break;
                        }
                        System.out.println("Thank you for choosing us!");
                        break;
                }
            }
        }
        while (!myShelter.hasPets());

    }
}
