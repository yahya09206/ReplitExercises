/*
When word has odd number of characters and:
3 or more characters, print middle letter
Single character, print that character 3 times
When word has even number of characters and:
4 or more characters, print the middle 2 characters
2 characters, print those 2 characters twice
*/
import java.util.Scanner;
public class MiddleOne {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.length() >= 3 && word.length() % 2 != 0) {
			System.out.println(word.charAt(word.length()-1 / 2));
		}else if(word.length() == 1){
			System.out.println(word + word + word);
		}

	}
}