/*
Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.
*/
import java.util.Scanner;
public class SigNum {
	public static void main(String[] args){
		sign(n);
	}
	public static void sign(int n){

		if (n > 0) {
			System.out.println("positive");
		}else if (n < 0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}
}