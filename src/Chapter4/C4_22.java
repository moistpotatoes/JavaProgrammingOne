package Chapter4;

import java.util.Scanner;

/**
 * Program to display substring of a string given by the user
 *
 * @author Emiliano Perez
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;

        System.out.print("Insert String One: ");
        s1 = scan.next();
        System.out.print("Insert String Two: ");
        s2 = scan.next();

        if (s1.contains(s2)) {
            System.out.printf("String %s has the substring of %s", s1, s2);
        } else {
            System.out.printf("String %s does not have the substring %s", s1, s2);
        }

    }

}
