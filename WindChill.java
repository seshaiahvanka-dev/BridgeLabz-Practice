//Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:
//
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
//than 120 or less than 3 (you may assume that the values you get are in that range).

package DAY05;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter temperature t (Fahrenheit): ");
		double t = scanner.nextDouble();
		System.out.print("Enter wind speed v (mph): ");
		double v = scanner.nextDouble();

		if (Math.abs(t) > 50 || v > 120 || v < 3) {
			System.out.println("Values out of valid range for wind chill calculation.");
		} else {
			double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Effective temperature (Wind Chill) = " + windChill);
		}

	}

}
