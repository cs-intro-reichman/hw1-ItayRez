

// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	
	// Retrieve and parse inputs from the user(command)
		// currentValue (nonnegative integer)
		int currentValue = Integer.parseInt(args[0]);
		// rate (percentage between 0 and 100)
		double rate = Double.parseDouble(args[1]);
		// n (nonnegative integer number of years)
		int n = Integer.parseInt(args[2]);

		// Calculation of futureValue following given formula
		double futureValue = currentValue * (Math.pow(1 + rate/100, n));

		// Print the result
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);



	}
}