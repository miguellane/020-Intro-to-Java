import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		System.out.println("You have entered " + num);
		if((num >= 0)&&(num <= 25)){
				char letter = 'A';
				letter += num;
				System.out.println(num +" letter of the alphabet is "+ letter);		
		}else
			System.out.println("Outside of acceptable range.");
	}
}
