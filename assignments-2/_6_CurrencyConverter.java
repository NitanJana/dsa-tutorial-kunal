/*Input currency in rupees and output in USD.*/

import java.util.Scanner;

public class _6_CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in inr: ");
        float inr = input.nextFloat();
        float usd = inr / 80;
        System.out.println("The USD value of provided inr is : "+usd);
        input.close();
    }
}
