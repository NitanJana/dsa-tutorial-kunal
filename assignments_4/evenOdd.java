/* Define a program to find out whether a given number is even or odd */
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        even_Odd(number);
        sc.close();
    }
    public static void even_Odd(int num) {
        if ((num % 2) == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
