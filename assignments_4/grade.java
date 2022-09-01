import java.util.Scanner;

/* Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail  */

public class grade {
    public static String getGrade(int marks) {
        String grade = new String();
        
        if ((marks > 90) && (marks <= 100)) {
            grade = "AA";
        } else if ((marks > 80) && (marks <= 90)) {
            grade = "AB";
        } else if ((marks > 70) && (marks <= 80)) {
            grade = "BB";
        } else if ((marks > 60) && (marks <= 70)) {
            grade = "BC";
        } else if ((marks > 50) && (marks <= 60)) {
            grade = "CD";
        } else if ((marks > 40) && (marks <= 50)) {
            grade = "DD";
        } else if (marks <= 40) {
            grade = "Fail";
        } 
        return grade;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        String grade = getGrade(marks);
        System.out.println("Your grade is: "+grade);

        sc.close();
    }
}
