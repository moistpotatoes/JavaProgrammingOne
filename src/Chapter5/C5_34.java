package Chapter5;

import java.util.Scanner;

/**
 * Program Generates a game of rock,paper,scissors
 *
 * @author Emiliano Perez
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int computerGuess, playerGuess;
        int compCount = 0, playerCount = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter 0,1, or 2"); // 0 - scissors 1 - rock 2 - paper
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0: // player picks scissors
                    switch (computerGuess) {
                        case 0:
                            // scissors (player) VS scissors (computer)
                            System.out.println("TIE");
                            break;
                        case 1:
                            // scissors (player) VS rock (computer)
                            System.out.println("You lose");
                            ++compCount;
                            break;
                        case 2:
                            // scissors (player) VS paper (computer)
                            System.out.println("You win");
                            ++playerCount;
                            break;
                        default:
                            break;
                    }
                    break;
                case 1:
                    switch (computerGuess) {
                        case 1:
                            System.out.println("You lose");
                            ++compCount;
                            break;
                        case 0:
                            System.out.println("TIE");
                            break;
                        case 2:
                            System.out.println("You win");
                            ++playerCount;
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch (computerGuess) {
                        case 2:
                            System.out.println("You win");
                            ++playerCount;
                            break;
                        case 1:
                            System.out.println("You lose");
                            ++compCount;
                            break;
                        case 0:
                            System.out.println("TIE");
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } while (playerCount <= 2 && compCount <= 2);
    }
}
