import java.util.Scanner;

public class main2 {

    public static void main(String[] arg){
        //Mad Libs game

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String Noun;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an Adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a Noun (Name of an animal/person): ");
        Noun = scanner.nextLine();
        System.out.print("Enter an adjective (Description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb(action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective(Description): ");
        adjective3 = scanner.nextLine();

        System.out.print("Today i went to a " +adjective1+ " zoo.");
        System.out.print("There I saw a " +Noun+ " ." );
        System.out.print(Noun +" was very " +adjective2 + " and " +verb1+ "!");
        System.out.print("I was very "+ adjective3 + "!");

        scanner.close();
        //
    }
}
