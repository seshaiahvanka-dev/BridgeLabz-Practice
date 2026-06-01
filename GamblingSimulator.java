//Problem Statement
//Gambler starts each day with $100 stake.
//Bets $1 per game.
//Each bet is either win (+$1) or lose (−$1).
//Exit condition for the day:
//If stake reaches $150 (won 50%), OR
//If stake drops to $50 (lost 50%).
//Play for 20 days.
//Track:
//Total amount won/lost after 20 days.
//Days won vs. days lost.
//Luckiest day (max profit).
//Unluckiest day (max loss).
//Decision: If overall profit > 0, continue next month; else stop gambling.

package DAY07;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String[] args) {
        final int STAKE = 100;
        final int BET = 1;
        final int DAYS = 20;

        Random rand = new Random();

        int totalProfit = 0;
        int winDays = 0, lossDays = 0;
        int luckiestDay = Integer.MIN_VALUE;
        int unluckiestDay = Integer.MAX_VALUE;
        int luckiestDayNum = 0, unluckiestDayNum = 0;

        for (int day = 1; day <= DAYS; day++) {
            int stake = STAKE;

            while (stake > STAKE/2 && stake < STAKE + STAKE/2) {
                int betResult = rand.nextInt(2); // 0 = lose, 1 = win
                if (betResult == 1) stake += BET;
                else stake -= BET;
            }

            int dailyProfit = stake - STAKE;
            totalProfit += dailyProfit;

            if (dailyProfit > 0) winDays++;
            else lossDays++;

            if (dailyProfit > luckiestDay) {
                luckiestDay = dailyProfit;
                luckiestDayNum = day;
            }
            if (dailyProfit < unluckiestDay) {
                unluckiestDay = dailyProfit;
                unluckiestDayNum = day;
            }

            System.out.println("Day " + day + " result: " + dailyProfit);
        }

        System.out.println("\nTotal Profit/Loss after " + DAYS + " days: " + totalProfit);
        System.out.println("Winning Days: " + winDays + ", Losing Days: " + lossDays);
        System.out.println("Luckiest Day: Day " + luckiestDayNum + " with profit " + luckiestDay);
        System.out.println("Unluckiest Day: Day " + unluckiestDayNum + " with loss " + unluckiestDay);

        if (totalProfit > 0)
            System.out.println("Continue gambling next month!");
        else
            System.out.println("Stop gambling next month!");
    }
}
