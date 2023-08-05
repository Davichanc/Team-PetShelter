package petshelteramok;

public class RoboticDog extends Dog implements RoboticPet {
    int maintenance = 10;

    public RoboticDog(String name, int happiness, int health, int maintenance) {
        super(name, happiness, health);
        this.maintenance = maintenance;
    }

    @Override
    public void tick() {
        petHappiness -= 10;
        maintenance -= 10;
        if (maintenance <= 0 || petHappiness <= 0) {
            petHealth -= 10;
        }
    }

    public void oil() {
        maintenance +=5;
    }
}

