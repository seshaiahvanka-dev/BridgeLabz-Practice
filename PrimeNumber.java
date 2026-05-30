//Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.

package DAY06;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = scanner.nextInt();
		System.out.println(checkPrime(n)?"Prime":"Not Prime");
//		if(n<=1)
//		{
//			System.out.println("Not Prime");
//			return;
//		}
//		for(int i=2;i*i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				System.out.println("Not Prime");
//				return;
//			}
//		}
//		System.out.println("Prime");
	}
	public static boolean checkPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
