package com.kavinschool.enums;

/**
 * <p>Card class.</p>
 *
 * @author kangs
 */
public class Card {
    private Suit suit;
    private Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * <p>Getter for the field <code>suit</code>.</p>
     *
     * @return a {@link com.kavinschool.enums.Suit} object
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * <p>Setter for the field <code>suit</code>.</p>
     *
     * @param suit a {@link com.kavinschool.enums.Suit} object
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * <p>Getter for the field <code>rank</code>.</p>
     *
     * @return a {@link com.kavinschool.enums.Rank} object
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * <p>Setter for the field <code>rank</code>.</p>
     *
     * @param rank a {@link com.kavinschool.enums.Rank} object
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    /**
     * <p>toShortString.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String toShortString() {
        return rank.getSymbol()+suit.getSymbol() ;
    }
}
