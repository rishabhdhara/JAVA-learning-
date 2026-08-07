import java.util.Scanner;

public class main2 {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Full name : ");
         String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();



    }
}
