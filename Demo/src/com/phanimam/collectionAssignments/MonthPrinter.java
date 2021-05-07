package com.phanimam.collectionAssignments;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class MonthPrinter {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year and month");
		int year = sc.nextInt();
		int month = sc.nextInt();
			if(year != 0 && month != 0)	{
				getMonthCalendar(year, month);
			}
			else {
				Calendar cal = Calendar.getInstance();
				month = cal.get(Calendar.MONTH);
				System.out.println(month);
				year = cal.get(Calendar.YEAR);
				System.out.println(year);
				getMonthCalendar(year, month);
				
			}
		
}
	private static char[] getMonthCalendar(int year, int month) {
		YearMonth ym = YearMonth.of(year, month);
		String firstDay = ym.atDay(1).getDayOfWeek().name();
		String lastDay  =  ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println(firstDay);
		System.out.println(lastDay);	
		return null;
	}

}
