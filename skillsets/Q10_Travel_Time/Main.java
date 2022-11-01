import java.util.Scanner;

class Main{

    public static void main(String [] args){
        double miles = 0.0;
        double mph = 0.0;
        double hours = 0.0;
        double validMiles = 0.0;
        double validMPH = 0.0;

        String choice = "";

        //create scanner object
        Scanner sc = new Scanner(System.in);

        Methods.getRequirements();

        do
        {
            //validate miles (value-returning method)
            miles = Methods.validateMilesDataType();
            validMPH = Methods.validateMilesRange(miles);

            //validate mph (value-returning method)
            mph = Methods.validateMPHDataType();
            validMPH = Methods.validateMPHRange(miles);

            //display results
            Methods.calculateTravelTime(validMiles, validMPH);

            //conintue?
            System.out.print("\nContinue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

        while (choice.equalsIgnoreCase("y"));

    }
}