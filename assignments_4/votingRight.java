import java.util.Scanner;

/* A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote */
public class votingRight  {
    public static void eligible(int age)  {
        if (age >=18)  {
            System.out.println("This person is eligible to vote");
        } else  {
            System.out.println("This person is not eligible to vote");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        eligible(age);

        sc.close();
    }
}
