import java.util.ArrayList;
import java.util.Scanner;

public class Mad_libs {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean playing = true;

        System.out.println("=== Welcome to Mad Libs! ===");

        // Keep showing the menu until the user chooses to quit
        while (playing) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    playStory1();
                    break;
                case 2:
                    playStory2();
                    break;
                case 3:
                    playStory3();
                    break;
                case 4:
                    System.out.println("Thanks for playing!");
                    playing = false;
                    break;
                default:
                    System.out.println("That's not a valid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nChoose a story:");
        System.out.println("1. A Day at the Zoo");
        System.out.println("2. The Superhero Adventure");
        System.out.println("3. My Weird Vacation");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
    }

    // Reads user input safely, even if they type something that isn't a number
    private static int getUserChoice() {
        int choice = -1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // choice stays -1, which falls through to the default menu case
        }
        return choice;
    }

    // Asks the user a list of questions (like "Adjective", "Noun") and
    // returns all their answers in the same order they were asked
    private static ArrayList<String> collectAnswers(String[] prompts) {
        ArrayList<String> answers = new ArrayList<>();
        for (String prompt : prompts) {
            System.out.print(prompt + ": ");
            answers.add(scanner.nextLine());
        }
        return answers;
    }

    private static void playStory1() {
        String[] prompts = {
                "Adjective", "Animal (plural)", "Verb ending in -ing",
                "Noun", "Silly word", "Number"
        };
        ArrayList<String> a = collectAnswers(prompts);

        String story = String.format(
                "Today I went to the zoo and saw a %s group of %s %s near the %s. " +
                        "One of them yelled \"%s!\" and then %s more showed up. What a day!",
                a.get(0), a.get(1), a.get(2), a.get(3), a.get(4), a.get(5)
        );

        printStory(story);
    }

    private static void playStory2() {
        String[] prompts = {
                "Superhero name", "Adjective", "City name",
                "Verb ending in -ed", "Object", "Number"
        };
        ArrayList<String> a = collectAnswers(prompts);

        String story = String.format(
                "%s put on a %s cape and flew over %s. Suddenly, a villain %s and stole a %s! " +
                        "It took %s minutes to save the day, but %s did it with style.",
                a.get(0), a.get(1), a.get(2), a.get(3), a.get(4), a.get(5), a.get(0)
        );

        printStory(story);
    }

    private static void playStory3() {
        String[] prompts = {
                "Country", "Adjective", "Food", "Verb ending in -ing",
                "Body of water", "Exclamation"
        };
        ArrayList<String> a = collectAnswers(prompts);

        String story = String.format(
                "My family and I flew to %s for vacation. The hotel was so %s that we ate " +
                        "%s for breakfast every day. On the last day we went %s in the %s and someone " +
                        "shouted \"%s!\" It was unforgettable.",
                a.get(0), a.get(1), a.get(2), a.get(3), a.get(4), a.get(5)
        );

        printStory(story);
    }

    private static void printStory(String story) {
        System.out.println("\n--- Your Mad Lib Story ---");
        System.out.println(story);
        System.out.println("--------------------------");
    }
}