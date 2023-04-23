/**
 *
 * @author Sattar, Farzana
 * @author Do, Juliean
 * @author Do, Amber
 * Submission Date: April 22, 2023
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
    
    public boolean isEmpty(){
        return (cards.isEmpty()); 
    }
}
