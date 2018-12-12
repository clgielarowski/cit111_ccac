/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cgiel0d
 */
public class ScopeBasics {

    private static int totalRiders, totalFailedRideAttempts, totalSickRiders;
    private final static int MGRMINHEIGHT = 36;
    private final static int GLMINHEIGHT = 48;
    private final static int BWMINHEIGHT = 60;
    private final static int RIDERS = 8;
    private final static int MIN = 24;
    private final static int MAX = 65;
    private static int h; 
    
    public static int getRandomHeight(){
    h = (int)(Math.random()*((MAX-MIN)+1))+MIN;
    return h;
}
   
    public static void merryGoRound() {
        Random randride = new Random();
        int walkUp, aHeight;
        System.out.println("Merry Go Round Counter");
        System.out.println();
        while (totalRiders <= 500) {
            System.out.println("Enter Number of riders in group");
            walkUp = randride.nextInt(RIDERS)+1;
            System.out.println(walkUp);
            getRandomHeight();
            System.out.println("Enter Average Height of Group");
            
            System.out.println(h);
            if (h >= MGRMINHEIGHT) {
                totalRiders = totalRiders + walkUp;
                
                int sickRiders = randride.nextInt(walkUp);
                totalSickRiders = totalSickRiders + sickRiders;

            } else {
                totalRiders = totalRiders + walkUp;
                totalFailedRideAttempts = totalFailedRideAttempts + walkUp;

            }
        }
    }

    public static void gatorLaunch() {
        Random randride = new Random();
        int walkUp, aHeight;
        System.out.println("Gator Launch Counter");
        System.out.println();
        while (totalRiders >= 500) {
            System.out.println("Gator Launch Counter");
            System.out.println("Enter Number of riders in group");
            walkUp = randride.nextInt(RIDERS)+1;
            System.out.println(walkUp);
            getRandomHeight();
            System.out.println("Enter Average Height of Group");
            
            System.out.println(h);
            if (h >= GLMINHEIGHT) {
                totalRiders = totalRiders + walkUp;
                
                int sickRiders = randride.nextInt(walkUp);
                totalSickRiders = totalSickRiders + sickRiders;

            } else {
                totalRiders = totalRiders + walkUp;
                totalFailedRideAttempts = totalFailedRideAttempts + walkUp;

            }
        }
    }

    public static void blackWidow() {
        Random randride = new Random();
        int walkUp, aHeight;
        System.out.println("Black Widow Counter");
        System.out.println();
        while (totalRiders <= 500) {
            System.out.println("Black Widow Counter");
            System.out.println("Enter Number of riders in group");
            walkUp = randride.nextInt(RIDERS)+1;
            System.out.println(walkUp);
            getRandomHeight();
            System.out.println("Enter Average Height of Group");
            System.out.println(h);
            if (h >= BWMINHEIGHT) {
                totalRiders = totalRiders + walkUp;
                
                int sickRiders = randride.nextInt(walkUp);
                totalSickRiders = totalSickRiders + sickRiders;

            } else {
                totalRiders = totalRiders + walkUp;
                totalFailedRideAttempts = totalFailedRideAttempts + walkUp;

            }
        }
    }

    public static void ridecounter() {
        System.out.println("Select ride:");
        System.out.println("1 - Merry Go Round");
        System.out.println("2 - Gator Launch");
        System.out.println("3 - Black Widow");
        System.out.println();
       //Random choice = new Random();
        int choice1 = 1; 
//choice.nextInt(scan1)+1;

        switch (choice1) {
            case 1:
                merryGoRound();
                break;
            case 2:
                gatorLaunch();
                break;
            case 3:
                blackWidow();
                break;
            default:
                break;
        }
      

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Kennywood rider counter");
        ridecounter();
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Turned Away: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);

    }
}
