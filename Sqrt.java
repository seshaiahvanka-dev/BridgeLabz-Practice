//Write a static function sqrt to compute the square root of a nonnegative number c
//given in the input using Newton's method:
//- initialize t = c
//- replace t with the average of c/t and t
//- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
//where epsilon = 1e-15;

package DAY06;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextInt();
		double epsilon = 1e-15;
		double t =c;
		while(Math.abs(t-c/t) > epsilon*t)
		{
			t = (t+c/t)/2.0;
		}
		System.out.println(t);
	}

}
