/*
Print the number of times that the string "java" appears anywhere in the given string word
*/
import java.util.Scanner;
public class CountJava {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int wordcharCount = word.length();
		int jCharCount = 4;
		int javaCount = 0;

		for (int i = 0; i <= wordcharCount - jCharCount; i++) {
			String currentWord = word.substring(i, i + jCharCount);
			if (currentWord.equals("java")) {
				javaCount++;
			}
		}
		System.out.println(javaCount);
	}
}