import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MagicFarm farm = new MagicFarm();
        farm.createCreatures();
        List<Creature> creatures = farm.getCreatures();
        List<Action> actions = new ArrayList<>();
        for (int i = 0; i < creatures.size(); i++) {
            actions.add(new FeedAction()); // Create the feed action for each creature
        }

        System.out.println("Welcome to our Magic Farm!🙌🏻🎉");

        while (true) {
            Action selectedAction = Menu.showMenu(actions, creatures); // Get action from menu

            if (selectedAction == null) { // If null, user chose to quit
                System.out.println("Thanks for visiting the Magic Farm! 👋🌾");
                break;
            }

            int index = actions.indexOf(selectedAction);
            if (index >= 0 && index < creatures.size()) {
                Creature selected = creatures.get(index);
                String result = selectedAction.execute(selected); // Feed the selected creature
                System.out.println(result);
                System.out.println("\nUpdated List of All Creatures:");
                for (Creature creature : creatures) {
                    System.out.println(creature);
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
