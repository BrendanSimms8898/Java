import java.util.Scanner;

import javax.print.event.PrintEvent;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        
        // Use the length() method of the String class.
        System.out.println("Hello " + name + ", your name has " + name.length() + " letters.");
    }
}