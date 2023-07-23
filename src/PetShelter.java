import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class PetShelter {
    public Map<String, Pet> pets;
    public Timer timer;

    public PetShelter() {
        pets = new HashMap<>();
        timer = new Timer();
    }
    public void addPet(String name) {
        pets.put(name, new Pet(name));
    }

    public Pet getPet(String name) {
        return pets.get(name);
    }

    public void startTasks() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Pet pet : pets.values()) {
                    pet.updateInfo();
                }
            }
            // Schedule the task to run every 30 seconds (30,000 milliseconds)
        }, 30000, 30000); 
    }

    public void enterTask(String petName) {
        Pet pet = pets.get(petName);
        if (pet != null) {
            pet.resetInfo();
        } else {
            System.out.println("Pet not found.");
        }
    }
}

