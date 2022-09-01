/* Java program to calculate area of circle */

import java.util.Scanner;

public class areaCircle {
    private static final double PI = 3.14;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The area of Circle is: "+(PI * radius * radius));

        sc.close();
    }
}