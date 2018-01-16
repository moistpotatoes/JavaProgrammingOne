package Chapter2;

import java.util.Scanner;

/**
 * Program to compute subtotal and tip given by user
 *
 * @author Emiliano Perez
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subtotal & tip:");
        double subtotal = input.nextDouble();
        double tip = input.nextDouble();
        tip = (tip / 100) * subtotal;
        double total = subtotal + tip;
        System.out.print(total + "Total is" + tip + "Tip is");

    }

}
