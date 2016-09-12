import java.util.Scanner;


public class SumSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		
		int i;
		int sq;
		int sqsum = 0;
		
		for (i = 1; i <= max; ++i) {
			sq = i*i;
			System.out.println("Number " + i + " squared is " + sq);
			sqsum += sq;
		}
		System.out.println("Sum of squares is " + sqsum);
	}

}
