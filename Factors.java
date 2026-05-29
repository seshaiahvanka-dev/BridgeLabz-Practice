//Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.

package DAY05;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n = n/i;
			}
		}
		if(n>1)
		{
			System.out.println(n);
		}
	}

}
