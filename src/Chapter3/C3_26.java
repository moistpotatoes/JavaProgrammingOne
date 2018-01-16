package Chapter3;

import java.util.Scanner;

/**
 * Program to prompt the user to enter a number to enter then the program checks
 * divisibility
 *
 * @author Emiliano Perez
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        if (x % 5 == 0) {
            System.out.println("The number you entered is divisible by 5");
        } else {
            System.out.println("The number you entered is not divisible by 5");
            if (x % 6 == 0) {
                System.out.println("The number you entered is divisible by 6");
            } else {
                System.out.println("The number you entered is not divisible by 6");
            }
        }
    }

}
