/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalPackage;

/**
 *
 * @author cgiel0d
 */
public class Retailer {
     public static void main(String[] args){
     
     Phone one = new Phone();
     Phone two = new Phone();
     one.model = "Samsung";
     two.model = "Apple";
     one.carrier = "Verizon";
     two.carrier = "Verizon";
     one.powerOn();
     one.volume = 10;
     one.data = 160;
     one.increaseVolume(25);
     one.useData(230);
     one.powerOff();
     
}
}     
