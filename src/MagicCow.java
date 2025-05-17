class MagicCow extends Creature {
    private int milkAmount;

    public MagicCow(String name, int age, int hungerLevel, int milkAmount) {
        super(name, age, hungerLevel);
        this.milkAmount = milkAmount;
    }

    @Override
    public void feed() {
        hungerLevel -= 4;
        if (hungerLevel < 0) hungerLevel = 0;
        milkAmount += 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Milk Quantity: " + milkAmount;
    }
}