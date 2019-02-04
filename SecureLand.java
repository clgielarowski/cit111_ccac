/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewObj;

/**
 *
 * @author cgiel0d
 */
public class SecureLand {
     public static void main(String[] args){
         String[]req = new String[2];
         req[0] = "!";
         req[1] = "@";
         String passAttempt = "p@ssword";
         StrengthCheck T = new StrengthCheck();
         T.SetRLength(8, 16);
         T.SetRChar(req);
         
     }
}
