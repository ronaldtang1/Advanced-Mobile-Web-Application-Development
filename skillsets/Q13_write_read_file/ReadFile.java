import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        System.out.println("Developer: Ronald Tang");
        System.out.println("Progam read enter file info and prints it to the screen.\n");

        String file = "myFile.txt";
        String line = null;

        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + file + "'");
        }
        catch (IOException ex) {
            System.out.println("Error reading file '" + file + "'");
        }
    }//end main
}//end class