// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

	//Option 1 :
		//Retrieve number from the user(command line)
		int number = Integer.parseInt(args[0]);

		//Print the number's value in terms of hundreds, tens, ones.
		System.out.println((number / 100) + " hundreds, " + ((number % 100) / 10) + " tens, " + (number % 10) + " ones.");

		 
	/*Option 2 :
		//Retrieve number
		int number = Integer.parseInt(args[0]);

		//Declairing into variables the results
		int hundreds = number / 100;
		int tens = (number % 100) / 10;
		int ones = number % 10;

		//Print the number's value in terms of hundreds, tens, ones.
		System.out.println((number / 100) + " hundreds, " + ((number % 100) / 10) + " tens, " + (number % 10) + " ones.");

	*/

	}
}
