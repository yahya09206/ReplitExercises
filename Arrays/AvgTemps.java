/*
Given an array temps with temperature values find and print the average value
*/
import java.util.Arrays;
public AvgTemps {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

		double sum = 0;
		for (int i = 0; i < temps.length; i++) {
			sum += n;
		}
		double avg = sum / temps;
		System.out.println(avg);
	}
}