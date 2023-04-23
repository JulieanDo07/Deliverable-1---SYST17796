/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package softwareproj;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * 
*/
 //A class to represent a player in a card game
 
public abstract class Player {
    private String name;
    private ArrayList<CardHand> hand;
    private int score = 0;
    
    public Player(){
        hand = new ArrayList<CardHand>();
        score =0; 
    }

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<CardHand>();
        score =0; 
    }

    public String getName() {
        return name;
    }

    public int getScore(){
        return score; 
    }
    
    // increase score
    public void increaseScore(){
        score++; 
    }
   
    
    public void discard(Card card) {
        hand.remove(card);
    }
    
    public String display(){
        if(!hand.isEmpty()){
            String result = " User has: "; 
            for(int i=0; i<hand.size(); i++){
                result = result + hand.get(i); 
            }
            return result; 
        }  
        return "Empty Hand"; 
    
    }
    

    
}