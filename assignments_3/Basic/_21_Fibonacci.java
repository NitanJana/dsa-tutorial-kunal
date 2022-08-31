import java.util.Scanner;

public class _21_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a position in the fibonacci series: ");
        int pos = sc.nextInt();

        int first = 0, second = 1, sum;
        System.out.print(first + ", " + second);
        
        for (int i = 2; i < pos; i++) {
            sum = first + second;
            System.out.print(", "+sum);
            first = second;
            second = sum;
        }
        sc.close();
    }
    
}
