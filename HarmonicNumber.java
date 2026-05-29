//Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.

package DAY05;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<0)
		{
			System.out.println("Enter a Non negative Integer.");
			return;
		}
		double harmonicValue = 0;
		for(int i=1;i<=n;i++)
		{
			harmonicValue += 1.0/i;
		}
		System.out.println(n+"th Harmonic Value is : "+harmonicValue);
	}

}
