/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproj;

import java.util.ArrayList;

/**
 *
 * @author julieando
 * @author Amber Do
 * 
 */
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