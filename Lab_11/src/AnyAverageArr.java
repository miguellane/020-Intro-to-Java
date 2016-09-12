import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the amount of numbers to average:");
		int max = input.nextInt();
		int[]arr1 = new int[max];
		int sum = 0;
		
//Save each into array
		for (int i = 0;i < max;++i){
			System.out.print("Please enter " + i + " number:");
			arr1[i] = input.nextInt();
		}
//Print each and add to total "sum"
		for (int j = 0;j < max;++j){
			System.out.print(arr1[j] + " ");
			if(j%5 == 4)
				System.out.println("");
			sum += arr1[j];
		}
		
		System.out.println("\nAverage of all is " + sum/max);
				
	}
}
