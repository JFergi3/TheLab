package fun.games.poker;

public class Main {
    /**
     * Entry point for running a quick deck creation demo.
     *
     * @param args optional first argument is how many cards to print
     */
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();

        int cardsToPrint = 5;
        if (args.length > 0) {
            try {
                cardsToPrint = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {
                // Keep default when a non-numeric argument is passed.
            }
        }

        cardsToPrint = Math.max(0, Math.min(cardsToPrint, deck.getCards().size()));
        for (int i = 0; i < cardsToPrint; i++) {
            Card card = deck.getCards().get(i);
            System.out.println("Card " + (i + 1) + ": " + card.getSuit() + " " + card.getFace());
        }
    }
}
