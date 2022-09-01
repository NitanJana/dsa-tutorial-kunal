/* Write a function that returns all prime numbers between two given numbers */

import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("The prime nmubers are: ");
        PrimeRange(num1, num2);

        sc.close();
    }

    private static void PrimeRange(int num1, int num2) {
        for (int i = num1; i < num2; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int num) {
        boolean flag = true;
        if (num < 2) {
            flag =false;
            return flag;
        }
        for (int i = 2; i*i <= num; i++) {
            if ((num % i) == 0) {
                flag = false;
                break;
            }
            
        }
        return flag;
    }    
}
