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
