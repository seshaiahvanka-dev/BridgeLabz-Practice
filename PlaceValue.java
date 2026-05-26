// Read a Number 1,10,100,1000 and display unit, ten hundred



package DAY02;

import java.util.Scanner;

public class PlaceValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number (1, 10, 100, 1000): ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("Unit");
		} else if (num == 10) {
			System.out.println("Ten");
		} else if (num == 100) {
			System.out.println("Hundred");
		} else if (num == 1000) {
			System.out.println("Thousand");
		} else {
			System.out.println("Invalid input! Please enter 1, 10, 100, or 1000.");
		}
	}
}
