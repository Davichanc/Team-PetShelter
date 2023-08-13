public class OrganicPet extends Pet{
    private int petHunger;
    private int petThirst;
    private int petBoredom;
    

    public OrganicPet(String petName, String petType)
    {
        super(petName, petType);
        this.petHunger = 5;
        this.petThirst = 5;
        this.petBoredom = 5;
    }

    public int getPetHunger()
    {
        return petHunger;
    }

    public int getPetThirst()
    {
        return petThirst;
    }

    public int getPetBoredom()
    {
        return petBoredom;
    }

    public void changeHunger(int changeHungerBy)
    {
        petHunger += changeHungerBy;
    }

    public void changeThirst(int changeThirstBy)
    {
        petThirst += changeThirstBy;
    }

    public void changeBoredom(int changeBoredomBy)
    {
        petBoredom += changeBoredomBy;
    }

    @Override

    public String toString()
    {
        return this.petName + "(" + this.petType + ")\t| [Hunger]: " + getPetHunger() + "\t| [Thirst]: " + getPetThirst() + "\t| [Boredom]: " + getPetBoredom() +"\n";
    }
}
