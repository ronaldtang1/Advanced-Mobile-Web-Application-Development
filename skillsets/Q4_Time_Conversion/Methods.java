import java.util.Scanner;

public class Methods{
    public static void getRequirements()
    {

        // display operational messages
        System.out.println("Author: Ronald Tang");
        System.out.println("Program converts seconds to minutes, hours, days, weeks, and (regular) years--365 days.");
        System.out.println("***NOTES***: \n1) Use integer for seconds (must validate integer input). \n2) Use printf() function to print (format values per below output). \n3) Create Java \"constants\" for the following values: \n\tSECS_IN_MINS, \n\tMINS_IN_HR, \n\tHRS_IN_DAY, \n\tDAYS_IN_WEEK, \n\tDAYS_IN_YR (365 days)\n");
    }

    public static void convertTime()
    {
        
        //initialize variables, create scanner object, capture user input
        int seconds = 0;
        double minutes = 0.0;
        double hours = 0.0;
        double days = 0.0;
        double weeks = 0.0;
        double years = 0.0;

        //constants
        final double SECS_IN_MINS = 60;
        final double MINS_IN_HR = 60;
        final double HRS_IN_DAY = 24;
        final double DAYS_IN_WEEK = 7;
        final double DAYS_IN_YEAR = 365;

        //create scanner object
        Scanner sc = new Scanner(System.in);

        //1. input
        System.out.print("Please enter number of seconds: ");
        while (!sc.hasNextInt())
        {
            System.out.println("Not valid integer!\n");
            sc.next();  //infinite loop if invalid
            System.out.print("Please enter number of seconds: ");
        }
        seconds = sc.nextInt();

        //2. process
        minutes = seconds / SECS_IN_MINS;
        hours = minutes / MINS_IN_HR;
        days = hours / HRS_IN_DAY;
        weeks = days / DAYS_IN_WEEK;
        years = days / DAYS_IN_YEAR;

        //3. output
        //System.out.println(seconds + " second(s) equals\n\n" + minutes + " minute(s)\n" + hours + " hour(s)\n" + days + " day(s)\n" + years + " year(s).");
        System.out.printf("%,d second(s) equals\n\n%,.2f minute(s)\n%,.3f hour(s)\n%,.4f day(s)\n%,.5f week(s)\n%,.6f year(s)\n", seconds, minutes, hours, days, weeks, years);


        //scanner close
        sc.close();
    }
}
