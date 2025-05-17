class MagicShark extends Creature {
    public MagicShark(String name, int age, int hungerLevel) {
        super(name, age, hungerLevel);
    }

    @Override
    public void feed() {
        hungerLevel -= 2;
        if (hungerLevel < 0) hungerLevel = 0;
    }
}