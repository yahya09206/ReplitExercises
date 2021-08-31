/*
Create a program that will take the given String In and print out all the vowels from the String.
*/
import java.util.Scanner;
public class PrintVowels {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		char vowels = 'aeiou';

		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i).contains(vowels)) {
				System.out.println(word.charAt(i));
			}
		}
	}
}