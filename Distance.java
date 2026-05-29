//Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

package DAY05;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int distance = (int)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println(distance);
	}

}
