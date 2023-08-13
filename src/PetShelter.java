import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class PetShelter {
    private Map<String, Pet> shelter = new HashMap<String, Pet>();

    public Collection<Pet> getAllPets()
    {
        return shelter.values();
    }

    public Pet getPet(String petName)
    {
        return shelter.get(petName);
    }

    public void addPet(Pet newPet)
    {
        shelter.put(newPet.getPetName(), newPet);
    }

    public void adoptPet(String petName)
    {
        shelter.remove(petName);
    }

    public void feedOrganicPets()
    {
        for(Pet pet : getAllPets())
        {
            if(pet instanceof OrganicPet){
                ((OrganicPet) pet).changeHunger(-3);
            }
        }
    }

    public void feedRoboticPets()
    {
        for(Pet pet : getAllPets())
        {
            if(pet instanceof RoboticPet){
                ((RoboticPet) pet).changeOil(-5);
            }
        }
    }

    public void waterOrganicPets()
    {
        for(Pet pet : getAllPets()) //VirtualPet pet : shelter.values()
        {
            if(pet instanceof OrganicPet){
                ((OrganicPet) pet).changeThirst(-3);
            }
        }
    }

    public void playPets()
    {
        for(Pet pet : getAllPets())
        {
            if(pet instanceof OrganicPet){
                ((OrganicPet) pet).changeBoredom(-3);
            }
        }
    }

    public void rechargeRobotic()
    {
        for(Pet pet : getAllPets())
        {
            if(pet instanceof RoboticPet){
                ((RoboticPet) pet).rechargePet(100);
            }
        }
    }

    public void tick()
    {
        for(Pet pet : getAllPets())
        {
            if(pet instanceof OrganicPet){
                ((OrganicPet) pet).changeHunger(+1);
                ((OrganicPet) pet).changeThirst(+1);
                ((OrganicPet) pet).changeBoredom(+1);
            }
            else if(pet instanceof RoboticPet){
                ((RoboticPet) pet).changeOil(-5);
                ((RoboticPet) pet).rechargePet(-2);
            }
        }
    }
}

