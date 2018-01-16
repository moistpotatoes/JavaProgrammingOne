package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes given by user
 *
 * @author Emiliano Perez
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        String response;
        int yesVotes = 0, noVotes = 0, invalidVotes = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Y to vote, N to not, or Q to quit voting: ");
            response = input.next();

            if (response.equalsIgnoreCase("y")) {
                ++yesVotes;
            } else if (response.equalsIgnoreCase("n")) {
                ++noVotes;
            } else if (!response.equalsIgnoreCase("q")) {
                System.out.print("INVALID CODE: ");
                ++invalidVotes;
            }
        } while (!response.equalsIgnoreCase("q"));

        System.out.println();
        System.out.println("Yes votes: \t" + yesVotes);
        System.out.println("No votes: \t" + noVotes);
        System.out.println("Invalid votes: \t" + invalidVotes);
        System.out.println("Total votes: \t");

    }
}
