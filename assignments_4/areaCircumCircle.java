import java.util.Scanner;

public class AreaCircumCircle {
    public static final double PI = 3.14;

    public static double area(double radius)  {
        return PI * radius * radius;
    }

    public static double circum(double radius)  {
        return 2 * PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.println("The area of the circle is: "+(float) area(radius));
        System.out.println("The circumference of the circle is: "+(float) circum(radius));

        sc.close();
    }
}
