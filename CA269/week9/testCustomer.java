import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// public class testCustomer
// {
//    public static void main(String [] args)
//    {
//        Movie [] movies = { new Movie("James Bond does Java", Movie.NEW_RELEASE),
//                          new Movie("Mickey Mouse", Movie.CHILDRENS),
//                          new Movie("The Pointer Sisters", Movie.REGULAR),
//                          new Movie("The Dointer Sisters", Movie.NEW_RELEASE),
//                 };
//        Rental [] rentalsArray = { new Rental(movies[0], 3),
//                                     new Rental(movies[1], 10),
//                                     new Rental(movies[2], 2),
//                                     new Rental(movies[3], 1),
//                 };
       
//        List<Rental> rentals = new ArrayList<Rental>(Arrays.asList(rentalsArray));
       
//        Customer donald = new Customer("Donald", rentals);
       
//        System.out.println(donald.getName());
//        System.out.println(donald.getRentals());
//        System.out.println(donald); // test the toString() method.
       
//        System.out.println("\nYour statement:");
//        System.out.print(donald.statement());  // NB "\n" in the statement() function so not in println!
       
//        DummyTester bernie = new DummyTester("Bernie", rentals);
       
//        System.out.println("\nBernie's statement:");
//        System.out.print(bernie.statement());  // NB "\n" in the statement() function so not in println!
//    }
// }

// // A class just to test that the statement method uses the getTotal() method.

// class DummyTester extends Customer
// {
//     public DummyTester(String name, List rentals)
//     {
//         super(name, rentals);
//     }
    
//     // Note that we can only do this if getTotal exists in the parent class (Customer)
//     public int getFrequentRenterPoints(Rental rental)
//     {
//         return super.getFrequentRenterPoints(rental) * 2;  // Just double the rental points!
//     }
// }

public class testCustomer
{
   public static void main(String [] args)
   {
       Movie [] movies = { new Movie("James Bond does Java", Movie.NEW_RELEASE),
                         new Movie("Mickey Mouse", Movie.CHILDRENS),
                         new Movie("The Pointer Sisters", Movie.REGULAR),
                         new Movie("The Dointer Sisters", Movie.NEW_RELEASE),
                };
       Rental [] rentalsArray = { new Rental(movies[0], 3),
                                    new Rental(movies[1], 10),
                                    new Rental(movies[2], 2),
                                    new Rental(movies[3], 1),
                };
       
       List<Rental> rentals = new ArrayList<Rental>(Arrays.asList(rentalsArray));
       
       Customer donald = new Customer("Donald", rentals);
       
       System.out.println(donald.getName());
       System.out.println(donald.getRentals());
       System.out.println(donald); // test the toString() method.
       
       System.out.println("\nYour statement:");
       System.out.print(donald.htmlStatement());
   }
}