/*Take name as input and print a greeting message for that particular name.*/
import java.util.Scanner;

public class _2_PrintGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, "+name);
        input.close();
    }
}
