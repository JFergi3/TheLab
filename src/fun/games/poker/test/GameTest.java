package fun.games.poker.test;

import fun.games.poker.Card;
import fun.games.poker.Deck;
import fun.games.poker.Game;
import fun.games.poker.Hand;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {
    Deck deck;
    Game game;
    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        deck = new Deck();
        game = new Game();
    }

    @org.junit.jupiter.api.Test
    void isFourOfAKind(){
        ArrayList<Card> cards = deck.getCards();
        Hand hand = new Hand(cards.get(0), cards.get(13), cards.get(26), cards.get(39), cards.get(49));
        assertTrue(game.isFourOfAKind(hand));
    }

    @org.junit.jupiter.api.Test
    void isThreeOfAKind(){
        ArrayList<Card> cards = deck.getCards();
        Hand hand = new Hand(cards.get(0), cards.get(13), cards.get(26), cards.get(1), cards.get(2));
        assertTrue(game.isThreeOfAKind(hand));
    }

    @org.junit.jupiter.api.Test
    void isPair(){
        ArrayList<Card> cards = deck.getCards();
        Hand hand = new Hand(cards.get(0), cards.get(13), cards.get(2), cards.get(16), cards.get(30));
        assertTrue(game.isPair(hand));
    }

    @org.junit.jupiter.api.Test
    void isFullHouse(){
        ArrayList<Card> cards = deck.getCards();
        Hand hand = new Hand(cards.get(0), cards.get(13), cards.get(26), cards.get(1), cards.get(14));
        assertTrue(game.isFullHouse(hand));
    }

    @org.junit.jupiter.api.Test
    void isFlush(){
        ArrayList<Card> cards = deck.getCards();
        Hand hand = new Hand(cards.get(0), cards.get(1), cards.get(2), cards.get(3), cards.get(4));
        assertTrue(game.isFlush(hand));
    }

}