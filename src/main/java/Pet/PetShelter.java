package main.java.Pet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class PetShelter {
    public Map<String, Pet> pets;
    public Timer timer;

    public void displayPets() {
        for (Pet pet : pets.values()) {
            if(pet instanceof OrganicDog) {
            System.out.println(pet.getName() + "" + pet.getThirst() + "" + pet.getHunger()
            + "" + pet.getStatus() + "" + pet.getBoredom() + "" + pet.getWaste() + "" + pet.getHealth()); }
            else if(pet instanceof InorganicDog) {
            System.out.println(pet.getName() + "" + pet.getOilLevel()  + "" + pet.getHunger()
            + "" + pet.getStatus() + "" + pet.getBoredom() + "" + pet.getWaste() + "" + pet.getHealth());
            }
        }
    }

    public PetShelter() {
        pets = new HashMap<>();
        timer = new Timer();
    }
    public Collection<Pet> getAllPets() {
        return pets.values();
    }

    public Pet getPetByName(String name) {
        return pets.get(name);
    }

    public void feedAllPets() {
        for (Pet pet : pets.values()) {
            pet.feed();
        }
    }

    public void feedOrganicPets() {
        for (Pet pet : pets.values()) {
            pet.feedOrganic();
        }
        
    }

    public void feedInorganicPets() {
        for (Pet pet : pets.values()) {
            pet.feedInorganic();
        }
    }

    public void giveWaterOrganicPets() {
        for (Pet pet : pets.values()) {
            pet.giveOrganicPetsWater();
        }
    }

    public void giveOilInorganicPets() {
        for (Pet pet : pets.values()) {
            if (pet instanceof InorganicCat) {
                ((InorganicCat) pet).giveInorganicPetsOil();
                } else if (pet instanceof InorganicDog) {
                    ((InorganicDog) pet).giveInorganicPetsOil();
                }
        }
        
    }

    public void playWithPet(String name) {
        Pet pet = getPetByName(name);
        if (pet != null) {
            pet.play();
        }
    }

    public void cleanPets(String name) {
        Pet pet = getPetByName(name);
        if (pet != null) {
            pet.cleanPets();
        }
    }

    public void tickAllPets() {
    }

    public void addPet(Pet Pet) {
        pets.put(Pet.getName(), Pet);
    }

    public void removePet(Pet adoptedPet) {
    }



    public void startTasks() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Pet pet : pets.values()) {
                    pet.updateStatus();
                }
            }
            // Schedule the task to run every 30 seconds (30,000 milliseconds)
        }, 30000, 30000); 
    }

    public void enterTask(String petName) {
        Pet pet = pets.get(petName);
        if (pet != null) {
            pet.resetStatus();
        } else {
            System.out.println("Pet not found.");
        }
    }
    public void tickInorganicPets() {
    }
    public void tickOrganicPets() {
    }

    public void giveInorganicPetsOil() {
    }
}

