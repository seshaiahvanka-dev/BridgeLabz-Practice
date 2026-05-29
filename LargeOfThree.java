//Java Program to Find the Largest Among Three Numbers

package DAY05;

import java.util.Scanner;

public class LargeOfThree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = a>b?a:b;
		System.out.println(x>c?x:c);
	}

}
