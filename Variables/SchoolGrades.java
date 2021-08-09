/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.
*/
import java.util.Scanner;
public class SchoolGrades {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Grader!");
		System.out.println("Please enter subject name number 1 and score for this subject");
		String math = scan.next();
		double grade1 = scan.nextDouble();
		System.out.println("Please enter subject name number 2 and score for this subject");
		String biology = scan.next();
		double grade2 = scan.nextDouble();
		System.out.println("Please enter subject name number 3 and score for this subject");
		String english = scan.next();
		double grade3 = scan.nextDouble();
		System.out.println("Please enter subject name number 4 and score for this subject");
		String chemistry = scan.next();
		double grade4 = scan.nextDouble();
		System.out.println("Please enter subject name number 5 and score for this subject");
		String music = scan.next();
		double grade5 = scan.nextDouble();
		double avg = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

		//Summary
		System.out.println("Summary: " + math + " - " + grade1 + ", " + biology + " - " + grade2 + ", " + english + " - " + grade3 + ", " + chemistry + " - " + grade4 + ", " + music + " - " + grade5);
		System.out.println("Your average score is: " + avg);
		System.out.println("Thank you for using Grader!\n" +
							"Goodbye!");
	}
}