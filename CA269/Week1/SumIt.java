import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");

        // Read in the numbers (you need a nextInt for each integer)
        // :PUT YOUR CODE HERE:

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:

        int num3 = num1 + num2;
        
        // prepare the user for the result
        // print out the result (use System.out.println() )
        // :PUT YOUR CODE HERE:
        System.out.print(num1 + " and " + num2 + " is ");
        System.out.println(num3);
        
    }
}