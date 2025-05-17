import java.util.ArrayList;
import java.util.List;

class MagicFarm {
    private static List<Creature> creatures = new ArrayList<>();

    public void createCreatures() {
        creatures.add(new MagicDuck("Donald", 10, 10, 3));
        creatures.add(new MagicDuck("Quackers", 200, 10, 3));
        creatures.add(new MagicCow("Moozy", 40, 10, 10));
        creatures.add(new MagicCow("Sparkle", 430, 10, 12));
        creatures.add(new MagicShark("Finn", 5, 10));
        creatures.add(new MagicShark("Storm", 60, 10));
    }
    public void addCreature(Creature creature) {
        creatures.add(creature);
    }
    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }
    public void clearCreatures() {
        creatures.clear();
    }
    public List<Creature> getCreatures() {

        return creatures;
    }
}