
/**
 * Puts the amount of ranks in a hand into an array and has methods to determine to determine what kind of a hand it is 
 *
 * @author Andrew Ortiz
 * @version 4/30/21
 */
public class CountRank
{
    // instance variables - replace the example below with your own
    private int rankCount[] = new int[15];

    /**
     * Constructor for objects of class CountRank
     */
    public CountRank(Hand h)
    {
        // temp to get the rank of the current card
        int temp = 0;
        
        // add the amount of ranks to the array
        for (int i = 0; i <= 4; i++)
        {
            temp = h.getCard(i).getRank();
            rankCount[temp] = rankCount[temp] + 1;
        }
    }

     /**
     * Checks the rank array for one pair
     * @returns true if there's ONE pair
     */
    public boolean onePair()
    {
        // pair counter 
        int pairs = 0;
        int three = 0;
        
        // iterate through the array
        for(int i = 2; i <= 14; i++)
        {
            //check for pair at index
            if(rankCount[i] == 2)
            {
                pairs++;
            }
            if(rankCount[i] == 3)
            {
                three++;
            }
        }
        //return true for ONE pair
        if(pairs == 1 && three == 0)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Checks the rank array for two pairs
     * @return true if there's TWO pairs
     */
    public boolean twoPair()
    {
        // pair coutner
        int pairs = 0;
        
        // iterate through the array
        for(int i = 2; i <= 14; i++)
        {
            //check for pairs
            if(rankCount[i] == 2)
            {
                pairs++;
            }
            //return true for TWO pairs
            if(pairs == 2)
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks the rank array for three of a kind
     * @returns true if there's a three of a kind in the hand
     */
    public boolean threeOfAKind()
    {
        //three coutner 
        int three = 0;
        
        // iterate through the array
        for(int i = 2; i <= 14; i++)
        {
            //check to see if there's a pair and return false if there is because it would be a full house
            if(rankCount[i] == 2)
            {
                return false;
            }
            //check for three
            if(rankCount[i] == 3)
            {
                three++;
            }
        }
        if (three == 1)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Checks the rank array for a straight 
     * @param lowest rank and highest rank of the hand
     * @returns true if there's a straight
     */
    public boolean straight(int min, int max)
    {
        // iterate through the array
        for(int i = min; i <= max; i++)
        {
            //if the current index isn't one then it can't be a straight
            if(rankCount[i] != 1)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Checks the rank array for a three of a kind and a pair
     * @returns true if there's a three of a kind and a pair
     */
    public boolean fullHouse()
    {
        //pair coutners
        int pair = 0;
        int three = 0;
        
        // iterate through the array
        for(int i = 2; i <= 14; i++)
        {
            //check for pair and three
            if(rankCount[i] == 2)
            {
                pair++;
            } else if(rankCount[i] == 3)
            {
                three++;
            }
            //check for full house
            if(pair == 1 && three == 1)
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks the rank array for a four of a kind
     * @returns true if there's a four of a kind
     */
    public boolean fourOfAKind()
    {
        // iterate through the array
        for(int i = 2; i <= 14; i++)
        {
            //check if current index is 4
            if(rankCount[i] == 4)
            {
                return true;
            }
        }
        return false;
    }
}
