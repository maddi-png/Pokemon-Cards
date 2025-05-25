import java.util.HashMap;
import java.util.Scanner;
import ecs100.*;
/**
 * Write a description of class Cards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cards {
    // instance variables - replace the example below with your own
    private HashMap < Integer, Card > collection;
    private int currCardId;
    private Card currCard;
    private Scanner scanner;

    /**
     * Constructor for objects of class Cards
     */
    public Cards() {
        // initialise instance variables
        collection = new HashMap < Integer, Card > ();
        scanner = new Scanner(System.in);

        // add initial cards
        Card card1 = new Card("Pikachu", 0.50, "card images/pikachu.png");
        Card card2 = new Card("Budew", 1.75, "card images/budew.png");
        this.collection.put(1, card1);
        this.collection.put(2, card2);
        this.currCardId = 2;
    }

    public void setCardId() {
        this.currCardId += 1;
    }

    public void addCard(String name, double value) {
        this.setCardId();
        this.collection.put(this.currCardId, new Card(name, value));
    }
    
    public void addCard(String name, double value, String image) {
        this.setCardId();
        this.collection.put(this.currCardId, new Card(name, value, image));
    }

    public Card getCard() {
        return this.currCard;
    }

    public boolean findCard(String name) {
        for (int cardId: this.collection.keySet()) {
            if (this.collection.get(cardId).getName().toLowerCase().trim().equals(name.toLowerCase())) {
                this.currCard = this.collection.get(cardId); // set current card to found card
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        // traverses map
        for (int cardId: this.collection.keySet()) {
            UI.println(cardId + " Details: ");
            UI.println(this.collection.get(cardId).getName() + " $" +
                this.collection.get(cardId).getValue());
            UI.println();
        }
    }
    
    public static void main(String[] args) {
        new GUI();
    }
}