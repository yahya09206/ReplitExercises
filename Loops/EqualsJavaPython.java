/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
*/
import java.util.Scanner;
public class EqualsJavaPython {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int javaCount = 0;
		int pythonCount = 0;
		boolean result = true;

		for (int i = 0; i <= sentence.length() - 1; i++) {
			if (sentence.contains("java")) {
				javaCount++;
			}else if(sentence.contains("python")) {
					pythonCount++;
				}
			if (javaCount == pythonCount) {
				result = true;
			}else {
				result = false;
			}
		}
		System.out.println(result);
	}
}