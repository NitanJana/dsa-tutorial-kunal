package Basic;/*Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.*/
import java.util.Scanner;

public class _3_SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter total time(in years): ");
        float time = input.nextFloat();
        System.out.print("Enter the interest rate: ");
        float rate = input.nextFloat();

        float simple_interest = (principal * time * rate) / 100;
        System.out.println("The simple interest is: "+simple_interest);


        input.close();
    }
}
