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
    public Hand(Card first, Card second, Card third, Card fourth, Card fifth)
    {
        // initialise instance variable
        cards = new ArrayList<>();
        cards.add(first);
        cards.add(second);
        cards.add(third);
        cards.add(fourth);
        cards.add(fifth);
        
        //checking for duplicate cards
        duplicate();
    }
    
    /**
     * compares all cards from the arraylist to see if there's a duplicate
     */
    public void duplicate()
    {
          //simple nested loop to compare the hand.
          for (int i = 0; i < cards.size() - 1; i++) 
          {
              for (int j = i + 1; j < cards.size(); j++) 
              {
                  if (cards.get(i).getSuit() == cards.get(j).getSuit() && cards.get(i).getRank() == cards.get(j).getRank()) 
                  {
                      System.out.println ("Invalid hand!");
                      System.exit(0);
                  }
              }
          }
    }
    
    /**
     * adds cards to hand
     *
     * @param  takes a card for parameter to add to the ArrayList
     */
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    /**
     * gets and returns a card from the arraylist
     *
     * @param  index of desired card 
     * @return    card at index i
     */
    public Card getCard(int i)
    {
        return cards.get(i);
    }
    
    public String toString()
    {
        return cards.toString();
    }
    
    /**
     * checks to see if the current hand is a flush
     *
     * @return    true or false based on conditions
     */
    public boolean flush()
    {
        //check suits
        for (int i = 0; i <= 3; i++)
        {
            if(cards.get(i).getSuit() != cards.get(i+1).getSuit())
            {
                return false;
            } 
        }
        return true;
    }
    
    /**
     * checks to see if the current hand is a straight flush
     *
     * @return    true or false based on conditions
     */
    public boolean straightFlush()
    {
        //create the CountRank
        CountRank check = new CountRank(this);
        
        //get min and max of hand for straights
        int min = cards.get(0).getRank();
        int max = cards.get(0).getRank();
        
        for(int i = 0; i <= 4; i++)
        {
             if (cards.get(i).getRank() > max)
             {
                 max = cards.get(i).getRank();
             }
             if (cards.get(i).getRank() < min)
             {
                 min = cards.get(i).getRank();
             }
        }
        
        //check suits
        for (int i = 0; i <= 3; i++)
        {
            if(cards.get(i).getSuit() != cards.get(i+1).getSuit())
            {
                return false;
            } 
        }
        
        //final returns
        if (check.straight(min, max))
        {
            return true;
        }
        return false;
    }
    
    /**
     * checks to see if the current hand is a royal flush
     *
     * @return    true or false based on conditions
     */
    public boolean royalFlush()
    {
        //create the CountRank
        CountRank check = new CountRank(this);
        
        //get min and max of hand for straights
        int min = cards.get(0).getRank();
        int max = cards.get(0).getRank();
        
        for(int i = 0; i <= 4; i++)
        {
             if (cards.get(i).getRank() > max)
             {
                 max = cards.get(i).getRank();
             }
             if (cards.get(i).getRank() < min)
             {
                 min = cards.get(i).getRank();
             }
        }
        
        //check ranks to make sure they are face cards
        if (min != 10 || max != 14)
        {
            return false;
        }
        
        //check suits
        for (int i = 0; i <= 3; i++)
        {
            if(cards.get(i).getSuit() != cards.get(i+1).getSuit())
            {
                return false;
            } 
        }
        
        //final returns
        if (check.straight(min, max))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Categorizes hand 
     *
     * @return    returns the type of hand dealt
     */
    public String toCategory()
    {
        //create the CountRank
        CountRank check = new CountRank(this);
        
        //default string will be returned as nothing for no pair
        String category = "";
        
        //get min and max of hand for straights
        int min = cards.get(0).getRank();
        int max = cards.get(0).getRank();
        
        for(int i = 0; i <= 4; i++)
        {
             if (cards.get(i).getRank() > max)
             {
                 max = cards.get(i).getRank();
             }
             if (cards.get(i).getRank() < min)
             {
                 min = cards.get(i).getRank();
             }
        }
        
        //check highest value hand to low because straights will be considered straights regardless of suits.
        if (royalFlush())
        {
            category = "Royal flush";
        }
        
        //straight flush
        else if(straightFlush())
        {
            category = "Straight Flush";
        }
        
        //four of a kind
        else if (check.fourOfAKind())
        {
            category = "Four of a kind";
        }
        
        //full house
        else if(check.fullHouse())
        {
            category = "Full house";
        }
        
        //flush
        else if(flush())
        {
            category = "Flush";
        }
        
        //straight 
        else if(check.straight(min, max))
        {
            category = "Straight";
        }
        
        //three of a kind
        else if(check.threeOfAKind())
        {
            category = "Three of a kind";
        }
        
        //three of a kind
        else if(check.threeOfAKind())
        {
            category = "Three of a kind";
        }
        
        //two pair
        else if(check.twoPair())
        {
            category = "Two Pair";
        }
        
        //one pair
        else if(check.onePair())
        {
            category = "One Pair";
        }
       
        //return string
        return category;
    }
}
