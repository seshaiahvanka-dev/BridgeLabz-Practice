//Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c


package DAY02;

import java.util.Scanner;

public class ArithmaticMaxMin {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int o1 = a+b*c;
		int o2 = c+a/b;
		int o3 = a%b+c;
		int o4 = a*b+c;
		System.out.println("Results of operations:");
        System.out.println("a + b * c = " + o1);
        System.out.println("c + a / b = " + o2);
        System.out.println("a % b + c = " + o3);
        System.out.println("a * b + c = " + o4);
		int min = Math.min(Math.min(o1, o2), Math.min(o3, o4));
		int max = Math.max(Math.max(o1, o2), Math.max(o3, o4));
		System.out.println("Minimum Value : "+min);
		System.out.println("Maximum Value : "+max);
	}

}
