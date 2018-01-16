package Chapter6;

import java.util.Scanner;

/**
 * Program to convert currencies
 *
 * @author Emiliano Perez
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double euroRate, poundRate, yenRate;
        double dollars;
        double eurosBought, poundBought, yenBought;
        String currency;
        String reply;
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        euroRate = input.nextDouble();
        System.out.print("How many Pounds does a dollar buy? ");
        poundRate = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        yenRate = input.nextDouble();
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            currency = input.next().toUpperCase();
            switch (currency) {
                case "E":
                    eurosBought = conversion(dollars, euroRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;
                case "P":
                    poundBought = conversion(dollars, poundRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pounds.\n", dollars, poundBought);
                    break;
                case "Y":
                    yenBought = conversion(dollars, yenRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", dollars, yenBought);
                    break;
            }
            do {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));
        } while (reply.equalsIgnoreCase("yes"));
    }

    /**
     * Method to convert currency given by user
     *
     * @param dollars reads the amount of currency that the user wants to
     * convert
     * @param exchangeRate reads the amount that a currency can be converted
     * @return gives the converted currency
     */
    public static double conversion(double dollars, double exchangeRate) {
        double result = (dollars > 100.0) ? dollars * 0.95 * exchangeRate : dollars * 0.90 * exchangeRate;
        return result;
    }
}
