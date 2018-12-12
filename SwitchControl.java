/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

/**
 *
 * @author cgiel0d
 */
public class SwitchControl {
    public static void main (String[]args){
        final int SELECTOR = 2;
        
        switch(SELECTOR){
            case 1:
                System.out.println("First case selected");
                break;
            case 2:
                System.out.println("Second case selected");
                break;
            case 78:
                System.out.println("Cases can match any int value");
                break;
            default:
                System.out.println("Default case");
        }
    }
}
