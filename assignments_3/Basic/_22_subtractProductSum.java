/* Calculate the differnce between the Product and Sum of Digits of an Integer */

import java.util.Scanner;

public class _22_subtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int sum = 0, product = 1, digit;

        while(number != 0){
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        System.out.println("The difference between the Product and Sum of Digits of the Number is: "+(product - sum));

        sc.close();
    }
}
