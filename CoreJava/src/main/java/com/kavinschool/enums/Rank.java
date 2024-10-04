package com.kavinschool.enums;

/**
 * <p>Rank class.</p>
 *
 * @author kangs
 */
public enum Rank { ACE("A"), TWO("2"), THREE ("3"), FOUR("4"),
    FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
    NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");

    private final String symbol;

    Rank(String symbol) {
        this.symbol = symbol;
    }

    /**
     * <p>Getter for the field <code>symbol</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getSymbol() {
        return symbol;
    }

}
