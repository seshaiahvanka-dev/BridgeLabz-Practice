//Coupon Numbers
//a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
//need to generate a distinct coupon number? This program simulates this random
//process.
//b. I/P -> N Distinct Coupon Number
//c. Logic -> repeatedly choose a random number and check whether it's a new one.
//d. O/P -> total random number needed to have all distinct numbers.
//e. Functions => Write Class Static Functions to generate random numbers and to
//process distinct coupons.

package DAY06;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Distinct coupons: ");
		int n = scanner.nextInt();
		boolean[] a = new boolean[n+1];
		int distinctCount =0;
		int totalRandoms = 0;
		while(distinctCount < n)
		{
			int coupon = getRandom(n);
			totalRandoms++;
			if(!a[coupon])
			{
				a[coupon] = true;
				distinctCount++;
			}
		}
		System.out.println(totalRandoms);
	}
	public static int getRandom(int n)
	{
		Random rand = new Random();
		
		return rand.nextInt(n)+1;
	}

}


