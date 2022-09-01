/* Java program to calculate the area of Triangle*/

import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();

        System.out.println("The area of the circle is: "+(base * height * 0.5));

        sc.close();
    }
}
