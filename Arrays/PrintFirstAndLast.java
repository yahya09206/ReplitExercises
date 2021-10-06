/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
*/
import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLast {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
    	String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

    	// iterate through values
    	for (int i = 0; i < words.length - 1; i++) {
    		String eachWord = words[i];
            System.out.println("" + eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1));
    	}
	}
}