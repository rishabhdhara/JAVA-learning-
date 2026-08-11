import java.util.Scanner;

public class main2 {
    public static void  main(String[] args){

        // Shopping cart problem

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;

        System.out.print("What would you like to have? : ");
        item = scanner.nextLine();

        System.out.print("Price for one plate : ");
        price = scanner.nextDouble();

        System.out.print("how many plates would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity ;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total );




        scanner.close();
    }

}