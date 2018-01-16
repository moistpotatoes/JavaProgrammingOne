package Chapter4;

import java.util.Scanner;

/**
 * Program to display information for a employee given by the user
 *
 * @author Emiliano Perez
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Prompt the user to enter data 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        // Computations
        double grossPay = hoursWorked * hourlyRate;
        double federalTaxWithholding = federalTax * grossPay;
        double stateTaxWithholding = stateTax * grossPay;
        double totalDeduction = federalTaxWithholding + stateTaxWithholding;
        double netPay = grossPay - totalDeduction;

        // Program output
        System.out.printf("Employee Name: %s\n", name);
        System.out.printf("Hours Worked: %.2f\n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", hourlyRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("Deductions: \n");
        System.out.printf("\tFederal Withholding (%.2f%%):  $%.2f\n", (federalTax * 100), federalTaxWithholding);
        System.out.printf("\tState Withholding (%.2f%%):  $%.2f\n", (stateTax * 100), stateTaxWithholding);
        System.out.printf("\tTotal Deduction:" + "  $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }

}
