//SS7
import java.util.Scanner;

public class Methods
{
    public static void getRequirements(){
        System.out.println("Program converts inches to centimeters, meters, feet, yards, and miles.");
        System.out.println("***Notes***:"
                        +"\n1) Use integer for inches (must validate integer input)."
                        +"\n2) Use printf() function to print (format values per below output)."
                        +"\n3) Create Java \"constants\" for the following values:"
                        +"\n\tINCHES_TO_CENTIMETER,"
                        +"\n\tINCHES_TO_METER,"
                        +"\n\tINCHES_TO_FOOT,"
                        +"\n\tINCHES_TO_YARD,"
                        +"\n\tFEET_TO_MILE\n");
        

    }
    public static void measurementConversion ()
    {

    //System.out.println("Program converts to inches to centimeters, meter, feet, yards, and miles.");

    int inches = 0;
    double centimeters = 0.;
    double meters = 0.0;
    double feet = 0.0;
    double yards = 0.0;
    double miles = 0.0;

    //constants
    final double INCHES_TO_CENTIMETER =  2.54;
    final double INCHES_TO_METER = .0254;
    final double INCHES_TO_FOOT = 12;
    final double INCHES_TO_YARD = 36;
    final double FEET_TO_MILES = 5280;

    Scanner input = new Scanner (System.in);

    System.out.print("Please enter number of inches: ");
    while (!input.hasNextInt())
    {
        System.out.println("Not a valid integer!\n");
        input.next();
        System.out.print("Please enter number of inches: ");
    }

    inches = input.nextInt();

    centimeters = inches * INCHES_TO_CENTIMETER;
    meters = inches * INCHES_TO_METER;
    feet = inches / INCHES_TO_FOOT;
    yards = inches / INCHES_TO_YARD;
    miles = feet / FEET_TO_MILES;

    System.out.printf("%,d inches(es) equals\n\n%,.6f centimeter(s)\n%,.6f meter(s)\n%,.6f feet\n%,.6f yard(s)\n%,.8f mile(s)\n", inches, centimeters, meters, feet, yards, miles);

    }
}