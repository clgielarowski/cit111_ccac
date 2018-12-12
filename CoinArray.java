/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStructures;

/**
 *
 * @author cgiel0d
 */
public class CoinArray {
    public static void main(String[] args){
    
        String[] coins = new String[6];
        coins[0] = "Penny";
        coins[1] = "Nickel";
        coins[2] = "Dime";
        coins[3] = "Quarter";
        coins[4] = "Half Dollar";
        coins[5] = "Dollar";
        
        printCoinName(coins);
        
        System.out.println("I have six selves filled with differnt coins!");
        System.out.println("Shelf 1: "+coins[0]);
        System.out.println("Shelf 2: "+coins[1]);
        System.out.println("Shelf 3: "+coins[2]);
        System.out.println("Shelf 4: "+coins[3]);
        System.out.println("Shelf 5: "+coins[4]);
        System.out.println("Shelf 6: "+coins[5]);
        
        
    }

    private static void printCoinName(String[] coins) {
        
    }
}
