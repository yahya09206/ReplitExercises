/*
Given int num check if the number is positive, negative, or zero

Hint: use 3 if statements to do this

Examples:
*/
import java.util.Scanner;
public class PosNegZero {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
    	int num = s.nextInt();

    	//Write your code here
    	if (num > 0) {
    		System.out.println("positive");
    	}else if(num < 0){
    		System.out.println("negative");
    	}else {
    		System.out.println("Zero");
    	}
	}
}