/*To find Armstrong Number between two given number.*/


import java.util.Scanner;

public class _9_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower number: ");
        int low = input.nextInt();
        System.out.print("Enter the higher number: ");
        int high = input.nextInt();
        boolean found = false;

        for (int i = low+1; i <high; i++) {
            int temp = i,length =0;
            while(temp!=0) {
                temp /= 10;
                length++;
            }

            int sum = 0;
            temp = i;
            while(temp!=0) {
                sum += Math.pow((temp%10),length);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println("The armstrong number is: "+i);
                found = true;
            }

        }

        if (!found) {
            System.out.println("No armstrong number found in the given range.");
        }
        input.close();
    }
}
