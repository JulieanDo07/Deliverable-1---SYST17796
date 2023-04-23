/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package softwareproj;

import softwareproj.Card.Suit;
import softwareproj.Card.Value;
import java.util.ArrayList;
import java.util.Collections;


public class CardDeck {
    private ArrayList<Card> cards;

    public CardDeck() {
        cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(suit, value));
            }
        }
        shuffle(); 
    }
    
    

    public Card getCards() {
        return cards.get(0); 
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCards() {
        return cards.remove(0);
    }
    
    // check if the deck is empty; 
    public boolean isEmpty(){
        return (cards.isEmpty()); 
    }
}