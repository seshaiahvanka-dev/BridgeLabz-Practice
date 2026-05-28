package DAY04;

import java.util.Random;

public class SnakeLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder Simulator!");

        int pos1 = 0, pos2 = 0;
        int diceCount1 = 0, diceCount2 = 0;

        Random rand = new Random();
        boolean turnPlayer1 = true;

        while (pos1 < 100 && pos2 < 100) {
            int dice = rand.nextInt(6) + 1; // 1 to 6

            if (turnPlayer1) {
                diceCount1++;
                int[] result = movePlayer(pos1, dice, rand);
                pos1 = result[0];
                int option = result[1];
                System.out.println("Player 1 rolled " + dice + " → Position = " + pos1);

                if (option != 1) turnPlayer1 = false; // switch turn unless Ladder
            } else {
                diceCount2++;
                int[] result = movePlayer(pos2, dice, rand);
                pos2 = result[0];
                int option = result[1];
                System.out.println("Player 2 rolled " + dice + " → Position = " + pos2);

                if (option != 1) turnPlayer1 = true; // switch turn unless Ladder
            }
        }

        if (pos1 == 100) {
            System.out.println("🎉 Player 1 wins in " + diceCount1 + " rolls!");
        } else {
            System.out.println("🎉 Player 2 wins in " + diceCount2 + " rolls!");
        }
    }

    // Return both new position and option used
    private static int[] movePlayer(int position, int dice, Random rand) {
        int option = rand.nextInt(3); // 0 = No Play, 1 = Ladder, 2 = Snake

        switch(option) {
            case 0: // No Play
                break;
            case 1: // Ladder
                position += dice;
                if (position > 100) position -= dice;
                break;
            case 2: // Snake
                position -= dice;
                if (position < 0) position = 0;
                break;
        }
        return new int[]{position, option};
    }
}
