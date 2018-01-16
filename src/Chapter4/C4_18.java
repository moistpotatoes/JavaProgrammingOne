package Chapter4;

import java.util.Scanner;

/**
 * Program to display the major given by the user
 *
 * @author Emiliano Perez
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Variable to store output to be displayed
        String output;

        // Prompt the user to enter data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine().toUpperCase();

        // Determining the output for wrong input
        if ((s.charAt(0) != 'M' && s.charAt(0) != 'C' && s.charAt(0) != 'I') || (s.charAt(1) != '1' && s.charAt(1) != '2' && s.charAt(1) != '3' && s.charAt(1) != '4')) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        // Determining the output for the major
        switch (s.charAt(0)) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;

        }

        // Determining the output for the student status
        switch (s.charAt(1)) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;

        }

    }
}
