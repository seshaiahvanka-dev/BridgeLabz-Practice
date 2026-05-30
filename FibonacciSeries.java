//Fibonacci Series
//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//the next term will be 1(0+1).

package DAY06;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int first =0,second =1;
		for(int i=0;i<n;i++)
		{
			System.out.print(first+" ");
			int res = first+second;
			first = second;
			second = res;
		}
	}

}
