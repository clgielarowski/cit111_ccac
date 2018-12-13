package finalPackage;

import java.util.Scanner;

/**
 *
 * @author cgiel0d
 */
public class Retailer {

    public static Phone[] phoneArray = new Phone[3];
    public static int i;
    public static int sales=0;
    
    public static void printReciept(){
        System.out.println();
        System.out.println("****************************");
        System.out.println();
        System.out.println("Sale #: "+sales);
        System.out.println("Thank you for your purchase!");
        System.out.println();
        System.out.println("Carrier: "+phoneArray[i].carrier);
        System.out.println();
        System.out.println("Model of Phone: "+phoneArray[i].model);
        System.out.println();
        System.out.println("You have "+ (phoneArray[i].maxData - phoneArray[i].data)+"GB available of "+phoneArray[i].maxData);
        System.out.println("*****************************");
    }

    public static void main(String[] args) {

        Scanner salesman = new Scanner(System.in);
                for (i = 0; i < phoneArray.length; i++) {
                    System.out.println("Transaction Number: "+(i+1));
                    phoneArray[i] = new Phone();
                    System.out.println("Please Enter Service Provider: ");
                    phoneArray[i].carrier = salesman.next();
                    System.out.println("Please Enter Model of Phone: ");
                    phoneArray[i].model = salesman.next();
                    System.out.println("Please Enter Desired 3 Digit Area Code");
                    phoneArray[i].aCode = salesman.nextInt();
                    phoneArray[i].genPhoneNum();
                    System.out.println("Are you ready to turn on the device? ");
                    System.out.println("Please enter True for yes, False for no");
                    phoneArray[i].power = salesman.nextBoolean();
                    if (phoneArray[i].isPhoneOn()) {
                        System.out.println("Phone is turning on... ");
                        phoneArray[i].powerOn();
                        System.out.println("Loading Default Apps....");
                        phoneArray[i].useData(50);
                        System.out.println("Phone is ready for use!");
                        sales = sales + 1;
                        printReciept();

                    } else {
i=i-1;
                        System.out.println("YOU CANNOT COMPLETE A SALE WITHOUT CONFIGURING");
                    }
                    
                }

            }

        }
    


