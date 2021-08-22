/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.
*/
import java.util.Scanner;
public class ReverseIt {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);	
		String word = scan.next();

		if (word.length() > 5 && word.length() < 5) {
			System.out.println("Too short!");
		}else {
			System.out.println(word.substring(4) + word.substring(3,4) + word.substring(2,3) + word.substring(1,2) + word.substring(0,1));
		}
	}
}