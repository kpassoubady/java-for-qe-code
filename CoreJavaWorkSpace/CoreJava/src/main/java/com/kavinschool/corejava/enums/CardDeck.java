package com.kavinschool.corejava.enums;

import java.util.Collections;
import java.util.LinkedList;

public class CardDeck {

    private static final String LINE_SEP = "=".repeat(50);
    private final LinkedList<Card> deck= new LinkedList<Card>();


    CardDeck() {
         for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void newDeckPrint() {
        char oldSymbol = deck.getFirst().getSuit().getSymbol();
        for (Card card : deck) {

            if (card.getSuit().getSymbol() != oldSymbol) {
                System.out.println();
            }
            System.out.printf("%3s ", card.toShortString());
            oldSymbol = card.getSuit().getSymbol();
        }
        System.out.println();
    }

    public void shuffledDeckPrint() {
        int i =0;
        for (Card card : deck) {

            if (++i %13 == 0) {
                System.out.println();
            }else {
                System.out.printf("%3s ", card.toShortString());
            }
        }
        System.out.println();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card deal() {
        return deck.poll();
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println(LINE_SEP);
        System.out.println("Before Shuffling Cards");
        System.out.println(LINE_SEP);
        deck.newDeckPrint();
        System.out.println(LINE_SEP);
        deck.shuffle();
        System.out.println("After Shuffling Cards");
        System.out.println(LINE_SEP);
        deck.shuffledDeckPrint();
        System.out.println(LINE_SEP);
        Card card = deck.deal();
        System.out.println("Deal Card:" + card.toShortString());
        card = deck.deal();
        System.out.println("Deal Card:" + card.toShortString());
        System.out.println(LINE_SEP);
        System.out.println("After dealing 2 Cards, the deck contains:");
        deck.shuffledDeckPrint();
        System.out.println(LINE_SEP);
    }

}
