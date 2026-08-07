import java.util.Scanner;

public class main2 {

    public static void main(String[] arg){


        double width = 0;
        double height = 0;
        double area = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your Full name : ");
        String name = scanner.nextLine();


        System.out.print("Enter your age ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " +age + " years old.");
        System.out.println("You got a cgpa of " +gpa + " in this semester.");
        if (isStudent == true){
            System.out.println("You are a student! ");
        }
        else {
            System.out.println("You are NOT a student! ");
        }

        System.out.print("Width ; ");
        width = scanner.nextDouble();

        System.out.print("height ; ");
        height = scanner.nextDouble();
        scanner.nextLine();


        area = width * height;
       //hii

//        area = scanner.nextDouble();
        System.out.println("The area of the rectangle is " + area);

        scanner.close();

    }
}
