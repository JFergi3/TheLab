package fun.games.poker;

public class Card {
    private Suit suit;
    private Face face;

    /**
     * Creates a card with a given suit and face value.
     *
     * @param suit card suit
     * @param face card face/rank
     */
    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    /**
     * Returns this card's suit.
     *
     * @return suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns this card's face/rank.
     *
     * @return face value of the card
     */
    public Face getFace() {
        return face;
    }

    /**
     * Returns a readable representation of the card.
     *
     * @return string in the format "SUIT FACE"
     */
    @Override
    public String toString(){
        return getSuit() + " " + getFace();
    }
}
