/*
Create a method called next3 . This method has an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.
*/
import java.util.Scanner;
public class PrintNextThree {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
    	System.out.print("enter number");
    	int num = inp.nextInt();
		next3(num);
	}
	public static void next3(int num){
		System.out.println("next 3 are:");
		for (int i = num; i < 3; i++) {
			System.out.print(i + " ");
		}
	}
}