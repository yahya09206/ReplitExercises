/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
*/
import java.util.Scanner;
public class Letters {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
    	char end = scan.next().charAt(0);

    	for (char i = start; i <= end; i++) {
    		System.out.print(i);
    	}
	}
}