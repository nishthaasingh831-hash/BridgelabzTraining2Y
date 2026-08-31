package String.Level3;

import java.util.*;

class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[suits.length * ranks.length];

        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber =
                    i + (int)(Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distributeCards(
            String[] deck, int cards, int players) {

        if (cards * players > deck.length) {
            System.out.println("Cards cannot be distributed!");
            return null;
        }

        String[][] playerCards = new String[players][cards];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                playerCards[i][j] = deck[index];
                index++;
            }
        }

        return playerCards;
    }

    public static void printPlayers(String[][] playerCards) {

        for (int i = 0; i < playerCards.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + ":");

            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck();

        deck = shuffleDeck(deck);

        String[][] playerCards =
                distributeCards(deck, cards, players);

        if (playerCards != null) {
            printPlayers(playerCards);
        }
    }
}