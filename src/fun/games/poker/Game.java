package fun.games.poker;

import java.util.HashMap;
import java.util.Map;

public class Game {
    /**
     * Checks whether the hand contains four cards of the same face value.
     *
     * @param hand hand to evaluate
     * @return true if the hand has four of a kind; otherwise false
     */
    public boolean isFourOfAKind(Hand hand) {
        Map<Face, Integer> faceCounts = new HashMap<>();
        for (Card card : hand.getCards()) {
            Face face = card.getFace();
            faceCounts.put(face, faceCounts.getOrDefault(face, 0) + 1);
        }

        for (int count : faceCounts.values()) {
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the hand contains three cards of the same face value.
     *
     * @param hand hand to evaluate
     * @return true if the hand has three of a kind; otherwise false
     */
    public boolean isThreeOfAKind(Hand hand) {
        Map<Face, Integer> faceCounts = new HashMap<>();
        for (Card card : hand.getCards()) {
            Face face = card.getFace();
            faceCounts.put(face, faceCounts.getOrDefault(face, 0) + 1);
        }

        for (int count : faceCounts.values()) {
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the hand contains exactly one pair.
     *
     * @param hand hand to evaluate
     * @return true if the hand has exactly one pair; otherwise false
     */
    public boolean isPair(Hand hand){
        Map<Face, Integer> faceCounts = new HashMap<>();
        for (Card card : hand.getCards()) {
            Face face = card.getFace();
            faceCounts.put(face, faceCounts.getOrDefault(face, 0) + 1);
        }

        int pairCount = 0;
        for (int count : faceCounts.values()) {
            if (count == 2){
                pairCount++;
            }
        }
        return pairCount == 1;
    }

    /**
     * Checks whether the hand contains one three-of-a-kind and one pair.
     *
     * @param hand hand to evaluate
     * @return true if the hand is a full house; otherwise false
     */
    public boolean isFullHouse(Hand hand){
        Map<Face, Integer> faceCounts = new HashMap<>();
        for (Card card : hand.getCards()) {
            Face face = card.getFace();
            faceCounts.put(face, faceCounts.getOrDefault(face, 0) + 1);
        }

        boolean hasThree = false;
        boolean hasPair = false;

        for (int count : faceCounts.values()){
            if (count == 3) {
                hasThree = true;
            } else if (count == 2){
                hasPair = true;
            }
        }
        return hasThree && hasPair;
    }

    /**
     * Checks whether all cards in the hand share the same suit.
     *
     * @param hand hand to evaluate
     * @return true if all five cards are the same suit; otherwise false
     */
    public boolean isFlush(Hand hand) {
        Map<Suit, Integer> suitCounts = new HashMap<>();
        for (Card card : hand.getCards()) {
            Suit suit = card.getSuit();
            suitCounts.put(suit, suitCounts.getOrDefault(suit, 0) + 1);
        }

        for (int count : suitCounts.values()) {
            if (count == 5) {
                return true;
            }
        }
        return false;
    }
}
