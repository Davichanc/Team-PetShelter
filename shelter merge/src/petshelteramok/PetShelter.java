package petshelteramok;

// import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// import java.util.Set;
import java.util.Timer;
import java.util.Map.Entry;

public class PetShelter {
    public Map<String, Pet> myShelter = new HashMap<String, Pet>();
    public Timer timer;

    // public Collection<Pet> getAllPets() {
    //     Map<String, Pet> pet;
    //     return pets.values();
    // }

    // public void allPets() {
    //     Map<String, Pet> pets;
    //     Set<String> set = pets.keySet();
    //     for(String index : set) {
    //         Pet value = pets.get(index);
    //         System.out.println(index + "    |" + value);
    //     }
    // }

    public PetShelter() {
        timer = new Timer();
    }

    public void addPet(Pet adoptablePet) {
        String petsAvailable = adoptablePet.getPetName();
        myShelter.put(petsAvailable, adoptablePet);
    }

    public void removePet(String adoptPet) {
        myShelter.remove(adoptPet);
    }

    public void showPets(Pet adoptablePet) {
        for (Entry<String, Pet> entry : myShelter.entrySet()) {
            entry.getValue();
            System.out.println("Name: " + entry.getKey() + "\nHealth " + entry.getValue().getPetHealth()
                    + "\nHappiness: " + entry.getValue().getPetHappiness());
        }
    }

    public Pet getPetName(String name) {
        return myShelter.get(name);
    }

    public void feedPets() {
        for (Pet pets : availablePets()) {
            if (pets instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pets;
                organicPet.feed();
            }
        }
    }

    public void waterAllPets() {
        for (Pet pets : availablePets()) {
            if (pets instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pets;
                organicPet.water();
            }
        }
    }

    public void tickAllPets() {
        for (Pet pets : availablePets()) {
            if (pets instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pets;
                organicPet.tick();
            } else if (pets instanceof RoboticPet) {
                RoboticPet roboticPet = (RoboticPet) pets;
                roboticPet.tick();
            }
        }
    }

    public void oilRobots() {
        for (Pet pets : availablePets()) {
            if (pets instanceof RoboticPet) {
                RoboticPet roboticPet = (RoboticPet) pets;
                roboticPet.oil();
            }
        }
    }

    public boolean hasPets() {
        return !myShelter.isEmpty();
    }

    public void cleanCages() {
        for (Pet pets : availablePets()) {
            if (pets instanceof OrganicPet) {
                OrganicPet organicPet = (OrganicPet) pets;
                organicPet.cleanCages();
            }
        }
    }

    private Pet[] availablePets() {
        return myShelter.values().toArray(new Pet[0]);
    }

    public void showPetNames(Pet pets) {
        for (Entry<String, Pet> entry : myShelter.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
