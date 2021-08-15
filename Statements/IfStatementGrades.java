/*
Write a program that takes the grade int and prints if it's a passing grade or failure.

if grade is bigger than 90 output "excellent"
if the grade is bigger than 70 and smaller then 90 output "good"
if grade is bigger than 60 and smaller than 70 output "pass"
if grade is smaller than 60 output "fail"
*/
import java.util.Scanner;
public class IfStatementGrades {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();

		if (grade > 90) {
			System.out.println("excellent");
		}else if (grade > 70 && grade < 90){
			System.out.println("good");
		}
	}
}