import java.util.ArrayList;
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args)
    {
        Card bruh = new Card(2, 0);
        Card bruh2 = new Card(14, 3);
        //System.out.println(bruh);
        //System.out.println(bruh2);
        //Card bruh3 = new Card(15, 3);
        //Card bruh4 = new Card(14, 5);
        Hand hand1 = new Hand();
        hand1.addCard(bruh);
        hand1.addCard(bruh2);
        //System.out.println(handy);
        Deck deck1 = new Deck();
        System.out.println(deck1);
        deck1.shuffle();
        System.out.println(deck1);
        deck1.dealCard();
        System.out.println(deck1);
    }
}
