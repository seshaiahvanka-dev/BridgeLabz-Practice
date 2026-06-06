package DAY11_12;
import java.util.Random;

public class DeckOfCards2 {
    // Custom Node for Linked List
    static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Custom Queue using Linked List
    static class Queue {
        private Node front, rear;

        public Queue() {
            front = rear = null;
        }

        public void enqueue(String data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public String dequeue() {
            if (front == null) return null;
            String val = front.data;
            front = front.next;
            if (front == null) rear = null;
            return val;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void printQueue() {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    // Player class
    static class Player {
        String name;
        Queue cards;

        public Player(String name) {
            this.name = name;
            this.cards = new Queue();
        }

        // Sort cards by rank before enqueuing (simple bubble sort on array first)
        public void setCards(String[] hand) {
            String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
            // Bubble sort by rank order
            for (int i = 0; i < hand.length-1; i++) {
                for (int j = 0; j < hand.length-i-1; j++) {
                    if (rankValue(hand[j], ranks) > rankValue(hand[j+1], ranks)) {
                        String temp = hand[j];
                        hand[j] = hand[j+1];
                        hand[j+1] = temp;
                    }
                }
            }
            // Enqueue sorted cards
            for (String card : hand) {
                cards.enqueue(card);
            }
        }

        private int rankValue(String card, String[] ranks) {
            for (int i = 0; i < ranks.length; i++) {
                if (card.startsWith(ranks[i])) return i;
            }
            return -1;
        }

        public void printPlayerCards() {
            System.out.println(name + " cards:");
            cards.printQueue();
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        // Suits and Ranks
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Create deck
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle deck
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Create players queue
        Queue playersQueue = new Queue();
        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new Player("Player " + (i+1));
            playersQueue.enqueue(players[i].name); // enqueue player names
        }

        // Distribute 9 cards each
        int cardIndex = 0;
        for (int i = 0; i < 4; i++) {
            String[] hand = new String[9];
            for (int j = 0; j < 9; j++) {
                hand[j] = deck[cardIndex++];
            }
            players[i].setCards(hand);
        }

        // Print players and their cards
        for (Player p : players) {
            p.printPlayerCards();
        }
    }
}
