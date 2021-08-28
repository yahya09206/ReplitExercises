/*
Print the number of times that the string "java" appears anywhere in the given string word
*/
import java.util.Scanner;
public class CountJava {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int wordCount = word.length();
		int wordcharCount = 4;
		int javaCount = scan.nextInt();

		for (int i = 0; i <= wordCount - wordcharCount; i++) {
			String currentWord = word.substring(i, i + wordcharCount);
			if (currentWord.equals("java")) {
				javaCount++;
			}
		}
	}
}