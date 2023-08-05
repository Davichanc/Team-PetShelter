package petshelteramok;

public abstract class Pet{
    public String petName;
    public int petHappiness;
    public int petHealth;
    
    public Pet(String name, int happiness, int health) {
        petName = name;
        petHappiness = happiness;
        petHealth = health;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetHappiness() {
        return petHappiness;
    }

    public void setPetHappiness(int petHappiness) {
        this.petHappiness = petHappiness;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public void play() {
        petHappiness += 10;
    }

    public abstract void tick();

    // public String toString() {
    //     return ("-------------------------------------------------" + " \n" + "\t" + Name + "\t" + this.petType + " | " + 
    //     "Hunger " + this.hunger + "\t" + " | " + "Health " + this.petHealth + "\t Cage " + this.clean)
    // }

}
