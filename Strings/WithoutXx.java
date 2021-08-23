/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
*/
import java.util.Scanner;
public class WithoutXx {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") && word.endsWith("X")) {
			System.out.println(word.substring(1, word.indexOf("X")));
		}else if(word.startsWith("x")){
			System.out.println(word.substring(1));
		}else if(word.endsWith("X")){
			System.out.println(word.substring(0, word.length() - 1));
		}else {
			System.out.println(word);
		}
	}
}