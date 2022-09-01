/* Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user */

import java.util.Scanner;

public class maxMin {
    
    public static int max(int first, int second, int third) {
        int max = first;
        
        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    public static int min(int first, int second, int third) {
        int min = first;
        
        if (second < min) {
            min = second;
        }
        
        if (third < min) {
            min = third;
        }

        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the first Number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int second = sc.nextInt();
        System.out.print("Enter the third Number: ");
        int third = sc.nextInt();
    
        int max = max(first, second, third);
        int min = min(first, second, third);
    
        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min);
        sc.close();
    }
}
