package main.java.Pet;

class Pet {
    public static final String pets = null;
    private String name;
    private String status;
    private int hunger;
    private int thirst;
    private int boredom;
    private int waste;
    private int health;

    public Pet(String name, String status) {
        this.name = name;
        this.status = status;
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
        this.waste = 50;
        this.health = 100;

    }

    public Pet(String name, String status, int hunger, int boredom, int thirst, int waste, int health) {
        this.name = name;
        this.status = status;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.waste = waste;
        this.health = health;


    }

    // Getters and setters for name, description, hunger, and boredom (omitted for
    // brevity)

    {
    }

    public void feed() {
        hunger -= 20;
        if (hunger < 0) {
            hunger = 0;
        }
    }

        public void feedInorganic() {
        hunger -= 20;
        if (hunger < 0) {
            hunger = 0;
        }
    }

        public void feedOrganic() {
        hunger -= 20;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void giveOrganicPetsWater() {
        thirst -= 20;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void giveInorganicPetsOil() {
        thirst -= 20;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void checkHealth() {
        health -= 15;
        if (health < 0) {
            health = 0;
        }
    }

    public void goPotty() {
        waste -= 15;
        if (waste < 0) {
            waste = 0;
        }
    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        boredom += 5;
        waste += 5;
        health += 5;
    }

    @Override
    public String toString() {
        return name + " - " + status + " | Hunger: " + hunger + " | Thirst: " + thirst +
                " | Boredom: " + boredom + " | Waste: " + waste + " | Health: " + health + "\n";
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.status;
    }

    // Make every function to been doing for 5 seconds after that the status of the
    // pet will be waiting for another action
    public void play() {
        if (status.equalsIgnoreCase("Waiting")) {
            System.out.println("The pet is playing");
            boredom++;
            hunger--;
            if (hunger < 0 && hunger > -10) {
                health--;
                System.out.println("Pet is losing health...");
            }
        } else {
            System.out.println("Pet cannot play because is: " + status);
        }
    }

    public void feeding() {
        if (status.equalsIgnoreCase("Waiting")) {
            if (hunger < 10) {
                hunger++;
                if (health < 10) {
                    health++;
                }
                System.out.println("The pet is being fed");
            } else {
                System.out.println("Pet cannot be fed if its full!!!");
            }
        } else {
            System.out.println("Pet cannot be fed because is: " + status + "need to be waiting.");
        }
    }

    // Pets will getting hungry every minute (full--;) if the are waiting or doing
    // something what is not eat.
    public void waiting() {
        if (status.equalsIgnoreCase("Waiting")) {
            // add tick method with the condition of every minute it going to loose 1 point
            // of full
            if (hunger > 0) {
                hunger--;
            } else if (hunger < 0 && hunger > -10) {
                health--;
                hunger--;
                System.out.println("Pet is losing health...");
            }
        }
    }

    public String descriptionOfPet() {
        return null;
    }

    public void resetStatus() {
    }

    public void updateStatus() {
    }

    public void cleanPets() {
    }

}
