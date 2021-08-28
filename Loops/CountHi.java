/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
*/
import java.util.Scanner;
public class CountHi {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int wordcharCount = str.length();
    	int tCharCount = 2;
		int countOfHi = 0;

		for (int i = 0; i <= wordcharCount - tCharCount; i++) {
    		String currentWord = str.substring(i, i + tCharCount);
    		if(currentWord.equals("hi")){
    			countOfHi++;
    		}
    	}
    	System.out.println(countOfHi);
	}
}