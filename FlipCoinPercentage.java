//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails


package DAY05;

import java.util.Scanner;

public class FlipCoinPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int flips = sc.nextInt();

        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < flips; i++) {
            double randomValue = Math.random();
            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage = (headsCount * 100.0) / flips;
        double tailsPercentage = (tailsCount * 100.0) / flips;

        System.out.println("Heads: " + headsPercentage + "%");
        System.out.println("Tails: " + tailsPercentage + "%");

    }
}
