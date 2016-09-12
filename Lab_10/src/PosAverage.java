import java.util.Scanner;
	public class PosAverage {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int count=0, total=0, runningCount=0, val=0;

			do{
				System.out.print("Please enter " + (count+1) + "th number: ");
				val = input.nextInt();
				if(val <= 0) break;
				total += val;
				count++;
			} while(val > 0);
			System.out.println("Average is " + (total/count));
		}
	}