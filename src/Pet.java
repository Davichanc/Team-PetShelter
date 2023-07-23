

public class Pet {
    public String name;
    public int info;
    public int health;
    public int full;
    public int mood;
    public String status = "Waiting";
    public boolean dirty;
    
    public String description;

public Pet(String name) {
    this.info = 100;
    // Initial status set to 100
    this.name = name;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }


    public void updateInfo() {
        // Decrease status by 5 if no task is entered within 30 seconds
        info -= 5;
        System.out.println(name + "'s status updated: " + info);
    }

    public void resetInfo() {
        // Reset status to 100 when a new task is entered
        info = 100; 
        System.out.println(name + "'s status reset to 100.");
    }

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
    public Pet(String name, int info, int health, int full, boolean dirty, String description) {
        this.name = name;
        this.info = info;
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
                System.out.println("Pet is losing health...");
            }
        } else {
            System.out.println("Pet cannot play because is: " + status);
        }
    }

    public void feeding(){
        if(status.equalsIgnoreCase("Waiting")){
            if(full<10){
                full++;
                if(health<10){
                    health++;
                }
            System.out.println("The pet is being fed");
            }else{
                System.out.println("Pet cannot be fed if its full!!!");
            }
        } else{
            System.out.println("Pet cannot be fed because is: "+ status+"need to be waiting.");
        }
    }

    //Pets will getting hungry every minute (full--;) if the are waiting or doing something what is not eat.
    public void waiting(){
        if(status.equalsIgnoreCase("Waiting")){
        //add tick method with the condition of every minute it going to loose 1 point of full
            if(full>0){
                full--;
            } else if(full<0 && full>-10){
                health--;
                full--;
                System.out.println("Pet is losing health...");
            }
        }
    }

    public void cleanLitter(){
        if(dirty && status.equalsIgnoreCase("Waiting")){
            System.out.println("The litter is dirty ... cleaning the litter...");
            dirty = false;
        }else{
            System.out.println("Cannot clean the litter if the pet is: "+ status +"need to be waiting.");;
        }
    }

    public String descriptionOfPet(){
        return null;
    }



    public Pet(){}



}

