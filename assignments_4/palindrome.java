/* Write a function to find if a number is a palindrome or not. Take number as parameter */

import java.util.Scanner;

public class palindrome {
    public static void isPalindrome(int num) {
        int temp = num,reverse = 0;
        while (temp != 0) {
            reverse *= 10;
            reverse += (temp % 10);
            temp /= 10;
        }
        System.out.println(reverse);
        if (num == reverse) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        isPalindrome(number);
        sc.close();
    }    
}
