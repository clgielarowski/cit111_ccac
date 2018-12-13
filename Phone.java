/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalPackage;
import java.util.Random;
/**
 *
 * @author Computer
 */
public class Phone {
    public boolean power;
    public int volume;
    public int data;
    public int aCode;
    public int num3;
    public int num4;
    public final int maxVolume = 100;
    public final int minVolume = 0;
    public final int maxData = 500;
    public final int minData = 0;
    public String model;
    public String carrier;
    
    public void genPhoneNum(){
        Random three = new Random();
        Random four = new Random();
        num3=three.nextInt(900)+100;
        num4=four.nextInt(9000)+1000;
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-**-*-*-*-*-*-*-");
        System.out.println("Please take NOTE of Phone Number for this device: ("+aCode+") "+num3+"-"+num4);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
    
    public void maximumData(){
        data = 500;
        System.out.println("Looks like you are out of data!");
        System.out.println(data+" Gb used of "+maxData);
    }
    
    public void minimumData(){
        data = 0;
        System.out.println(data+" Gb used of "+minData);
    }
    
    public void useData(int incData){
        if(data<maxData){
            data = data + incData;
            System.out.println(data+" Gb used of "+maxData);
            if(data>=maxData){
                maximumData();
            }
        }else{
            maximumData();
        }
    }
   
    public void maximumVolume(){
        volume = 100;
        System.out.println("Beep");
        System.out.println();
        System.out.println(volume); 
    }
    
    public void minimumVolume(){
        volume = 0;
        System.out.println("Vibrate");
        System.out.println();
        System.out.println(volume);
    }
    public void powerOn(){
        power = true;
        System.out.println("Welcome!");
    }
    public void powerOff(){
        power = false;
        System.out.println("GoodBye!");
    }
    public boolean isPhoneOn(){
        return power;
    }
    public void increaseVolume(int incVol){
        if (volume < maxVolume){
                volume = volume + incVol;
                System.out.println("Volume up: "+volume);
                if(volume>=maxVolume){
                    maximumVolume();
                }
        }else{
            maximumVolume();
        }
    }
    public void decreaseVolume(int decVol){
        if (volume>minVolume){
            volume = volume-decVol;
            System.out.println("Volume down: "+volume);
            if(volume<=minVolume){
                minimumVolume();
            }
        }else{
            minimumVolume();
        }
    }
}

