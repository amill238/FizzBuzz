/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author audra
 */
public class FizzBuzzCalculationsTest {
    
    public FizzBuzzCalculationsTest() {
    }

    /**
     * Test of logic method, of class FizzBuzzCalculations.
     */
    @Test
    public void testLogic15() {
        String result = FizzBuzzCalculations.logic(15);
        assertEquals("FizzBuzz", result);
    }
    
    /**
     * Test of logic method, of class FizzBuzzCalculations.
     */
    @Test
    public void testLogic19() {
        String result = FizzBuzzCalculations.logic(19);
        assertEquals("19" , result);
    }
    
    /**
     * Test of logic method, of class FizzBuzzCalculations.
     */
    @Test
    public void testLogic21() {
        String result = FizzBuzzCalculations.logic(21);
        assertEquals("Fizz", result);
    }
    
    /**
     * Test of logic method, of class FizzBuzzCalculations.
     */
    @Test
    public void testLogic5() {
        String result = FizzBuzzCalculations.logic(5);
        assertEquals("Buzz", result);
    }
    
}
