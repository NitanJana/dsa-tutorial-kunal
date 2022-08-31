/* Java program to calculate area of Rhombus*/

import java.util.Scanner;

public class _6_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the Rhombus: ");
        int base = sc.nextInt();
        System.out.print("Enter the height of the Rhombus: ");
        int height = sc.nextInt();

        System.out.println("The area of the Rhombus is:"+(base * height));

        sc.close();
    }
    
}
