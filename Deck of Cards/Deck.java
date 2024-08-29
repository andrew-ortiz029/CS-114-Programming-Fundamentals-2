import java.util.ArrayList;
import java.util.Random;
/**
 * Creates and shuffles a deck of cards for my program to run off of.
 *
 * @author Andrew Ortiz
 * @version 4/9/2021
 */
public class Deck
{
    // instance variables 
    private ArrayList<Card> cards;
    public static final int CARDS_PER_LINE = 13;
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // adds all cards for each suit using 4 for loops
        cards = new ArrayList<>();
        for(int i = 2; i <= 14; i++)
        {
            Card temp = new Card(i, 0);
            cards.add(temp);
        }
        for(int i = 2; i <= 14; i++)
        {
            Card temp = new Card(i, 1);
            cards.add(temp);
        }
        for(int i = 2; i <= 14; i++)
        {
            Card temp = new Card(i, 2);
            cards.add(temp);
        }
        for(int i = 2; i <= 14; i++)
        {
            Card temp = new Card(i, 3);
            cards.add(temp);
        }
    }

    /**
     * shuffles all the cards in the deck using a javas random class
     */
    public void shuffle()
    {
        //Creates a Random object 
        Random r = new Random();
        // Temp ArrayList
        ArrayList<Card> temp = new ArrayList<>();

        // Iterates randomly through the ArrayList and adds it to the temp
        while (cards.size() > 0)
        {
            temp.add(cards.remove(r.nextInt(cards.size())));
        }
        // sets original ArrayList = to temp
        cards = temp;
    }
    /**
     * Deals and removes a card from the deck based on the condition that there is cards in the deck.
     */
    public Card dealCard()
    {
        if(cards.size() <= 0)
        {
            System.out.println("The deck is out of cards.");
            System.exit(0);
        }
        Card temp = cards.get(0);
        cards.remove(0);
        return temp;
    }
    
    public String toString()
    {
        String out = "";
        //counter cause not using a for loop
        int count = 0;
        for (Card card : cards) {
            out += card.toString() + " ";
            ++count;
            // keeps it to 13 cards a line using modulous
            if (count % CARDS_PER_LINE == 0)
                out += '\n';
        }

        return out;
    }
}
//original toString() doens't work because i wrote it with the deck never changing in mind
/*String out = "";
        int temp = 0;
        for(int i = 0; i <= 3; i++)
        {
            for(int f = 0; f <= 12; f++)
            {
                out += cards.get((temp));
                out += " ";
                temp++;
            }
            out += '\n';
        } 
        return out;
*/
