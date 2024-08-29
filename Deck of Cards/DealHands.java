import java.util.ArrayList;
import java.util.Scanner;
/**
 * DealHands controls and runs my program.
 *
 * @author Andrew Ortiz
 * @version 4/9/2021
 */
public class DealHands
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //create a new deck
        Deck deck1 = new Deck();
        
        //print deck
        System.out.println("A brand new, fresh deck");
        System.out.println(deck1);
        
        //shuffle deck and print
        deck1.shuffle();
        System.out.println("Shuffled");
        System.out.println(deck1);
        
        //Get user intput
        System.out.println("How many players?");
        int numHands = in.nextInt();
        
        //create and print ArrayList hands
        ArrayList<Hand> hands = new ArrayList<>();
        for(int i = 0; i < numHands; i++)
        {
            Hand temp = new Hand();
            for(int f = 0; f < 5; f++)
            {
                temp.addCard(deck1.dealCard());
            }
            hands.add(temp);
        }
        
        //print hands with formatting
        for(int i = 0; i < numHands; i++)
        {
            System.out.println(hands.get(i));   
        }
        
        //print what remains
        System.out.println("\nWhat remains");
        System.out.println(deck1);
        
        //test error trap
        /*Card error1 = new Card(15, 3);
        Card error2 = new Card(14, 5);
        System.out.println(error1);
        System.out.println(error2);*/
        
    }    
}
