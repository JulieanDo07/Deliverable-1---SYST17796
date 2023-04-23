/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwareproj;
import softwareproj.Card.Value;
import java.util.*;
import softwareproj.Card.Suit;

/**
 *
 * @author Farzana
 */
public class GoFishGame {
    
    public static void main(String[] args){
        
        
      ///  try {
        Game gofish = new GoFish();
        
        CardDeck cd = new CardDeck(); 
        
        
        System.out.println("Enter your player's name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        Player human = new HumanPlayer(name);
        Player comp = new ComputerPlayer();
        
        System.out.println("How many cards on each hand?");
        int handNum = input.nextInt();
        
        CardHand humanHand = new CardHand();
        
        for(int i = 0; i < handNum; i++){
            humanHand.addCard(cd.drawCards());
        }
        
        CardHand compHand = new CardHand();
     
        
        for(int i = 0; i < handNum; i++){
            compHand.addCard(cd.drawCards());
        }System.out.println(compHand.getHand());

        System.out.println(human.getName() + " Cards: "+ humanHand.getHand().toString() + " ");
        boolean isHumanturn = true;
        
        
        try{
        while(isHumanturn == true){
            if(humanHand.isEmpty() || compHand.isEmpty()){
                
                gofish.declareWinner(human, comp);
                System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                
                System.out.println("-------------------------------------------");
                System.out.println("Computer's Cards: " + compHand.getHand());
                break;
                        
            } else {
                System.out.println(human.getName()+ "'s Turn-------------------------------------");
     
  
        System.out.println("Choose a Value to Ask [ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,"
                    + " JACK, QUEEN, KING]:");
            int value = input.nextInt();
            
            if (checkValue(value) == false){
                throw new Exception ("Error: Incorrect Value Type!");
            } 
           
            System.out.println("Choose a Suit to Ask [CLUBS, DIAMONDS, HEARTS, SPADES]:");
           
            int suit = input.nextInt();
            
            if (checkSuit(suit) == false){
                throw new Exception ("Error: Incorrect Suit Type!");
            } 
           
            Card guessCard = new Card( Card.Suit.values()[suit-1], Card.Value.values()[value-1]);
            
            System.out.println(human.getName() + " Guesses the Card: " + guessCard.toString());
            if(compHand.checkHand(guessCard) == true){
                human.increaseScore();
                ArrayList<Card> removedCards =  compHand.searchHand(guessCard);
                for(int i = 0; i<removedCards.size(); i++){
                    humanHand.getHand().add(removedCards.get(i));
                }
                compHand.removeCard(guessCard);
                isHumanturn = true;
                System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                System.out.println(human.getName() + "'s Score: " + human.getScore());
                
                System.out.println("-------------------------------------------");
                System.out.println("Computer's Score: " + comp.getScore());
                       
            } else {
                
                System.out.println("GoFish");
                if(cd.isEmpty()){
                    gofish.declareWinner(human, comp);
                    System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Computer's Cards: " + compHand.getHand());
                    break;
                } else{
                    humanHand.addCard(cd.drawCards());
                    System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                    System.out.println(human.getName() + "'s Score: " + human.getScore());
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Computer's Score: " + comp.getScore());
                }
                isHumanturn = false;
                
            }
            }     
            while (isHumanturn == false){
                if(compHand.isEmpty()|| humanHand.isEmpty()){
                    gofish.declareWinner(human, comp);
                    System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Computer's Cards: " + compHand.getHand());
                    break;
                } else{
                    System.out.println("Computer's Turn----------------------------------------------------------");
            int valueRandom = (int)(Math.random() * 13 + 1);
            int suitRandom = (int)(Math.random() * 4 + 1);

            Card guessCards = new Card( Card.Suit.values()[suitRandom-1], Card.Value.values()[valueRandom-1]);
            
            System.out.println("Computer Guesses the Card: " + guessCards.toString());
            if(humanHand.checkHand(guessCards) == true){
                comp.increaseScore();
                System.out.println("The Computer Guessed Right! You have the Card: " + guessCards.toString());
                ArrayList<Card> removedCards =  humanHand.searchHand(guessCards);
                for(int i = 0; i<removedCards.size(); i++){
                    compHand.getHand().add(removedCards.get(i));
                }
                humanHand.removeCard(guessCards);
                System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                System.out.println(human.getName() + "'s Score: " + human.getScore());
                
                System.out.println("-------------------------------------------");
                System.out.println("Computer's Score:" + comp.getScore());
                

                isHumanturn = false;
              
            } else {
                isHumanturn = true;
                System.out.println(human.getName() + " doesn't have the card: " + guessCards);
                System.out.println("GoFish");
                if(cd.isEmpty()){
                    gofish.declareWinner(human, comp);
                    System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                
                    System.out.println("-------------------------------------------");
                    System.out.println("Computer's Cards: " + compHand.getHand());
                    break;
                } else{
                    compHand.addCard(cd.drawCards());
                    System.out.println(human.getName() + "'s Hand: " + humanHand.getHand());
                    System.out.println(human.getName() + "'s Score: " + human.getScore());

                    System.out.println("-------------------------------------------");
                    
                    System.out.println("Computer's Score: " + comp.getScore());
                }
                

                }
            
               
            
            }
            }
            }
        
            gofish.declareWinner(human, comp);
            }catch(Exception e){
            System.out.println(e.getMessage());        
            }
        }

    
    public static boolean checkSuit(int suit){
        
        if(suit <= Card.Suit.values().length){
            return true;
        }
        
        return false;
    }
    
  
    
    public static boolean checkValue(int value){
        
        if(value <= Card.Value.values().length){
            return true;
        }
        return false;
    }
    
    public static boolean checkDrawDeal(CardHand humanHand){
        if(humanHand.getHand().size() > 0){
            return true;
        }
        return false;
    }
    
    
    
    

  
}


    
   





