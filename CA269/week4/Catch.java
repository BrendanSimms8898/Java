public class Catch
{
   public static void main(String [] args)
   {
       try
       {
            Broken broke = new Broken();

            System.out.println("Testing");
            broke.cracked();
        }
        catch(Exception ArrayIndexOutOfBoundsException)
        {
            System.out.println("Caught the exception.");
        }
   }
}