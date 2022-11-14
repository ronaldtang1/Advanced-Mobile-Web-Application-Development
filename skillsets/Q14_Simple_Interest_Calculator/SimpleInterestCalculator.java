import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double principal = 0.0;
        double rate = 0.0;
        int years = 0;
        double interest = 0.0;
        double amount = 0.0;

        //requirements
        System.out.println("Developer: Ronald Tang");
        System.out.println("Program performs the following funcions:");
        System.out.println("1. Calculates amount of money saved for a period of years, at a specified interest rate (i.e., yearly, non-compounded)");
        System.out.println("2. Returned amount is formatted in U.S. currency, and rounded to two decimal places.");
        System.out.println("\n***Note:*** Program checks for non-numeric values, as well as only integer values for years.\n");

        //get principal
        System.out.print("Current principal: $");
        while (!scnr.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            scnr.next();
            System.out.print("Please try again. Enter principal: $");
        }//end while
        principal = scnr.nextDouble();

        //get interest rate
        System.out.print("\nInterest Rate (per year): ");
        while (!scnr.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            scnr.next();
            System.out.print("Please try again. Enter interest rate: ");
        }//end while
        rate = scnr.nextDouble();

        //get years
        System.out.print("\nTotal time (in years): ");
        while (!scnr.hasNextInt()) {
            System.out.println("Not valid integer!\n");
            scnr.next();
            System.out.print("Please try again. Enter years: ");
        }//end while
        years = scnr.nextInt();

        //calculate interest rate and total and print final statement
        interest = principal*rate*years/100;
        amount = principal + interest;

        System.out.printf("\nYou will have saved $%,.2f in %d years, at an interest rate of %.3f%s", amount, years, rate, "%");
        scnr.close();
    }// end main
}//end class
