/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package softwareproj;

import java.util.ArrayList;

/**
 * This class ++ Insert description
 *
 * @author Amber Do
 */
public class CardHand {
    private ArrayList<Card> handCards; 
    
    public CardHand(){
        
        handCards = new ArrayList<>(); 
        
    }
    // remove a card from player's hand 
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
    
    // search for specific cards from user's input. If matched, add to card and return 
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
    

    // display all cards in the player's hand
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
    
   // public void dealCards(int num, Card deck) {
     //   for (int i = 0; i < num; i++) {
       //         handCards.addCard(deck);
         //   }
        //}
    //}
   
}