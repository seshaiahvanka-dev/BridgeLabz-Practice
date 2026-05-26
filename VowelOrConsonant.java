package DAY02;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		ch = Character.toLowerCase(ch);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch +" is a Vowel");
			break;
			default:
				if(Character.isLetter(ch))
				{
					System.out.println(ch+" is a Consonant");
				}
				else
				{
					System.out.println("Invalid input");
				}
		}
		
	}

}
