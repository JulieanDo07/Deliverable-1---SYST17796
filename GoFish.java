package softwareproj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author julieando
 * @author Amber Do
 */


//A class to represent a game of Go Fish

    public  class GoFish extends Game {
    private CardDeck deck;
    private ArrayList<Player> players;
    private Player currentPlayer;
    Scanner input; 
    
    private int turn =0; 

    public GoFish() {
        super("Go Fish");
        players = new ArrayList<Player>();
        deck = new CardDeck();
        deck.shuffle();
        //currentPlayer = switchTurn(); 
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        // first shuffle then deal the card
        deck.shuffle();
        
        // if deck is not empty, get the Player's name and their hand of cards
        while(!deck.isEmpty()){
            
            System.out.println(currentPlayer.getName() + " turn"); 
            String playerHands = currentPlayer.display(); 
            System.out.println("This player has: " + playerHands); 
            
            System.out.println("You ask for: "); 
            String asked = input.next(); 
            //suppose to ask for cards that they want? then switch Turn if no match?
            switchTurn(); 
        }
        // display winner + scores; 
        //declareWinner();
    }

    
    
    // compare the cards between player and card. If yes, then remove from player's hand
    public boolean exactCards(ArrayList<Card> hands){
        for(int i= 0; i<hands.size() -1; i++){
            Card first = hands.get(i); 
            for(int j = i+ 1; j < hands.size(); j++){
                Card second = hands.get(j); 
                if(first.getValue().equals(second.getValue())){
                    hands.remove(first); 
                    hands.remove(second); 
                    // needs to increase score for player if matched?
                    int score = currentPlayer.getScore(); 
                    currentPlayer.increaseScore();
                    return true; 
                }
            }
        }
        return false; 
    
    }
    
    // switch the current player to the next player 
    public Player switchTurn(){
        currentPlayer = players.get(turn);     
        return currentPlayer; 
    }
    
    
    
    // declare winner in each situation

    public void declareWinner(Player player, Player comp){

            if(player.getScore() > comp.getScore()){
                System.out.println("You have won with a total of:  "+  player.getScore()+ ""
                        + "\nOpponent has lost with a total of: " + comp.getScore()); 
            }else if(player.getScore() < comp.getScore()){
                System.out.println("You have lost with a total of:  "+  player.getScore()+ ""
                        + "\nOpponent has won with a total of: " + comp.getScore()); 
            }else{
                System.out.println("You have a tie with a value of:" + player.getScore()); 
            }
        }
    }
        
