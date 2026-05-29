//Java Program to Check Whether a Number is Even or Odd

package DAY05;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
			System.out.println(n%2==0?"Even Number":"Odd Number");
	}

}
