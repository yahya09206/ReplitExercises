/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
*/
import java.util.Scanner;
public class WithoutXx {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") || word.startsWith("X")) {
			System.out.println(word.substring(word.indexOf("x"), word.indexOf("X")));
		}else {
			System.out.println(word);
		}
	}
}