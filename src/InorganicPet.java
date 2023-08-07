public class InorganicPet extends Pet{
    //create a robot object with rust as its attribute
     int rust;
   
    
    public int getRust() {
        return rust;
    }

    public void setRust(int rust) {
        this.rust = rust;
    }

    public InorganicPet(String name,String type, int info, int health, int full, boolean dirty, String description, int rust) {
        super(name,type, info, health, full, dirty, description);
        this.rust = rust;
    }
    public void oiling() {
        this.rust -= 5;
        if (status.equalsIgnoreCase("Waiting")) {
            if (full < 10) {
                full++;
            }
            if (health < 10) {
                health++;
               

                System.out.println(this.name +" is being oiled");
            } else {
                System.out.println(this.name +" is fully oiled");
            }
        } else {
            System.out.println("Pet cannot be oiled because is: " + status + "need to be waiting.");
        }
    }
   
    
    public String toString() {
        return ("----------------------------------------------------------------|") + " \n" + "        " + name + "   robot" + "| "
                + "rust  " + this.rust + "\t       " + "    | " + "health   "+ this.health +"\t        " + this.description + "\t"  
                + "\n";

    }
 
}
