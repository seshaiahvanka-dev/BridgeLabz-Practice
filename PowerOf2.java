//Power of 2
//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//d. O/P -> Print the year is a Leap Year or not.

package DAY05;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<0 || n>=31)
		{
			System.out.println("Enter a value in between 0 and 30");
			return;
		}
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
		}
	}

}
