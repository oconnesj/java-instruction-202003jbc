package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Create some dates/times...");
		LocalDate now1 = LocalDate.now();
		LocalTime now2 = LocalTime.now();
		LocalDateTime now3 = LocalDateTime.now();
		
		
		System.out.println(now1);
		System.out.println(now2);
		System.out.println(now3);
		
		System.out.println("Generate some holiday dates....");
		LocalDate julyFourth = LocalDate.of(2020, 7, 4);
		LocalDate christmas = LocalDate.of(2020, 12, 25);
		System.out.println(julyFourth);
		System.out.println(christmas);
		
		
		
	}

}
