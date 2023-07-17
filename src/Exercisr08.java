
public class Exercisr08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 87, 88}				
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		sum = 0;
		avg = 0;
		count = 0;
		
		for (int[] arr:array)
			for (int n : arr) {
				sum += n;
				count++;
			}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
