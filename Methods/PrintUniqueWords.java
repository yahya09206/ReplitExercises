/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.
*/
import java.util.Scanner;
public class PrintUniqueWords {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	}

	public static void printUniqueWords(String[] words){
    //WRITE YOUR CODE HERE
    for (int i = 0; i < words.length; i++) {
    	int count = 0;
    	for (int j = 0; j < words.length; j++) {
    		if (words[i].equalsIgnoreCase(words[j])) {
    			count++;
    		}
    	}
    	if (count == 1) {
    		System.out.println(words[i]);
    	}
    }
  }
}