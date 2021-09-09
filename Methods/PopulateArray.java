/*
The populate method accepts an empty int array and populates it with numbers counting up.
*/
import java.util.Scanner;
public class PopulateArray {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	}
	public static int[] populate(int[] r){
		int[] result;
		for (int i = 0; i <= r; i++) {
			result[i++] += r;
		}
		return result;
	}
}