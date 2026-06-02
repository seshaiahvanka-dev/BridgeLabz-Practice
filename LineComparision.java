package DAY08;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();
		int x4 = scanner.nextInt();
		int y4 = scanner.nextInt();
		Integer length1 = (int)Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		Integer length2 = (int)Math.sqrt(Math.pow(x3-x4, 2)+Math.pow(y3-y4, 2));
		int res = length1.compareTo(length2);
		if(res>0)
		{
			System.out.println("Line1 is Greater than Line2");
		}
		else if(res<0)
		{
			System.out.println("Line2 is Greater than Line1");	
		}
		else
		{
			System.out.println("Both the lines are equal");			
		}
		
	}

}
