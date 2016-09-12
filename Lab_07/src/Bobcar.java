import java.util.Scanner;
public class Bobcar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//------------------------------------------------------------------------------------------------------------------------
  		int car, days, member=0, premium=0;
		int base = 0, discount=0, extra=0,rate=0;
		String cartype = "Invalid";
		//------------------------------------------------------------------------------------------------------------------------
		System.out.println("Cars Available: 1 = Economy, 2 = Compact, 3 = Standard.");
		System.out.println("Choose One: ");
		car = input.nextInt();
		System.out.println("How many days will you be using it: ");
		days = input.nextInt();
		if(car == 1){	base = 25*days;		cartype = "Economy";	rate = 25;}
		if(car == 2){	base = 55*days;		cartype = "Compact";	rate = 55;}
		if(car == 3){	base = 100*days;	cartype = "Standard";	rate = 100;}
		
		System.out.println("Are you a member? 0 = No, 1 = Yes: ");
		member = input.nextInt();
		if(member == 1){
			discount = -rate*(days/5);
			System.out.println("Would you like the platinum package? 0 = No, 1 = Yes");
			premium = input.nextInt();
			if(premium == 1)	extra = (int)(base*.2);
		}
		//------------------------------------------------------------------------------------------------------------------------
		System.out.printf("\n%-55s $%7d","Base Price: "+days+" days for a "+cartype+" at $"+rate+" per day:",base);
		if(member == 1){
			System.out.printf("\n%-55s $%7d","Club Member Discount:",discount);
			if(premium == 1){
				System.out.printf("\n%-55s $%7d","Platinum Executive Package:",extra);
			}
		}
		System.out.printf("\n\n%-55s $%7d","Total Estimate for Rental:",(base+discount+extra));
		//------------------------------------------------------------------------------------------------------------------------
		input.close();
	}
}
