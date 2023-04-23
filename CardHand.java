/**
 *
 * @author Sattar, Farzana
 * @author Do, Juliean
 * @author Do, Amber
 * Submission Date: April 22, 2023
 */
package softwareproj;
import java.util.ArrayList;

public class CardHand {
    private ArrayList<Card> handCards; 
    
    public CardHand(){
        handCards = new ArrayList<>(); 
    }
    
    public void removeCard(Card card){
        int count = 0; 
        for(Card cardHands : handCards){
            if(cardHands.getValue().equals(card.getValue())){
                handCards.remove(count); 
                break; 
            }
            count++; 
        }
    }
    
    public ArrayList<Card> searchHand(Card asked){
        ArrayList<Card> playerHas = getHand(); 
        ArrayList<Card> matched = new ArrayList<Card>(); 
        for(Card cards : playerHas){
            if(cards.getValue().equals(asked.getValue())){
                matched.add(cards); 
            }    
        }
        return matched; 
    }
    
    public String showCards(){
        String hands = ""; 
        for(Card card :handCards){
            hands += card.toString(); 
            
        }
        return hands; 
    }
    
    public void addCard(Card card) {
        handCards.add(card);
    }
    
    public ArrayList<Card> getHand() {
        return handCards;
    }
    
    public boolean checkHand(Card card){
    for (int i = 0; i < handCards.size(); i++){
        if (handCards.get(i).equals(card)){
            return true;
        }
    } 
    return false;
    }
    
    public boolean isEmpty(){
        return (handCards.isEmpty()); 
    }  
}
