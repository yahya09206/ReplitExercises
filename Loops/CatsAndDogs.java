/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
*/
import java.util.Scanner;
public class CatsAndDogs {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
    	int countOfDogs = 0;
    	//String word = scan.next();
    	String word = "ilovejava";
    	int wordcharCount = word.length();
    	int tCharCount = 3; // character count of target word we are looking for

    	for (int i = 0; i <= wordcharCount - tCharCount; i++) {
    		// System.out.println(word.substring(i, i + tCharCount));
    		String currentWord = word.substring(i, i + tCharCount);
    		System.out.println(currentWord);

    		if(currentWord.equals("cat")){
    			countOfCats++;
    		}else if(currentWord.equals("dog")){
    			countOfDogs;
    		}
    	}	
	}
}