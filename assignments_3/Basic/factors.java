/* Print factors of a number */

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
