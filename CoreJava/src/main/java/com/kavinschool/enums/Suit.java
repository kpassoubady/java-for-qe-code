package com.kavinschool.enums;

/**
 * <p>Suit class.</p>
 *
 * @author kangs
 */
public enum Suit { SPADE('\u2663'), DIAMOND('\u2666'), CLUB('\u2665'), HEART('\u2660');

    /**
     * <p>Constructor for Suit.</p>
     *
     * @param symbol a char
     */
    Suit(char symbol) {
        this.symbol = symbol;
    }

    /**
     * <p>Getter for the field <code>symbol</code>.</p>
     *
     * @return a char
     */
    private final char symbol;

    public char getSymbol() {
        return symbol;
    }
}
