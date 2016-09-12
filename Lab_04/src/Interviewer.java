import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		
		String name;
		String ethic;
		String groupwork;
		int years;
		String introjava;
		int weight;

		System.out.print("What is your name?");
		name = input.next();
		System.out.print("How would you work for an upcomming deadline?");
		ethic = input.next();
		System.out.print("How do you work with others? ");
		groupwork = input.next();
		System.out.print("How many years in industry do you have?");
		years = input.nextInt();	
		System.out.print("Can you print lines in java?");
		introjava = input.next();
		System.out.print("How many pounds do you weigh?");
		weight = input.nextInt();		
		
		double metricweight = weight / 2.2;
		
		System.out.print("Our applicant is " + name + ".");
		System.out.print(" For a deadline they would: " + ethic);
		System.out.print(" They work: " + groupwork + " with others.");
		System.out.print(" They have been in industry: " + (int)years + " years.");
		System.out.print(" Can they print in java: " + introjava + ".");
		System.out.println(" They weigh " + (int)metricweight + " kilograms.");
		
		
		
	}

}
