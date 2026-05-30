//Write Binary.java to read an integer as an Input, convert to Binary using toBinary
//function and perform the following functions.
//i. Swap nibbles and find the new number.
//ii. Find the resultant number is the number is a power of 2.
//A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
//Given a byte, swap the two nibbles in it. For example 100 is to be represented as
//01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
//two nibbles, we get 01000110 which is 70 in decimal.

package DAY06;

import java.util.Scanner;

public class Binary {

    // Convert decimal to binary (8-bit padded for nibble operations)
    public static String toBinary(int n) {
        String t = "";
        while (n > 0) {
            int digit = n % 2;
            n = n / 2;
            t = digit + t;
        }
        // Pad to 8 bits
        while (t.length() < 8) {
            t = "0" + t;
        }
        return t;
    }

    // Swap nibbles in an 8-bit number
    public static int swapNibbles(int n) {
        // (n & 0x0F) << 4 moves lower nibble to upper
        // (n & 0xF0) >> 4 moves upper nibble to lower
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    // Check if number is power of 2
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Step 1: Binary representation
        String binary = toBinary(n);
        System.out.println("Binary (8-bit): " + binary);

        // Step 2: Swap nibbles
        int swapped = swapNibbles(n);
        System.out.println("After swapping nibbles: " + swapped);
        System.out.println("Binary (8-bit swapped): " + toBinary(swapped));

        // Step 3: Check power of 2
        if (isPowerOfTwo(swapped)) {
            System.out.println(swapped + " is a power of 2");
        } else {
            System.out.println(swapped + " is NOT a power of 2");
        }

        scanner.close();
    }
}
