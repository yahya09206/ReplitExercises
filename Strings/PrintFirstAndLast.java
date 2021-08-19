/*
Write a program that will print out first and last letters together.
*/
import java.util.Scanner;
public class PrintFirstAndLastLetter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String first = word.charAt(0);
		String last = word.charAt(word.length()-1);

		
	}
}