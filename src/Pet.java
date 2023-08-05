
public class Pet {
    protected String petName;
    protected String petType;
    

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;
    }

    public String getPetName()
    {
        return petName;
    }

    public String getPetType()
    {
        return petType;
    }

    public void changeHunger(int i) {
    }

    public void changeThirst(int i) {
    }

    public void changeBoredom(int i) {
    }
}

