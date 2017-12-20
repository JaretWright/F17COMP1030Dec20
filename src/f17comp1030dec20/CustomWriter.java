package f17comp1030dec20;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class CustomWriter {
    public static void main(String[] args)
    {
        try{
            Formatter outputStream = new Formatter("lastClass.txt");
            boolean keepAsking = true;
            Scanner keyboard = new Scanner(System.in);
            String userInput;
                  
            do{
                System.out.print("Please enter some text (type exit to quit): ");
                userInput = keyboard.nextLine();
                
                if (userInput.equalsIgnoreCase("exit"))
                    keepAsking=false;
                else
                    outputStream.format(userInput + "%n");
                
            } while(keepAsking);
            outputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Sorry we cannot write to lastClass.txt");
        }
      
    }
}
