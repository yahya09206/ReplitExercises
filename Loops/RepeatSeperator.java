/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
*/
import java.util.Scanner;
public class RepeatSeperator {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
    	String separator = scan.next();
    	int count = scan.nextInt();
    	String result = word;

    	for (int i = 0; i <= count - 2; i++) {
    		result += separator + word;
    	}
    	System.out.println(result);
	}
}