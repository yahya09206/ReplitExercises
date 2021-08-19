/*
Write a program that will verify if the sentence contains word. Print out the result as a boolean value.
*/
import java.util.Scanner;

public class VerifyContain {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();
    	String sentence = scan.nextLine();
    	boolean result = false;

    	if (sentence.contains(word)) {
    		System.out.println(true);
    	}else {
    		System.out.println(false);
    	}
	}
}