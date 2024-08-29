
/**
 * Write a description of class Card here.
 *
 * @author Andrew Ortiz
 * @version 4/7/2021
 */
public class Card
{
    // instance variables 
    private final int rank;
    private final int suit;

    /**
     * Constructor for objects of class Card
     */
    public Card(int rank, int suit)
    {
        // initialise instance variables based on acceptable values
        if (rank < 2 || rank > 14)
        {
            System.out.println("This is not a valid rank.");
            System.exit(0);
        }
        this.rank = rank;
        if(suit < 0 || suit > 3)
        {
            System.out.println("This is not a valid suit.");
            System.exit(0);
        }
        this.suit = suit;
    }

    public String toString()
    {
        // char variables to add the suit of the card and add a letter if its a face card
        char face = ' ';
        char out = ' ';
        
        if(rank == 11)
        {
            face = 'J';
        }
        if(rank == 12)
        {
            face = 'Q';
        }
        if(rank == 13)
        {
            face = 'K';
        }
        if(rank == 14)
        {
            face = 'A';
        }
        if(suit == 0)
        {
            out = '\u2663';
        }
        if(suit == 1)
        {
            out = '\u2662';
        }
        if(suit == 2)
        {
            out = '\u2661';
        }
        if(suit == 3)
        {
            out = '\u2660';
        }
        if(rank > 10)
        {
            return " " + face + out;
        }else 
        {
            return String.format("%2d", rank) + out;
        }
    }
}
