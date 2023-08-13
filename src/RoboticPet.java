public class RoboticPet extends Pet{
    private int petOil;
    private int petBattery;

    public RoboticPet(String petName, String petType)
    {
        super(petName, petType);
        this.petOil = 50;
        this.petBattery = 100;
    }

    public int getPetOil()
    {
        return petOil;
    }

    public int getPetBattery()
    {
        return petBattery;
    }

    public void changeOil(int changeOilBy)
    {
        petOil += changeOilBy;
    }

    public void rechargePet(int changeBatteryBy)
    {
        petBattery += changeBatteryBy;
    }

    @Override

    public String toString()
    {
        return this.petName + "(" + this.petType + ")\t|  [Oil Level]: " + getPetOil() + "\t|  [Battery Level]: " + getPetBattery() +"\n";
    }
}
