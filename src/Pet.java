

public class Pet {
    public String name;
    public int health;
    public int full;
    public int mood;
    public String status = "Waiting";
    public boolean dirty;
    public String description;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getFull() {
        return full;
    }
    public void setFull(int full) {
        this.full = full;
    }
    public boolean isDirty() {
        return dirty;
    }
    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Pet(String name, int health, int full, boolean dirty, String description) {
        this.name = name;
        this.health = health;
        this.full = full;
        this.dirty = dirty;
        this.description = description;
    }
    
    // Make every function to been doing  for 5 seconds after that the status of the pet will be waiting for another action
    public void play(){
        if(status.equalsIgnoreCase("Waiting")){
            System.out.println("The pet is playing");
            mood++;
            full--;
            if(full<0 && full>-10){
                health--;
            }
        } else {
            System.out.println("Pet cannot play because is: " + status);
        }
    }

    public void feeding(){
        if(status.equalsIgnoreCase("Waiting")){
            System.out.println("The");
        }
    }

    //Pets will getting hungry every minute (full--;) if the are waiting or doing something what is not eat.
    public void waiting(){
        //add tick method 
        if(status.equalsIgnoreCase("Waiting")){
            full--;
            if(full<0 && full>-10){
                health--;
                full--;
            }
        }

    }



    public Pet(){}



}

