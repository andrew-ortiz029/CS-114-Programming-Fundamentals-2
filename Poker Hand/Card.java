
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
    private final int CLUBS = 0;
    private final int DIAMONDS = 1;
    private final int HEARTS = 2;
    private final int SPADES = 3;

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
        if(suit < CLUBS || suit > SPADES)
        {
            System.out.println("This is not a valid suit.");
            System.exit(0);
        }
        this.suit = suit;
    }
    
    //returns the rank of the card
    public int getRank()
    {
       return rank; 
    }
    
    public int getSuit()
    {
       return suit;
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
        if(suit == CLUBS)
        {
            out = '\u2663';
        }
        if(suit == DIAMONDS)
        {
            out = '\u2662';
        }
        if(suit == HEARTS)
        {
            out = '\u2661';
        }
        if(suit == SPADES)
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

