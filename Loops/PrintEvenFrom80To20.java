/*
Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
*/
import java.util.Scanner;
public class PrintEvenFrom80To20 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		for (int i = 80; i > 20; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (i == 22) {
					System.out.println(20);
				}
			}
		}
	}
}