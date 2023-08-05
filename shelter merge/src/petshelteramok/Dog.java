package petshelteramok;

public abstract class Dog extends Pet {

        public Dog(String name, int happiness, int health) {
            super(name, happiness, health);
        }
        @Override
        public void tick() {
            petHappiness -= 10;
        }
    }
