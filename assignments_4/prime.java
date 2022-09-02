import java.util.Scanner;

public class Prime {
    public  static void checkPrime(int num) {
        for (int i = 2; i*i < num; i++) {
            if ((num % i) == 0) {
                System.out.println("The number is not prime");
                return;
            }
        }
        System.out.println("The number is prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        checkPrime(number);

        sc.close();
    }
}
