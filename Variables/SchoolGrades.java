/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.
*/
import java.util.Scanner;
public class SchoolGrades {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Grader!");
		System.out.println("Please enter the subject name number 1 and score for this subject");
		String subject1 = scan.next();
		int grade1 = scan.nextDoble();
		System.out.println("Please enter the subject name number 2 and score for this subject");
		String subject2 = scan.next();
		int grade2 = scan.nextDoble();
		System.out.println("Please enter the subject name number 3 and score for this subject");
		String subject3 = scan.next();
		int grade3 = scan.nextDoble();
		System.out.println("Please enter the subject name number 4 and score for this subject");
		String subject4 = scan.next();
		int grade4 = scan.nextDoble();
		System.out.println("Please enter the subject name number 5 and score for this subject");
		String subject5 = scan.next();
		int grade5 = scan.nextDoble();



	}
}