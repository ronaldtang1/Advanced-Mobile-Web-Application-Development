import java.util.Scanner;
import java.io.*;


public class WriteFile{

    public static void main (final String args[]) throws Exception {
        // Scanner scnr = new Scanner(System.in);
        System.out.println("Developer: Ronald Tang");
        System.out.println("Progam captures info and writes it to file.");

        String file = "myFile.txt";

        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Fourscore and seven years ago our fathers brought forth, ");
            bw.newLine();
            bw.write("on this continent, a new nation, conceived in liberty");
            bw.newLine();
            bw.write("and dedicated to the proposition that all men are created equal.");
            bw.close();

            System.out.println("\nFile write finished!");
        }
        catch (IOException e){
            System.out.println("Error writing to file '" + file + "'");
        }
    } // end of MAIN
}