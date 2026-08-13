import java.util.Scanner;


//

public class WeightConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        System.out.println("=== Weight Converter ===");

        while (keepGoing) {
            printMenu();

            System.out.print("Choose an option (1-7): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertAndPrint(scanner, "kg", "lbs");
                    break;
                case 2:
                    convertAndPrint(scanner, "lbs", "kg");
                    break;
                case 3:
                    convertAndPrint(scanner, "kg", "g");
                    break;
                case 4:
                    convertAndPrint(scanner, "g", "kg");
                    break;
                case 5:
                    convertAndPrint(scanner, "lbs", "oz");
                    break;
                case 6:
                    convertAndPrint(scanner, "oz", "lbs");
                    break;
                case 7:
                    keepGoing = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 7.");
            }
        }

    scanner.close();
    }

    // Shows the list of options to the user.
    public static void printMenu() {
        System.out.println();
        System.out.println("1. Kilograms -> Pounds");
        System.out.println("2. Pounds -> Kilograms");
        System.out.println("3. Kilograms -> Grams");
        System.out.println("4. Grams -> Kilograms");
        System.out.println("5. Pounds -> Ounces");
        System.out.println("6. Ounces -> Pounds");
        System.out.println("7. Exit");
    }

    // Asks the user for a value, converts it, and prints the result.
    public static void convertAndPrint(Scanner scanner, String fromUnit, String toUnit) {
        System.out.print("Enter the weight in " + fromUnit + ": ");
        double inputValue = scanner.nextDouble();

        double result = 0;

        if (fromUnit.equals("kg") && toUnit.equals("lbs")) {
            result = kgToLbs(inputValue);
        } else if (fromUnit.equals("lbs") && toUnit.equals("kg")) {
            result = lbsToKg(inputValue);
        } else if (fromUnit.equals("kg") && toUnit.equals("g")) {
            result = kgToGrams(inputValue);
        } else if (fromUnit.equals("g") && toUnit.equals("kg")) {
            result = gramsToKg(inputValue);
        } else if (fromUnit.equals("lbs") && toUnit.equals("oz")) {
            result = lbsToOz(inputValue);
        } else if (fromUnit.equals("oz") && toUnit.equals("lbs")) {
            result = ozToLbs(inputValue);
        }

        System.out.printf("%.2f %s = %.2f %s%n", inputValue, fromUnit, result, toUnit);
    }

    // ---- Conversion methods ----
    // Each one uses a fixed conversion factor.

    public static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    public static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }

    public static double kgToGrams(double kg) {
        return kg * 1000;
    }

    public static double gramsToKg(double g) {
        return g / 1000;
    }

    public static double lbsToOz(double lbs) {
        return lbs * 16;
    }

    public static double ozToLbs(double oz) {
        return oz / 16;
    }

 }
