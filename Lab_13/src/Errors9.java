
public class Errors9 {

		public static void main(String[] args) {
//Syntax	double[] inp = {1.0, 2.0. 3,.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0}
//Syntax	double[] inp = {1.0, 2.0. 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
//Syntax	double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
			double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
//Syntax	int sum;
//Syntax	double sum;
			double sum = 0;
		
			for (int i = 1; i <= inp.length-1; ++i ) {
//Syntax		Sum = inp[i] + inp[i*i];
//Runtime		sum = inp[i] + inp[i*i];
//Logic			sum = inp[i] * inp[i];
//Logic			sum += inp[i] * inp[i];
				sum += inp[i] * inp[i];
//Logic			System.out.println("Squared of index " + sum + " is " + inp[i]);
//Logic			System.out.println("Squared of index " + i + " is " + inp[i]);
				System.out.println("Squared of index " + i + " is " + inp[i]*inp[i]);

			}
			System.out.println("Sum of Squares is " + sum);
		}
}
