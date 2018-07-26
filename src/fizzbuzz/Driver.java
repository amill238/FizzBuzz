/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author audra
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            String result = FizzBuzzCalculations.logic(i);
            System.out.println(result);
        }
    }
}
