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
   
    
    public String toString() {
        return ("----------------------------------------------------------------|") + " \n" + "        " + name + "\t    " + " | "
                + "rust  " + this.rust + "\t       " + " | " + "health   "+ this.health +"\t         " + this.description + "\t"  
                + "\n";

    }
 
}
