//2D Array
//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

package DAY05;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out),true);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
