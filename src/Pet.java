

public class Pet {
    public String name;
    public int health;
    public int full;
    public int mood;
    public String status;
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
    
    public void play(){
        if(status.equalsIgnoreCase("Waiting")){
            System.out.println("The pet is playing");
            mood++;
            full--;
            if(full<0){
                health--;
            }
        }
    }

    public void 



    public Pet(){}



}

