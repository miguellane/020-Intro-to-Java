import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i;
		int sum = 0;
		for (i = 1; i <= max; ++i) {
			System.out.println("Number " + i);
			sum += i;
		}
		System.out.println("Sum of All is " + sum);
	}
}
