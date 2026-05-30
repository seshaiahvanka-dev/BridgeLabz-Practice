//Write a static function toBinary that outputs the binary (base 2) representation of
//the decimal number typed as the input. It is based on decomposing the number into
//a sum of powers of 2. For example, the binary representation of 106 is 11010102,
//which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
//to represent 4 Byte String.
//To compute the binary representation of n, we consider the powers of 2 less than or
//equal to n in decreasing order to determine which belong in the binary
//decomposition (and therefore correspond to a 1 bit in the binary representation).

package DAY06;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String t ="";
		while(n>0)
		{
			int digit = n%2;
			n = n/2;
			t = digit+t;
		}
		while(t.length()<32)
		{
			t = "0"+t;
		}
		System.out.println(t);
	}

}
