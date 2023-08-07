public class OrganicPet extends Pet{
    //create organic pet with hunger and litter as its attributes
     int litter;
    int hunger;
    public OrganicPet(String name,String type, int info, int health, int full, boolean dirty, String description, int litter,int hunger) {
        super(name,type, info, health, full, dirty, description);
        this.litter = litter;
        this.hunger=hunger;
    }
    public void feeding() {
        
        if (status.equalsIgnoreCase("Waiting")) {
            this.hunger -= 5;
            if (full < 10) {
                full++;
                if (health < 10) {
                    health++;

                }
               
            } else {
                System.out.println(this.name + "Pet cannot be fed if its full!!!");
            }
        } else {
            System.out.println(this.name +" cannot be fed because is: " + status + "need to be waiting.");
        }
       
    }
    public void cleanTheCage(){
        System.out.println("your dogs cage is cleaned");
        litter=0;
        health=100;
    }
    
    
    public String toString() {
        return ("----------------------------------------------------------------|") + " \n" + "        " + name + "\t" +this.type+ " | "
                + "hunger  " + this.hunger + "\t" + "   | " + "health  "+ this.health +  "\t litter  " +this.litter+ "\t"+ this.description + "\t" 
                + "\n";

    }




}
