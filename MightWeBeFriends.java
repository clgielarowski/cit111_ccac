
package ControlStructures;

import java.util.Scanner;
        //builds a scanner object and stores
        //in variable myScanner
/**
 * Implement logic for checking 
 * friend compatability to practice 
 * if statements.
 * 
 * @author Christine Gielarowski
 */
public class MightWeBeFriends {
    public static void main(String[] args){
 
        boolean likescrafting;
        boolean likesreading;
        boolean haschildren;
        boolean catordog;
        boolean gocommunity;
        int age;
        int ptsearned = 0;
        int posspts = 600;
        
        System.out.println("Hey, let's see if we mesh!");
        System.out.println("True or False? You Enjoy Crafting");
        Scanner crafting = new Scanner (System.in);
        likescrafting = crafting.nextBoolean();
        
        if(likescrafting == true){
            ptsearned = ptsearned + 100;
            System.out.println("**Do you wanna build a snowman?**");
                }else{
            ptsearned = ptsearned - 15;
            System.out.println("**Maybe you should give it a try!**");
        }//end if/else
        
        System.out.println("True or False? You Enjoy Reading");
        Scanner reading = new Scanner (System.in);
        likesreading = reading.nextBoolean();
        
        if(likesreading==true){
            ptsearned = ptsearned + 100;
            System.out.println("**That's awesome, my favorite books are non-fiction**");
        }else{
            ptsearned = ptsearned - 15;
            System.out.println("**What are you doing with your life??**");
        }//close if/else
        
        System.out.println("True or False? You Have Children");
        Scanner children = new Scanner (System.in);
        haschildren = children.nextBoolean();
        
        if(haschildren==true){
            ptsearned = ptsearned + 100;
            System.out.println("**Awesome, I have 2 children**");
        }else{
            ptsearned = ptsearned - 15;
            System.out.println("**That's okay, we might still be friends!**");
        }//close if/else
        
        System.out.println("True or False? You like dogs more than cats");
        Scanner catdog = new Scanner (System.in);
        catordog = catdog.nextBoolean();
        
        if(catordog==true){
            ptsearned = ptsearned + 100;
            System.out.println("**I love cats and dogs, but especially dogs**");
        }else{
            ptsearned = ptsearned + 50;
            System.out.println("**I love cats and dogs, but especially dogs**");
        }//close if/else
        
        System.out.println("True or False? You are Involved in the Community");
        Scanner community = new Scanner (System.in);
        gocommunity = community.nextBoolean();
        
        if(gocommunity==true){
            ptsearned = ptsearned + 100;
            System.out.println("**Awesome, maybe we could go to a funraiser together!**");
        }else{
            ptsearned = ptsearned - 15;
            System.out.println("**It takes a village, maybe you should join**");
        }//close if/else
        
        System.out.println("How old are you?");
        Scanner numage = new Scanner (System.in);
        age = numage.nextInt();
        
        if(age>=21){
            ptsearned = ptsearned + 100;
        }else{
            ptsearned = ptsearned - 100;
        }//close if/else 
        
        if(ptsearned >= (posspts *.5)){
            System.out.println("Looks like we have losts in common!!");
        }else{
            System.out.println("Doesn't seem we have much in common... :(");
        }//close if/else
     
        if(ptsearned >= 0){
            System.out.println("Your point total is " + ptsearned + "/"+ (posspts));
        }else{
            System.out.println("Your point total is 0/"+ (posspts));
        }//end if/else
    }//end main
}//end class
        
            
    
