/* Take integer inputs till the user enters 0 and print the largest number from all */
import java.util.Scanner;

public class _25_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter series of Numbers (0 to quit): ");
        int input = 0,large = 0;

        while ((input = sc.nextInt()) != 0) {
            if (input > large) {
                large = input;
            }
        }
        System.out.println("Largest: "+large);

        sc.close();
    }
}
