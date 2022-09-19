import java.util.Scanner;

public class Methods
{
    public static void getRequirements()
    {
        //Displaying operational messages
        System.out.println("Author: Ronald Tang");
        System.out.println("Non-OOP program calculates diameter, circumference, and circle area.");
        System.out.println("Must use Java's built in PI constant, printf(), and formatted to two decimal places.");
        System.out.println("Must *only* permit numeric entry. \n");   
    }

    public static void calculateCircle()
    {
        //intialize variables, create scanner object, and capture user input
        Scanner sc = new Scanner (System.in);
        double radius = 0.0;

        System.out.println("Enter circle radius: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Not valid number!\n");
            sc.next();      //If omitted, it will go into an infinite loop
            System.out.println("Please try again. Enter circle radius: ");
        }
        radius = sc.nextDouble();

        System.out.printf("\nCircle diameter: %.2f\nCircumference: " + "%.2f\nArea: %.2f\n",
        (2*radius), (2*Math.PI*radius), (Math.PI*radius*radius));

        sc.close();
    }
    
}
