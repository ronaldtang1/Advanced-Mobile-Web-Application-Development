import java.util.Scanner;

public class Methods {

    public static void getRequirements()
    {
        System.out.println("Program calculates approximate travel time.");

        //display operational messages
        System.out.println("Program prompts user to enter miles and miles per hour.");
        System.out.println("Accepts decimal entries.");
        System.out.println("Prompt user to continue (only if user enters \"y\" or \"Y\").");
        System.out.println("*Must* perform data validation.\n"
                    + "Hint: Use integer arithmetic and division and modulus operators to calculate hours and minutes.");
        System.out.println("Display approximate travel time in hours and minutes.");
        System.out.println();            
    }
    
    public static double validateMilesDataType()
    {
        //initialize variables, create Scanner object, capture user input
        double miles = 0.0;
        Scanner sc = new Scanner(System.in );

        //input
        System.out.println("Enter miles: ");
        while (!sc.hasNextDouble())
        {
            System.out.print("Invalidate input--miles must be a number: ");
            sc.next();
        }
        miles = sc.nextDouble();
        return miles;
    }

    public static double validateMilesRange(double miles)
    {
        while (miles <= 0 || miles > 3000)
        {
            System.out.println("Miles must be greater than 0, and no more than 3000.\n");
            miles = validateMilesDataType();
        }
        return miles;
    }

    public static double validateMPHDataType()
    {
        //initialize variables, create Scanner object, capture user input
        double mph = 0.0;
        Scanner sc = new Scanner(System.in );

        //input
        System.out.println("Enter mph: ");
        while (!sc.hasNextDouble())
        {
            System.out.print("Invalidate input--mph must be a number: ");
            sc.next();
        }
        mph = sc.nextDouble();
        return mph;
    }

    public static double validateMPHRange(double mph)
    {
        while(mph <= 0 || mph > 100)
        {
            System.out.println("Mph must be greater than 0, and no more than 100.\n");
            mph = validateMPHDataType();
        }
        return mph;
    }

    public static void calculateTravelTime(double miles, double mph)
    {
        double hours = 0.0;
        int minutes = 0;
        int hoursInt = 0;
        int minutesRemainder = 0;

        //calculate travel time in hours with decimal division
        hours = miles / mph;

        //get number of minutes as int
        minutes = (int) (hours * 60);

        //integer arithmetic to get hours and minutes as int values
        hoursInt = minutes/60;
        minutesRemainder = minutes % 60;

        //display result
        System.out.println("Estimated travel time: " + hoursInt + " hr(s) " + minutesRemainder + " Minutes");
    }
}
