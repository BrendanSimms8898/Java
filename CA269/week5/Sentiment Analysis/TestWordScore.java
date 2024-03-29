import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestWordScore
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word and a review.");
        
        String word = in.next();
        String review = in.nextLine();
        
        WordScore wordScore = new WordScore(word);
        
        if(wordScore.score(review) == -1)
            System.out.println(word + " does not appear in this review.");
        else
            System.out.println(word + " gets a score of " + wordScore.score(review) + ".");
    }
}