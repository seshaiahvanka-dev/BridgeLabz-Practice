//Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
//So ensure to check for the same.Further, the Leap Year is a Year divisible by 4 and not 100
//unless it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.


package DAY01;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year < 1582)
		{
			System.out.println("Year must be >= 1582 (Gregorian calendar).");
		}
		else
		{
			if(year%400 == 0 || (year%4==0 && year%100 != 0))
			{
				System.out.println(year + " is a Leap Year.");
			}
			else
			{
				System.out.println(year + " is NOT a Leap Year.");
			}
		}
	}

}
