/*To calculate Fibonacci Series up to n numbers.*/


import java.util.Scanner;

public class _7_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a position in the fibonacci series: ");
        int position = input.nextInt();

        int first = 0,second = 1,sum;
        System.out.print(first+", "+second);
        for (int i=2; i<position; i++) {
            sum = first + second;
            System.out.print(", "+sum);
            first = second;
            second = sum;
        }
        input.close();
    }
}
