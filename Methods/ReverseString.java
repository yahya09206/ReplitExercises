//The reverse method will reverse the given String
import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args) {
		
		// Scanner in = new Scanner(System.in);
		// System.out.println(reverse(in.next()));
		System.out.println(reverseString("jimmy"));
	}

	public static String reverseString(String word){
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		return result;
	}
}