/*
Write a program that will print out last letter of the word (string).
*/
import java.util.Scanner;

public class PrintLastLetter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		System.out.println(word.substring(word.length()-1));
	}
}