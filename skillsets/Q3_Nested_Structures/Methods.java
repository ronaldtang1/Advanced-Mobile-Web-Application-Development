import java.util.Scanner;

public class Methods 
{
    public static void getRequirements()
    {
        //display operational messages
        System.out.println("Author: Ronald Tang");
        System.out.println("Program counts, totals, and averages total number of user-entered exam scores.");
        System.out.println("Please enter exam scores between 0 and 100, inclusive. \nEnter out of range numbers to end program.");
        System.out.println("Must *only* permit numeric entry.\n");
    }    

    public static void calculateScores()
    {
        //intialize variables, create Scanner object, capture user input
        double total = 0.0;
        int count = 0;
        double score = 0.0;
        double average = 0.0;
        Scanner sc = new Scanner(System.in);

        //get exam scores 
        while(score >= 0 && score <= 100)
        {
            System.out.println("Enter exam score: ");

            while (!sc.hasNextDouble())
            {
                System.out.println("Not valid number !\n");
                sc.next();      //will go into infinite loop if omitted
                System.out.print("Please try again. Enter exam score: ");
            }
            score = sc.nextDouble();

            //count and total score 
            if (score >= 0 && score <= 100)
            {
                count = ++count;
                total = total + score;
            }
        }
        average = total / count;

        //display values
        System.out.println("Count: " + count);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        sc.close();     //scanner closed
    }
}
