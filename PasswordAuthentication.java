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
public class PasswordAuthentication {

    public static void main(String[] args) {
        int attempt = 1;
        final int max_attempt = 3;
        String password = "PaSSword";
        String attempt_pass;
        int choice;

        Scanner scanner = new Scanner(System.in);
        while (attempt <= max_attempt) {
        System.out.println("Enter the system password to learn the protected information");
            attempt_pass = scanner.next();
            if (attempt_pass.equals(password)) {
                System.out.println("Correct Password!!");
                System.out.println("******************");
                System.out.println("What would you like to do now?");
                System.out.println("1 - See Secret");
                System.out.println("2 - Change Password");
                System.out.println("3 - Log Out");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("The Secret is x+1=y");
                    break;
                } else {
                    if (choice == 2) {
                        System.out.println("Please enter new password:");
                        password = scanner.next();
                    }else{
                        if(choice == 3){
                            System.out.println("Good Bye!");
                            break;
                        }
                    }//end if else
                }//end if else
            } else {
                System.out.println("Incorrect Password, try again:");
                System.out.println("Number of attemps; " + attempt);
                System.out.println("Number of attempts allowed: " + max_attempt);
                attempt++;
                if (attempt > max_attempt) {
                    System.out.println("You are locked out");
                    break;
                }//end if
            }//end if else
        }//end while


    }//end main
}//end class
