import java.util.Scanner;
public class DataAnalyze {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//-- Preparation work.
		int size;
		int[] Trial0,Trial1,Trial2,Trial3;
		int Sum0 = 0,Sum1 = 0,Sum2 = 0,Sum3 = 0;
		int Avg0,Avg1,Avg2,Avg3;
		int min = 99999999,max = -99999999;
		
//-- User input for sample size.
		System.out.print("Please enter the sample size:");
		size = input.nextInt();
		
//-- User input for each sample, and save in sum.
		System.out.println("Enter numbers for Trial 0");	
		Trial0 = new int [size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			Trial0[i] = input.nextInt();
			Sum0 += Trial0[i];
		}
		System.out.println();
		System.out.println("Enter numbers for Trial 1");	
		Trial1 = new int [size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			Trial1[i] = input.nextInt();
			Sum1 += Trial1[i];
		}
		System.out.println();
		System.out.println("Enter numbers for Trial 2");	
		Trial2 = new int [size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			Trial2[i] = input.nextInt();
			Sum2 += Trial2[i];
		}
		System.out.println();
		System.out.println("Enter numbers for Trial 3");	
		Trial3 = new int [size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			Trial3[i] = input.nextInt();
			Sum3 += Trial3[i];
		}
		System.out.println();

//-- Find averages and save min / max/
		Avg0 = Sum0 / size;
		Avg1 = Sum1 / size;
		Avg2 = Sum2 / size;
		Avg3 = Sum3 / size;
		if(min > Avg0) min = Avg0;
		if(min > Avg1) min = Avg1;
		if(min > Avg2) min = Avg2;
		if(min > Avg3) min = Avg3;
		if(max < Avg0) max = Avg0;
		if(max < Avg1) max = Avg1;
		if(max < Avg2) max = Avg2;
		if(max < Avg3) max = Avg3;
		
//-- Print table for trial samples and result avg.
		System.out.println("\tSample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial 4");
		for(int i = 0; i < size; i++) {
			System.out.println("\t" + i + "\t\t" + Trial0[i] + "\t\t" +Trial1[i] + "\t\t" +Trial2[i] + "\t\t" +Trial3[i]);
		}
		System.out.println("\t----------------------------------------------------------------------");
		System.out.println("Average:\t\t" + Avg0 + "\t\t" + Avg1 + "\t\t" + Avg2 + "\t\t" + Avg3);
		System.out.println();
		
//-- Print min and max.
		System.out.println("Min Average: " + min);
		System.out.println("Max Average: " + max);
		System.out.println();
		
//-- Print trial matches.
		if(min == max)
			System.out.println("The trials match EXACTLY!");
		else if(max < 2 * min)
			System.out.println("The trials concur with each other!");
		else
			System.out.println("The trials do NOT concur!");

//CODE END
	}
}



//Fix sample = 0 error.