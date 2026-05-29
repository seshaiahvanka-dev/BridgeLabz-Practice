//Java Program to Compute Quotient and Remainder

package DAY05;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend = scanner.nextInt();
		int divisor = scanner.nextInt();
		System.out.println("Quotient : "+dividend/divisor);
		System.out.println("Reminder : "+dividend%divisor);
	}

}
