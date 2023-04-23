/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package softwareproj;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * 
 */


public class Card {
    private Suit suit;
    private Value value;
    
        /**
     * An enumeration of the four suits in a deck of cards
     */
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    /**
     * An enumeration of the values of cards in a deck
     */
    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String toString() {
        return value + " of " + suit;
    }
    
    public boolean equals(Object o){
        if (((Card)o).getValue() == getValue() && ((Card)o).getSuit() ==  getSuit()){
            System.out.println();
            return true;
        }
        return false;
    }
}