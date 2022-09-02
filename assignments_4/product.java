import java.util.Scanner;

/* Define a method that returns the product of two numbers entered by user. */
public class Product {
    public static void getProduct(int num1, int num2)  {
        System.out.println("The product of these two numbers are: "+(num1 * num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        getProduct(first, second);

        sc.close();
    }
}
