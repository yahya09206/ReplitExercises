/*
Write a program that will print out the first character of the word.
*/
import java.util.Scanner;

public class PrintFirstLetter {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.println(word.charAt(0));

	}
}