import ecs100.*;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    // instance variables - replace the example below with your own
    private Cards collection;
    private Card card;

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        collection = new Cards();
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        UI.addButton("Add", this::addCard);
        UI.addButton("Find", this::findCard);
        UI.addButton("Hide", this::hide);
        UI.addButton("Print all", collection::printAll);
    }
    
    public void addCard() {
        double value;
        String name = UI.askString("Pokemon name: ");
        do {
            value = UI.askDouble("Value of card: ");
            if (value <= 0) {
                UI.println("Must be above 0!");
            } 
        } while(0 >= value);
        String imgFileName = UIFileChooser.open("Choose image file: ");
        
        this.collection.addCard(name, value, imgFileName);
    }
    public void findCard(){
        String cardName = UI.askString("Name of card: ");
        if(this.collection.findCard(cardName.toLowerCase().trim())){ // Refer back to collection instance collection method findCard to return true or false
            UI.println("Found Card!");
            
            this.card = collection.getCard(); 
            this.card.displayCard();
            UI.println("Value: " + this.card.getValue());
            
        }
        else{
            UI.println("That card does not exist!");
        }
    }
    
    public void hide() {
        UI.clearText();
        UI.clearGraphics();
    }
    
    /**
     * main routine
     */
    public static void main(String[] args) {
        new GUI();
    }
}

