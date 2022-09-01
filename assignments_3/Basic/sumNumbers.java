/* Take integer inputs till the user enters 0 and print the sum of all numbers */

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0, sum = 0;

        System.out.println("Enter series of values (0 to quit): ");

        while ((input = sc.nextInt()) != 0) {
            if (input != 0) {
                sum += input;
            }
        }

        System.out.println("Sum: "+sum);

        sc.close();
    }
}
