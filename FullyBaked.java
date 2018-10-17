/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

import java.util.Scanner;

/**
 *
 * @author cgiel0d
 */
public class FullyBaked {
    public static double areashape(int choice){
        double length, width, height, base, radius;
        double area = 0;
        final double PIE = 3.14;
        Scanner measureIn = new Scanner (System.in);
        switch (choice){
            case 1:
                System.out.println("Please enter Length");
                length = measureIn.nextDouble();
                System.out.println("Please enter Width");
                width = measureIn.nextDouble();
                area = length * width;
                break;
            case 2:
                System.out.println("Please enter radius");
                radius = measureIn.nextDouble();
                area = PIE * radius*radius;
                break;
            case 3:
                System.out.println("Enter length of base");
                base = measureIn.nextDouble();
                System.out.println("Please enter height");
                height = measureIn.nextDouble();
                area = (.5*base)*height;
                break;
            default:
                break;
        }//end switch
        return area;
    }//end areashape
    public static double volumeshape(int choice){
        double length, width, height, radius, area;
        double volume = 0;
        final double PIE = 3.14;
        Scanner measureIn = new Scanner (System.in);
        switch (choice){
            case 1:
                System.out.println("Please enter Length");
                length = measureIn.nextDouble();
                System.out.println("Please enter Width");
                width = measureIn.nextDouble();
                System.out.println("Please enter Height");
                height = measureIn.nextDouble();
                volume = length * width * height;
                break;
            case 2:
                System.out.println("Please enter radius of base");
                radius = measureIn.nextDouble();
                System.out.println("Please enter Height");
                height = measureIn.nextDouble();
                volume = .3333*PIE*radius*radius*height;
                break;
            case 3:
                System.out.println("Please enter Radius of base");
                radius = measureIn.nextDouble();
                System.out.println("Please enter Height");
                height = measureIn.nextDouble();
                radius = radius*2;
                volume = (PIE*radius)* height;
                break;
            default:
                break;
        }//end switch
        return volume;
    }//end volumeshape

    public static double avdecide(String scan1) {
        int choice;
        double answer = 0;
        Scanner scankey2 = new Scanner (System.in);
        switch (scan1.toLowerCase()) {
            case "volume":
                System.out.println("What shape would you like to find volume for?");
                System.out.println("1 - Cuboid");
                System.out.println("2 - Cone/Pyramid");
                System.out.println("3 - Cylinder");
                choice = scankey2.nextInt();
                answer = volumeshape(choice);
                break;
            case "area":
                System.out.println("What shape would you like to find area for?");
                System.out.println("1 - Rectangle");
                System.out.println("2 - Circle");
                System.out.println("3 - Triangle");
                choice = scankey2.nextInt();
                answer = areashape(choice);
                break;
            default:
                System.out.println("Default case");
        }//end switch
  return answer;
    }//end avdecide

    public static void main(String[] args) {
        String scan1;
        double answer;
        System.out.println("Welcome to Geometric Shapes!");
        Scanner scankey = new Scanner(System.in);
        System.out.println("Would you like to calculate Area or Volume?");
        scan1 = scankey.next();
        answer = avdecide(scan1);
        System.out.println("answer:" + answer);
        

    }//end main
}//end class
