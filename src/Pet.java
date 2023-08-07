
public class Pet {
    public String name;

    public int info;
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int health;
    public int full;
    public int mood;
    public String status = "Waiting";
    public boolean dirty;
    public String description;
    int rust;
    int hunger=0;
    int litter=0;

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
        //System.out.println(name + "'s status updated: " + "its health is " + health);
        this.health--;

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
//constructor for pet 
    public Pet(String name, String type, int info, int health, int full, boolean dirty, String description) {
        this.name = name;
        this.info = info;
        this.health = health;
        this.full = full;
        this.dirty = dirty;
        this.description = description;
        this.type = type;
    }

//function to play with a pet
    public void play() {
        if (status.equalsIgnoreCase("Waiting")) {
            System.out.println("You are Playing with " + this.name);
            mood++;
            full--;
        }
            if (full < 0 && full > -10) {
                health--;
                System.out.println("Its is losing health. its health is "+this.health);
            }
        else {
            System.out.println(this.name + "cannot play because is: " + status);
        }
    }

    
//function to walk the pet
    public void walk() {
        System.out.println("you are walking your" + this.name);
        this.health += 5;
    }

    
//tick function 
    public void tick() {
        this.rust += 5;
        this.hunger += 5;
    }

    // Pets will get hungry every minute (full--;) if they are waiting or doing
    // something what is not eat.
    public void waiting() {
        if (status.equalsIgnoreCase("Waiting")) {
            // add tick method with the condition of every minute it going to loose 1 point
            // of full
            if (full > 0) {
                full--;
            } else if (full < 0 && full > -10) {
                health--;
                full--;
                System.out.println("Pet is losing health...");
            }
        }
    }
//function to clean litter
    public void cleanLitter() {
        if (dirty && status.equalsIgnoreCase("Waiting")) {
            System.out.println("The litter is dirty ... cleaning the litter...");
            dirty = false;
        } else {
            System.out.println("Cannot clean the litter if the pet is: " + status + "need to be waiting.");
            ;
        }
    }

    public String descriptionOfPet() {
        return null;
    }

}
