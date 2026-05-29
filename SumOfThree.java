//Sum of three Integer adds to ZERO
//a. Desc -> A program with cubic running time. Read in N integers and counts the
//number of triples that sum to exactly 0.
//b. I/P -> N number of integer, and N integer input array
//c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//d. O/P -> One Output is number of distinct triplets as well as the second output is to
//print the distinct triplets.

package DAY05;

import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = scanner.nextInt();
		}
		int count =0;
		System.out.println("Distinct Triplets that sum 0: ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k = j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println("No of Distinct Triplets: "+count);
	}

}
