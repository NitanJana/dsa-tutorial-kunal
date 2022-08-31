/* Java program to calculate the area of Isosceles Triangle*/

import java.util.Scanner;

public class _4_areaIsoscelesTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();

        System.out.println("The area of the triangle is:"+(base * height * 0.5));

        sc.close();
    }
}