package com.kavinschool.enums;

public enum Suit { SPADE('\u2663'), DIAMOND('\u2666'), CLUB('\u2665'), HEART('\u2660');

    Suit(char symbol) {
        this.symbol = symbol;
    }

    private final char symbol;

    public char getSymbol() {
        return symbol;
    }
}