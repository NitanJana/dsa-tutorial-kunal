/* Java program to calculate area of Parallelogram*/

import java.util.Scanner;

public class _5_areaParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the Parallelogram: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the Parallelogram: ");
        int height = sc.nextInt();

        System.out.println("The area of the Parallelogram is:"+(base * height));

        sc.close();
    }
}
