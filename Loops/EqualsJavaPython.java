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

		for (int i = 0; i <= sentence.length() - 4; i++) {
			String java = sentence.substring(i, i + 4);
			if (java.equals("java")) {
				javaCount++;
			}
		}
		for (int i = 0; i < sentence.length() - 6; i++) {
			String python = sentence.substring(i, i + 6);
			if(python.equals("python")) {
			pythonCount++;
			}
		}
		if (javaCount == pythonCount) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}