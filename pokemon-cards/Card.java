import ecs100.*;
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String name;
    private double value;
    private String image;
    static final String DEFAULT_IMAGE = "blankcard.jpg";

    /**
     * Constructor for objects of class Card
     */
    public Card(String nm, double price, String img)
    {
        // initialise instance variables
        name = nm;
        value = price;
        if (img == null) {
            this.image = DEFAULT_IMAGE;
        } else {
            this.image = img;
        }
    }

    public Card(String nm, double price)
    {
        // initialise instance variables
        this(nm, price, DEFAULT_IMAGE);
    }
    
    public void displayCard() {
        int locX = 100;
        int locY = 100;
        final double WIDTH = 370;
        final double HEIGHT = 500;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

}
