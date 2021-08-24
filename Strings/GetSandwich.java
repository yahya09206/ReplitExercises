/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
*/
import java.util.Scanner;
public class GetSandwich {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		if (word.startsWith("bread") && word.endsWith("bread")) {
			System.out.println(word.substring(word.indexOf("d"), word.indexOf("b")));
		}else {
			System.out.println("nothing");
		}
	}
}