public class OrganicPet extends Pet{
    //create organic pet with hunger and litter as its attributes
     int litter;
    int hunger;
    public OrganicPet(String name,String type, int info, int health, int full, boolean dirty, String description, int litter,int hunger) {
        super(name,type, info, health, full, dirty, description);
        this.litter = litter;
        this.hunger=hunger;
    }
    public String toString() {
        return ("----------------------------------------------------------------|") + " \n" + "        " + name + "\t" +this.type+ " | "
                + "hunger  " + this.hunger + "\t" + " | " + "health  "+ this.health +  "\t litter  " +this.litter+ "\t"+ this.description + "\t" 
                + "\n";

    }




}
