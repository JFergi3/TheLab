package fun.games.poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This provides a list of all cards
 * @author Jake Ferguson
 */

public class Deck {
    private ArrayList<Card> cards;

    /**
     * Creates a new deck and fills it with all suit/face combinations.
     */
    public Deck(){
        cards = new ArrayList<>();

        fillCards();
    }

    /**
     * Populates the deck with every possible card combination.
     */
    private void fillCards(){
        for(Suit s : Suit.values()) {
            for (Face f : Face.values()){
                cards.add(new Card(s, f));
            }
        }
    }

    /**
     * Returns the list of cards in this deck.
     *
     * @return mutable list containing all cards currently in the deck
     */
    public ArrayList<Card> getCards(){
        return cards;
    }

    /**
     * Randomly shuffles the current order of cards in the deck.
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }
}
