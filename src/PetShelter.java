import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Collection;
import java.util.Set;

public class PetShelter {
    public Map<Integer, Pet> pets;
    public Timer timer;
int keyvalue = 1;
    public PetShelter() {
        pets = new HashMap<>();
     
        timer = new Timer();
        
    }
    public Collection<Pet> getAllPets() {
        return pets.values();
    }
    public void allPets(){
        Set<Integer> set = pets.keySet();
        for (Integer index : set){
            Pet value = pets.get(index);
            System.out.println(index +"     |"+ value);
        }
    }
        
    
    public void feedOrganic () {
        for (Pet allPets : pets.values()) {
            allPets.feeding();
          
        }

        }
        public void playWithPets (int keyvalue) {
            Pet playPet = pets.get(keyvalue) ;
                
                playPet.play();
                
    
            } 
            public void walkDogs(int keyvalue){
            
                
              
                Pet petDog = pets.get(keyvalue);
                
                petDog.walk();
            }
        
            public void cleanDogCage(int keyvalue){
            
                
              
                Pet petDog = pets.get(keyvalue);
                
                petDog.cleanCage();
            }
    public void oilRobots() {
        for (Pet allPets : pets.values()) {
            allPets.oiling();
            

        } 
}
    public void addPet(Pet pet) {
        this.pets.put(keyvalue++, pet);
        
    }
    public void cleanCatLitter(int keyvalue){
        Pet petCat = pets.get(keyvalue);
                
        petCat.cleanLitter();
    }
    
    public Pet getPet(String name) {
        return pets.get(keyvalue);
    }

    public void startTasks() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Pet pet : pets.values()) {
                    pet.updateInfo();
                    pet.waiting();
                   
                    if(pet.litter==100){
                        pet.dirty=true;
                    }
                    pet.tick();
                    
                }
            }
            // Schedule the task to run every 30 seconds (30,000 milliseconds)
        }, 30000, 30000); 
    }

    public void enterTask(int keyvalue) {
        Pet pet = pets.get(keyvalue);
        if (pet != null) {
            pet.resetInfo();
        } else {
            System.out.println("Pet not found.");
        }
    }
}

