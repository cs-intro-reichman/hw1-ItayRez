// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		// Retrieve three diners' names from the user(command line)
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		// Parse the bill amount from string to double and divide by 3 (number of diners)
		// Use Math.ceil to round the payment up to the next whole Shekel
		double everyDinersPart = Math.ceil(Double.parseDouble(args[3])/3);

		// Print the result, showing the names in reverse order
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + everyDinersPart + " Shekels each.");
		
		
	}
}
