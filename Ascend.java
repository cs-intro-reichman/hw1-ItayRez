// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		//Retrieve range limit number
		int lim = Integer.parseInt(args[0]);
		//Random numbers between [0, lim)
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		//Math operations for finding min, mid and max numbers
		int min = Math.min (a, Math.min(b , c));
		int max = Math.max (a , Math.max(b , c));
		int mid = (a + b + c) - min - max;

		//Print the generated numbers
		//Print the generated numbers by ascending order
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);

	} 
}
