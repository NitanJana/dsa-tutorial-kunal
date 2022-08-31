/* Java program to calculate area of Rectangle*/
import java.util.Scanner;

public class _3_areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();

        System.out.println("The area of the rectangle is: "+(length * width));

        sc.close();
    }
    
}
