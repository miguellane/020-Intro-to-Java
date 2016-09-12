import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("What is your name?");
		name = input.next();
		System.out.println("How are you " + name + ".");
		
		String ethic;
		System.out.print("How would you work for an upcomming deadline?");
		ethic = input.next();
		System.out.println("For a deadline they would: " + ethic);
		
		String groupwork;
		System.out.print("How do you work with others? ");
		groupwork = input.next();
		System.out.println("They work " + groupwork + " with others.");
		
		int years;
		System.out.print("How many years in industry do you have?");
		years = input.nextInt();
		System.out.println("They have been in industry: " + years + " years.");
		
		String introjava;
		System.out.print("Can you print lines in java?");
		introjava = input.next();
		System.out.println("Can they print in java: " + introjava + ".");

	}

}
