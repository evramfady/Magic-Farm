class MagicDuck extends Creature {
    private int eggQuantity;

    public MagicDuck(String name, int age, int hungerLevel, int eggQuantity) {
        super(name, age, hungerLevel);
        this.eggQuantity = eggQuantity;
    }

    @Override
    public void feed() {
        hungerLevel -= 3;
        if (hungerLevel < 0) hungerLevel = 0;
        eggQuantity += 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Egg Quantity: " + eggQuantity;
    }
}
