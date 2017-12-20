package f17comp1030dec20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class F17COMP1030Dec20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int userInput=0;
        
        for (int i=0; i<numbers.length;i++)
        {
            do{
                //prompt the user for a number > 0
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter a number >0: ");
                try{
                    userInput = keyboard.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Lay off the eggnog and enter a #!!");
                    userInput = -1;
                }

            }while (userInput < 0);
            numbers[i]=userInput;
        }
        displayArray(numbers);
    }
    
    public static void displayArray(int[] array)
    {
        System.out.print("[");
        for (int index=0; index<array.length; index++)
            System.out.printf("%d%s ", array[index],(index<4)?", ":"]\n");
    }
    
}
