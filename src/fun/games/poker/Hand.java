package fun.games.poker;

import java.util.ArrayList;
import java.util.Comparator;

public class Hand {
        private ArrayList<Card> cards;

        public Hand(Card c1, Card c2, Card c3, Card c4, Card c5){
            cards = new ArrayList<>();
            cards.add(c1);
            cards.add(c2);
            cards.add(c3);
            cards.add(c4);
            cards.add(c5);
        }

        public ArrayList<Card> getCards(){
            return cards;
        }

        public void sortCardsBySuit(){
            cards.sort(Comparator.comparing(Card::getSuit));
        }

        public void sortCardsByFace(){
            cards.sort(Comparator.comparing(Card::getFace));
         }
    }

