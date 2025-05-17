abstract class Creature {

    protected String name;
    protected int age;
    protected int hungerLevel;

    public Creature(String name, int age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public abstract void feed();

    public boolean isFed() {
        return hungerLevel == 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + " days, Hunger Level: " + hungerLevel;
    }
}
