package ExampUsingStram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeApi {
	public static void main(String[]rags) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Today's date is = " + date);
		
		LocalTime t = LocalTime.now();
		System.out.println("Today's Time is = " + t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Today's Date and Time is = " + dt);
		
		DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatTeat =dt.format(forma);
		System.out.println("Today's Date and Time is = " + formatTeat);
		
	}

}
