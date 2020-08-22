package day6;

import java.time.LocalDate;

public class LocalDateExample {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	LocalDate yesterday = date.minusDays(2);
	LocalDate tommorow = date.plusDays(1);
	System.out.println("Today date: "+date);
	System.out.println("Yesterday: "+date);
	System.out.println("Tomorrow: "+tommorow);
	
	
	
}
}
