/*Take 2 numbers as input and print the largest number.*/
package Basic;

import java.util.Scanner;

public class _5_LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Both the numbers are same");
        } else if(num1 > num2){
            System.out.println("The largest number is "+num1);
        }else {
            System.out.println("The largest number is "+num2);

        }
        input.close();
    }
}
