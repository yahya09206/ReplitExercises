/*
Implement the do_switch method Switch the last element in an array with the first and return the array.
*/
import java.util.Arrays;
import java.util.Scanner;
class Main {

  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
    Arrays.toString(do_switch(arr));

  }
  public static int[] do_switch(int[] i) {
    // your codes here:
    int temp = i[0];
    temp = i[0];
    i[0] = i[i.length - 1];
    i[i.length - 1] = temp;
    return i;
	}
}