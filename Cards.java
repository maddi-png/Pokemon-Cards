import java.util.HashMap;
import java.util.Scanner;
import ecs100.*;
/**
 * Write a description of class Cards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cards
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Card> collection;
    private int currCardId;
    private Card currCard;
    private Scanner scanner;

    /**
     * Constructor for objects of class Cards
     */
    public Cards()
    {
        // initialise instance variables
        collection = new HashMap<Integer, Card>();
        scanner = new Scanner(System.in);
        
        // add initial cards
        Card card1 = new Card("Pikachu", 0.50, "pikachu.png");
        Card card2 = new Card("Budew", 1.75, "budew");
        this.collection.put(1, card1);
        this.collection.put(2, card2);
        this.currCardId = 2;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
