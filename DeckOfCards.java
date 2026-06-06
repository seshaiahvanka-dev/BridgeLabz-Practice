package DAY11_12;

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        // Suits and Ranks
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        // Create deck of 52 cards
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle deck using Random
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Distribute 9 cards to 4 players using 2D array
        String[][] players = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        // Print cards received by each player
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println("-----------------------------------");
        }
    }
}
