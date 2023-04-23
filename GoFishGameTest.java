/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package softwareproj;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import static softwareproj.Card.Suit.CLUBS;
import static softwareproj.Card.Value.KING;


/**
 *
 * @author offic
 */
public class GoFishGameTest {
    
    public GoFishGameTest() {
    }


    /**
     * 
     */
    @Test
    public void testCheckSuitGood() {
        System.out.println("checkLength Good");
        int suit = 3;
        boolean expResult = true;
        boolean result = GoFishGame.checkSuit(suit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckSuitBad() {
        System.out.println("checkLength Good");
        int suit = 333;
        boolean expResult = false;
        boolean result = GoFishGame.checkSuit(suit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckSuitBoundary() {
        System.out.println("checkLength Good");
        int suit = 4;
        boolean expResult = true;
        boolean result = GoFishGame.checkSuit(suit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckValueGood() {
        System.out.println("checkValue Good");
        int value = 4;
        boolean expResult = true;
        boolean result = GoFishGame.checkSuit(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckValueBad() {
         System.out.println("checkValue Bad");
        int value = 500;
        boolean expResult = false;
        boolean result = GoFishGame.checkSuit(value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckValueBoundary() {
        System.out.println("checkValue Boundary");
        int value = 13;
        boolean expResult = false;
        boolean result = GoFishGame.checkSuit(value);
        assertEquals(expResult, result);
    }
    
    
    
    @Test
    public void testCheckHandBad() {
        System.out.println("checkHand Bad");
        CardHand hand = new CardHand();
        boolean expResult = false;
        boolean result = hand.checkHand(new Card( Card.Suit.values()[3-1], Card.Value.values()[3-1]));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckHandGood() {
        System.out.println("checkHand Good");
        CardHand hand = new CardHand();
        hand.addCard(new Card(Card.Suit.values()[3-1], Card.Value.values()[3-1]));
        boolean expResult = true;
        boolean result = hand.checkHand(new Card( Card.Suit.values()[3-1], Card.Value.values()[3-1]));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckHandEmptyGood() {
        System.out.println("checkHandEmpty Good");
        CardHand hand = new CardHand();
        boolean expResult = true;
        boolean result = hand.isEmpty();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckHandEmptyBad() {
        System.out.println("checkHandEmpty Bad");
        CardHand hand = new CardHand();
        hand.addCard(new Card(Card.Suit.values()[3-1], Card.Value.values()[3-1]));
        boolean expResult = false;
        boolean result = hand.isEmpty();
        assertEquals(expResult, result);
    }
    
    
    
  
    
}
