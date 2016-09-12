import java.util.Scanner;


public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		System.out.print("Please enter the base:");
		int base = input.nextInt();
		
		int i;
		
		for (i = base; i <= max; i += base) {
			System.out.println("Number " + i);
		}
	}

}
