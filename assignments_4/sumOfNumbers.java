/* Write a function that returns the sum of first n natural numbers */

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = sum(num);
        System.out.println("Sum: "+sum);
        sc.close();
    }

    private static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
