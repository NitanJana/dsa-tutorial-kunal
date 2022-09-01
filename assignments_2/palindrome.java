/*To find out whether the given String is Palindrome or not.*/


import java.util.Objects;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome:");
        String str = input.next();
        StringBuilder rev = new StringBuilder();

        for (int i = str.length()-1; i >=0 ; i--) {
            rev.append(str.charAt(i));
        }

        if(Objects.equals(str, rev.toString())) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
        input.close();
    }
}
