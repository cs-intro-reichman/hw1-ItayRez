// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		System.out.println("Enter an hour in the 24 hour format, EX : 17:30");
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String minuteString = (minutes < 10) ? "0" + minutes : "" + minutes;

		if (hours >= 12){
			hours = (hours == 12) ? hours : hours-12;
			System.out.println(hours + ":" + minuteString + "PM");
		} else {
			System.out.println(hours + ":" + minuteString + "AM");
		}

	}
}