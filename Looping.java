/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStructures;
import java.util.Scanner;

/**
 *
 * @author Christine Gielarowski
 */
public class Looping {
    public static void main (String[]args ){
        double retire_age = 65.5;
        double month;
        double year;
        double age;
        final double this_month = 10;
        final double this_year = 2018;
        
        
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What month were you born?");
            month = scanner.nextInt();
            System.out.println("What year were you born?");
            year = scanner.nextInt();
            age = ((this_month - month)/12) + (this_year - year);
            System.out.println("age = "+age);
            if(age>retire_age){
                System.out.println("Wahoo! Grab the newspaper and martini!");
            }else{
                if(age<=0){
                    System.out.println("Thanks for checking your retirement status");
                    break;
                }else{
                System.out.println("Sorry, keep working");
                }//end if else
            }//end if else
 
        }//end while
        
    }//end main
}//end class
