/*
Write a program that will print out first and last letters together.
*/
import java.util.Scanner;
public class PrintFirstAndLastLetter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.println(word.charAt(0) + word.substring(word.length()-1));
	}
}