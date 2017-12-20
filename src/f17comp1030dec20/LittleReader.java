package f17comp1030dec20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jwright
 */
public class LittleReader {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a text file name (with extension) and I will display it to you: ");
        String fileName = keyboard.nextLine();
        
        displayFile(fileName);
    }
    
    /**
     * This method will display the contents of a file to the screen
     */
    public static void displayFile(String fileName)
    {
        File file = new File(fileName);
        try {
            Scanner fileReader = new Scanner(file);
            
            //loop over the contents of the file and display them
            while (fileReader.hasNext())
            {
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LittleReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
