import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Shelter For All Pets:");

        PetShelter virtualShelter = new PetShelter();
        virtualShelter.addPet(new OrganicPet("Organic1", "Dog"));
        virtualShelter.addPet(new OrganicPet("Organic2", "Dog"));
        virtualShelter.addPet(new RoboticPet("Robot1", "Robot Dog"));
        virtualShelter.addPet(new RoboticPet("Robot2", "Robot Dog"));
        boolean running = true;
        while (running) {
            // if()
            System.out.println("What you want to do?");
            System.out.println("1. Add A Pet ");
            System.out.println("2. Feed All Pet Types ");
            System.out.println("3. Feed Only Organic Pets ");
            System.out.println("4. Feed Only Robotic Pets ");
            System.out.println("5. Play With Organic Pets ");
            System.out.println("6. Recharge Robotic Pets ");
            System.out.println("7. View All Pets ");
            System.out.println("0. Exit");

            int option = input.nextInt();
            input.nextLine();

            if(option == 0)
            {break;}

            switch(option){
                case 1:{
                    System.out.print("Name of new pet: ");
                    String newPetName = input.nextLine();
                    System.out.print(newPetName + " is a: ");
                    String newPetBreed = input.nextLine();
                    System.out.print("Is " + newPetName + " organic or robotic? ");
                    String newPetType = input.nextLine();
                    if(newPetType.toLowerCase() == "organic")
                    {
                        OrganicPet newOrganicPet = new OrganicPet(newPetName, newPetBreed);
                        virtualShelter.addPet(newOrganicPet);
                    }
                    else if(newPetType.toLowerCase() == "robotic")
                    {
                        RoboticPet newRoboticPet = new RoboticPet(newPetName, newPetBreed);
                        virtualShelter.addPet(newRoboticPet);
                    }
                    System.out.println("Adding " + newPetName + " to the shelter...");
                    break;
                }
                case 2:{
                    virtualShelter.feedOrganicPets();
                    virtualShelter.feedRoboticPets();
                    System.out.println("All pets have just been fed.");
                    break;
                }
                case 3:{
                    virtualShelter.feedOrganicPets();
                    System.out.println("All organic pets have just been fed food.");
                    break;
                }
                case 4:{
                    virtualShelter.feedRoboticPets();
                    System.out.println("All robotic pets have just been given oil.");
                    break;
                }
                case 5:{
                    virtualShelter.playPets();
                    System.out.println("All organic pets have just played fetch.");
                    break;
                }
                case 6:{
                    virtualShelter.rechargeRobotic();
                    System.out.println("Recharging all robotic pets before batteries die.");
                    break;
                }
                case 7:{
                    System.out.println(virtualShelter.getAllPets());
                    break;
                }
            }
            virtualShelter.tick();
        }
    }
    
}
