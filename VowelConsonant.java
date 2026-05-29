//Java Program to Check Whether an Alphabet is Vowel or Consonant

package DAY05;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			if(ch=='a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("Enter an Alphabet");
		}
	}

}
