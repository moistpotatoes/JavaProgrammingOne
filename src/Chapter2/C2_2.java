package Chapter2;

import java.util.Scanner;

/**
 * Program to display radius of a circle
 *
 * @author Emiliano Perez
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        final double PI = 3.1415;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = Math.pow(radius, 2) * PI;
        System.out.print("The area is " + area);

        double volume = area * length;
        System.out.print(" The volume is " + volume);

    }

}
