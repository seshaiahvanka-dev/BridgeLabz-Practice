//Leap Year
//a. I/P -> Year, ensure it is a 4 digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.

package DAY05;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 4 digit year.");
		int n = scanner.nextInt();
		if(n<1000||n>9999){
			System.out.println("Please Enter a valid Year!");
		}
		else
		{
			if(n%400 ==0 ||(n%4 == 0 && n%100 !=0 ))
			{
				System.out.println(n+" is a Leap Year.");
			}
			else
			{
				System.out.println(n+" is not a Leap Year.");
			}
		}
	}

}
