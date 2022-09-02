/* Write a function to check if a given triplet is a Pythagorean triplet or not
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number) */

import java.util.Scanner;

public class Triplet {
    public static boolean isTriplet(int num1, int num2, int num3) {
        int x = num1 * num1;
        int y = num2 * num2;
        int z = num3 * num3;

        if ( x==y+z || y==x+z || z==x+y ) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(isTriplet(num1, num2, num3)){
            System.out.println("The numbers are Pythagorean Triplets");
        }else {
            System.out.println("The numbers are not Pythagorean Triplets");
        }

        sc.close();
    }
}
