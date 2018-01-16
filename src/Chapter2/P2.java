package Chapter2;

import java.util.Scanner;

/**
 * Program to compute price of a meal
 *
 * @author Emiliano Perez
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Making the Scanner
        Scanner input = new Scanner(System.in);

        //Getting prices and creating variables
        System.out.print("Input price of Food: ");
        double food = input.nextDouble();

        System.out.print("input price of Drinks: ");
        double drink = input.nextDouble();

        System.out.print("Input price of Dessert: ");
        double dessert = input.nextDouble();

        double total = (food + drink + dessert);
        double tax = (total * .10);
        double tip = ((total + tax) * .15);

        System.out.println("Your starting price: " + total);
        System.out.println("Your tax: " + (tax));
        System.out.println("Your tip: " + (tip));
        System.out.println("Your subtotal is: " + (total + tip + tax));
    }
}
