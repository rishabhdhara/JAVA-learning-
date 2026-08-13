
        import java.util.Scanner;

    /**
     CompoundInterestCalculator

     Asks the user for a principal amount, annual interest rate,
     how many times per year interest is compounded, and the number
     of years to invest.
     * Formula used: A = P * (1 + r/n)^(n*t)
     A = final amount
     P = principal (starting amount)
     r = annual interest rate (as a decimal, e.g. 5% -> 0.05)
     n = number of times interest is compounded per year
     t = number of years
     */

    public class CompoundInterestCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Compound Interest Calculator ===");

            double principal = readDouble(scanner,"Enter the principal amount, e.g. 1000: ");
            double annualRatePercent = readDouble(scanner, "Enter the annual interest rate as a percent, e.g. 5 for 5%: ");
            int timesCompoundedPerYear = readInt(scanner, "Enter how many times per year interest is compounded (1=yearly, 12=monthly, 365=daily): ");
            int years = readInt(scanner, "Enter the number of years: ");

            scanner.close();

            double annualRate = annualRatePercent / 100.0;

            System.out.println();
            System.out.println("Year-by-year growth:");
            System.out.printf("%-6s %-15s %-15s%n", "Year", "Balance", "Interest Earned");

            double startingBalance = principal;

            for (int year = 1; year <= years; year++) {
                double balance = compoundInterestAmount(principal, annualRate, timesCompoundedPerYear, year);
                double interestSoFar = balance - principal;
                System.out.printf("%-6d $%-14.2f $%-14.2f%n", year, balance, interestSoFar);
            }

            double finalBalance = compoundInterestAmount(principal, annualRate, timesCompoundedPerYear, years);
            double totalInterest = finalBalance - startingBalance;

            System.out.println();
            System.out.printf("Starting principal: $%.2f%n", startingBalance);
            System.out.printf("Final balance after %d year(s): $%.2f%n", years, finalBalance);
            System.out.printf("Total interest earned: $%.2f%n", totalInterest);
        }

        /**
         * Calculates the compound interest amount using:
          A = P * (1 + r/n)^(n*t)
         */
        public static double compoundInterestAmount(double principal, double annualRate, int timesCompoundedPerYear, int years) {
            return principal * Math.pow(1 + (annualRate / timesCompoundedPerYear), timesCompoundedPerYear * (double) years);
        }


        private static double readDouble(Scanner scanner, String prompt) {
            while (true) {
                System.out.print(prompt);
                String input = scanner.nextLine();
                try {
                    return Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("That doesn't look like a valid number. Please try again.");
                }
            }
        }

        private static int readInt(Scanner scanner, String prompt) {
            while (true) {
                System.out.print(prompt);
                String input = scanner.nextLine();
                try {
                    int value = Integer.parseInt(input);
                    if (value < 1) {
                        System.out.println("Please enter a number of 1 or greater.");
                        continue;
                    }
                    return value;
                } catch (NumberFormatException e) {
                    System.out.println("That doesn't look like a valid whole number. Please try again.");
                }
            }
        }
    }


