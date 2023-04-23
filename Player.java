/**
 *
 * @author Sattar, Farzana
 * @author Do, Juliean
 * @author Do, Amber
 * Submission Date: April 22, 2023
 */
package softwareproj;
import java.util.ArrayList;
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
