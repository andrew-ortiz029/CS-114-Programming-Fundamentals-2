import java.util.ArrayList;
/**
 * Creates and alters hands for a card game.
 *
 * @author Andrew Ortiz
 * @version 4/9/2021
 */
public class Hand
{
    // instance variables
    private ArrayList<Card> cards;

    /**
     * Constructor for objects of class Hand
     */
    public Hand()
    {
        // initialise instance variables
        cards = new ArrayList<>();
    }

    /**
     * adds cards to hand
     *
     * @param  takes a card for parameter to add to the ArrayList
     * 
     */
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    public String toString()
    {
        return cards.toString();
    }
}
