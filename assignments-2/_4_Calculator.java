/*Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)*/


import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class _4_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.print("Enter first Number: ");
        double num1 = input.nextDouble();
        out.print("Enter Second Number: ");
        double num2 = input.nextDouble();

        out.print("Enter an operator (+, -, *, /): ");
        String oper = input.next();

        if (Objects.equals(oper, "+")) {
            out.println("The sum of the numbers is: "+(num1+num2));
        } else if (Objects.equals(oper, "-")) {
            if (num1 > num2) {
                out.println("The difference between the numbers is: " + (num1 - num2));
            }else {
                out.println("The difference between the numbers is: " + (num2 - num1));
            }
        } else if (Objects.equals(oper, "*")) {
            out.println("The multiplication of the numbers is: " + (num2 * num1));
        } else if(Objects.equals(oper, "/")){
            if (num2!=0) {
                out.println("The division of the numbers is: " + (num1 / num2));
            }else {
                out.println("Divide by zero is not possible");
            }
        }

        input.close();
    }
}
