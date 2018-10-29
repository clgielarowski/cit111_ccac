/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2methods;

import java.util.Random;

/**
 *
 * @author cgiel0d
 */
public class SalesCalculator {

    private static int numCoffee, numCigs, totalCoffee, totalCigs;
    private static double coffeeSales, cigSales, profit, loss;
    private static final int MAXCOFFEE = 5;
    private static final int MAXCIGS = 10;
    private static final double COFFEEEXP = 1; //cost to store per cup of coffee
    private static final double CIGEXP = 7.80; // cost to store per pack of cigarettes
    private static final double COFFEEPRICE = 1.29; //price coffee is sold at
    private static final double CIGPRICE = 7.75; //price cigarettes are sold at
    private static int customers = 0;

    public static double sales() {
        double tProfitLoss;
        coffeeSales = (COFFEEPRICE - COFFEEEXP) * totalCoffee;
        cigSales = (CIGPRICE - CIGEXP) * totalCigs;
        if (coffeeSales < 0) {
            loss = coffeeSales + loss;
        } else {
            profit = coffeeSales + profit;
        }
        if (cigSales < 0) {
            loss = cigSales + loss;
        } else {
            profit = cigSales + profit;
        }
        if (profit > loss) {
            tProfitLoss = profit - loss;
        
        tProfitLoss = Math.floor(tProfitLoss * 100) / 100;
        System.out.println("Profit: $" + tProfitLoss);
        }else{
        tProfitLoss = loss-profit;
        tProfitLoss = Math.floor(tProfitLoss * 100) / 100;
        System.out.println("Loss: $" + tProfitLoss);
        }
        return profit;

    }

    public static int orderCoffee() {
        Random rand = new Random();
        numCoffee = rand.nextInt(MAXCOFFEE);
        totalCoffee = totalCoffee + numCoffee;
        return numCoffee;
    }

    public static int orderCigs() {
        Random rand = new Random();
        numCigs = rand.nextInt(MAXCIGS);
        totalCigs = totalCigs + numCigs;
        return numCigs;
    }

    public static void orderDisplay() {
        System.out.println("**********************************");
        System.out.println("Cups of Coffee Purchased: " + numCoffee);
        System.out.println();
        System.out.println("Packs of Cigarettes Purchased: " + numCigs);
        System.out.println("**********************************");
    }

    public static void orderTotal() {
        System.out.println("Total Cups of Coffee Purchased: " + totalCoffee);
        System.out.println("Total Packs of Cigarettes Purchased: " + totalCigs);
    }

    public static void main(String[] args) {

        while (customers <= 20) {
            orderCoffee();
            orderCigs();
            orderDisplay();
            ++customers;
        }
        orderTotal();
        sales();
    }
}
