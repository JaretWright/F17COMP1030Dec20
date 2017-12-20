package f17comp1030dec20;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class FilesAndDirectories {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a file or directory name: ");
        String fileName = keyboard.nextLine();
        
        analyzeFile(fileName);
    }
    
    public static void analyzeFile(String path)
    {
        File file = new File(path);
        
        if (file.exists())
        {
            System.out.printf("%s %s a directory%n", path, file.isDirectory()?"is":"is not");
            System.out.printf("%s %s a file%n", path, file.isFile()?"is":"is not");
            System.out.printf("%s %s an absolute path%n", path, file.isAbsolute()?"is":"is not");
            System.out.printf("%s was last modified on %d%n", path, file.lastModified());
            System.out.printf("The relative path is: %s%n", path, file.getPath());
            System.out.printf("The absolute path is: %s%n", file.getAbsolutePath());
            
            if (file.isDirectory())
            {
                String[] directory = file.list();
                System.out.println("Directory contents: ");
                
                //super cool, wicked awesome enhanced for loop
                for (String fileName : directory)
                    System.out.println(fileName);
            }
        }
        else
        {
            System.out.printf("\"%s\" does not exist.%n", path);
        }
    }
}
