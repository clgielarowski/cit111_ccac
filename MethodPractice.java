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
public class MethodPractice {
    public static void printLocation(){
        System.out.println("I'm in printLocation");
    }//close printLocation
    public static void addTen(int x){
        int y = x +10;
        System.out.println("y ="+y);
    }//close addTen
    
    public static void main(String[]args){
        printLocation(); // call method
        System.out.println("I'm in main");
        addTen(6);
    }//close main    
}//close class
