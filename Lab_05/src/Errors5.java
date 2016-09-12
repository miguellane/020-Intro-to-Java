import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {

		int weight, age;
		Scanner keyboard;
		
		System.out.print("What is your weight in kg? " );
		keyboard = new Scanner(System.in);
		weight = keyboard.nextInt();
		
//Moved scanner define.
//		Scanner keyboard;
//Moved weight and age define.
//		int weight, age;

		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow you are " + (int) (age*6.9) + " in dog years.");
//		System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point");
		System.out.println("Your weight in lbs is " + (int)(weight * 2.2) + " with no decimal point");
		
	}

}