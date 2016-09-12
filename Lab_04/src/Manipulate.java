import java.util.Scanner;


public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

//------------------------------------------------------------------------------------------------------------------------
		System.out.print("Give me 2 numbers.");
  		int in1;
		int in2;
		in1 = input.nextInt();
		in2 = input.nextInt();
		System.out.println("The sum of " +in1 +" + " +in2 +" is " +(int)(in1 + in2) +".");
		System.out.println("The difference of " +in1 +" - " +in2 +" is "+(int)(in1 - in2) +".");
		System.out.println("The product of " +in1 +" * " +in2 +" is "+(int)(in1 * in2) +".");
		System.out.println("The quotent of " +in1 +" / " +in2 +" is "+(int)(in1 / in2) +".");
		System.out.println("The remainder of " +in1 +" % " +in2 +" is "+(int)(in1 % in2) +".");
//------------------------------------------------------------------------------------------------------------------------
		System.out.print("Give me 2 shorts.");
  		Short sn1;
		Short sn2;
		sn1 = input.nextShort();
		sn2 = input.nextShort();
		System.out.println("The sum of " +sn1 +" + " +sn2 +" is " +(short)(sn1 + sn2) +".");
		System.out.println("The difference of " +sn1 +" - " +sn2 +" is "+(short)(sn1 - sn2) +".");
		System.out.println("The product of " +sn1 +" * " +sn2 +" is "+(short)(sn1 * sn2) +".");
		System.out.println("The quotent of " +sn1 +" / " +sn2 +" is "+(short)(sn1 / sn2) +".");
		System.out.println("The remainder of " +sn1 +" % " +sn2 +" is "+(short)(sn1 % sn2) +".");
//------------------------------------------------------------------------------------------------------------------------
		System.out.print("Give me 2 floats.");
  		Float fn1;
		Float fn2;
		fn1 = input.nextFloat();
		fn2 = input.nextFloat();
		System.out.println("The sum of " +fn1 +" + " +fn2 +" is " +(float)(fn1 + fn2) +".");
		System.out.println("The difference of " +fn1 +" - " +fn2 +" is "+(float)(fn1 - fn2) +".");
		System.out.println("The product of " +fn1 +" * " +fn2 +" is "+(float)(fn1 * fn2) +".");
		System.out.println("The quotent of " +fn1 +" / " +fn2 +" is "+(float)(fn1 / fn2) +".");
		System.out.println("The remainder of " +fn1 +" % " +fn2 +" is "+(float)(fn1 % fn2) +".");
//------------------------------------------------------------------------------------------------------------------------
		System.out.print("Give me 2 doubles.");
  		Double dn1;
		Double dn2;
		dn1 = input.nextDouble();
		dn2 = input.nextDouble();
		System.out.println("The sum of " +dn1 +" + " +dn2 +" is " +(double)(dn1 + dn2) +".");
		System.out.println("The difference of " +dn1 +" - " +dn2 +" is "+(double)(dn1 - dn2) +".");
		System.out.println("The product of " +dn1 +" * " +dn2 +" is "+(double)(dn1 * dn2) +".");
		System.out.println("The quotent of " +dn1 +" / " +dn2 +" is "+(double)(dn1 / dn2) +".");
		System.out.println("The remainder of " +dn1 +" % " +dn2 +" is "+(double)(dn1 % dn2) +".");
//------------------------------------------------------------------------------------------------------------------------

	}

}
