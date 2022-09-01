import java.util.Scanner;

/* Write a program to print the sum of two numbers entered by user by defining your own method */

public class sum {
    public static int add(int num1, int num2)  {
        return (num1 + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int sum = add(first, second);
        System.out.println("Sum: "+sum);
        sc.close();
    }
}
