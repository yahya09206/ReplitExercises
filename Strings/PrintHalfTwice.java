/*
Write a program that will print out first half of the word twice.
*/
import java.util.Scanner;
public class PrintHalfTwice {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int getMiddle = (word.length()) / 2;
    	String firstHalf = word.substring(0, getMiddle);
		System.out.println(firstHalf + firstHalf);
	}
}