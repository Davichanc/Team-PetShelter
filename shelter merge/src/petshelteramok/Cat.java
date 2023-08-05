package petshelteramok;

    public abstract class Cat extends Pet {
        public Cat(String name, int happiness, int health) {
            super(name, happiness, health);
        }
        @Override
        public void tick() {
            petHappiness -= 10;
        }
        
    }
