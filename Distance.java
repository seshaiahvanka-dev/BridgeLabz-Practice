//Write a program Distance.java that takes two integer command-line arguments x and y and
//prints the Euclidean distance from the point (x, y) to the origin (0, 0).
//The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

package DAY02;

public class Distance {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println((int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
		
	}

}
