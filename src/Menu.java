import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static Action showMenu(List<Action> actions, List<Creature> creatures) {
        Scanner scanner = new Scanner(System.in);
        char option = 'a';
        Map<Character, Action> actionMap = new LinkedHashMap<>();

        // Display available actions
        for (int i = 0; i < creatures.size(); i++) {
            if (creatures.get(i).isFed()) continue; // Skip already fed creatures
            System.out.println(option + ": " + actions.get(i).menuDescription(creatures.get(i)));
            actionMap.put(option, actions.get(i));
            option++;
        }
        System.out.println("q: Quit the Magic Farm");

        // User input handling
        char choice;
        do {
            System.out.print("Choose an option: ");
            choice = scanner.next().charAt(0);
            if (choice == 'q') {
                return null; // Return null if user wants to quit
            }
        } while (!actionMap.containsKey(choice)); // Validate choice
        if (choice == 'q') {
            return null; // Return null if user wants to quit
        }
        return actionMap.get(choice); // Return the selected action
    }
}
