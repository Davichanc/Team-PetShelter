package petshelteramok;

public class OrganicCat extends Pet implements OrganicPet{
    int hunger = 10;
    int thirst = 10;
    int clean = 10;

    public OrganicCat(String name, int happiness, int health, int hunger, int thirst, int clean) {
        super(name, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
        this.clean = clean;
    }

    @Override
    public void tick() {
        petHappiness = 10;
        hunger -= 10;
        thirst -= 10;
        clean -= 10;
        if(hunger <= 0 || thirst <= 0 || clean <= 0 || petHappiness <= 0) {
            petHealth -= 10;
        }
    }

    public void feed() {
        hunger += 10;
    }

    public void water() {
        thirst += 10;
    }

    public void cleanCages() {
        clean += 10;
    }

}
