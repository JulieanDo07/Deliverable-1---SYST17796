
package softwareproj;

import java.util.ArrayList;

public class ComputerPlayer extends Player{
    private ArrayList<CardHand> compCard; 
    private int compScore; 
    private String name = "Computer Bot 01";
    
    public ComputerPlayer(){
        compCard = new ArrayList<>(); 
        this.compCard = compCard; 
    }
    
    public void play(){
        
    }
}
