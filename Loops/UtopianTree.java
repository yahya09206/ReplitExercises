/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.
*/
import java.util.Scanner;
public class UtopianTree {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int growth = 0;
		int count = 1;

		for (int i = 1; i <= 10; i++) {
			if (i <= 3) {
				count = 1;
			}else {
				count = 2;
			}
			growth += count;
			if (i == 3) {
				System.out.println("year " + i + " - growth " + count + " cm");
				System.out.println("tree size: " + growth + "cm");
			}else {
				System.out.println("year " + i + " - growth " + count + " cm");
				System.out.println("tree size: " + growth + "cm");
			}
		}
	}
}