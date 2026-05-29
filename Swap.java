//Java Program to Swap Two Numbers

package DAY05;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int temp =n;
		n = m;
		m = temp;
		System.out.println(n);
		System.out.println(m);
	}

}
