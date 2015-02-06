import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Loser extends World {
    public Loser()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        displayScore();
    }
     /**
     * Displays the score on the world.
     */
    public void displayScore() {
        addText("Score = " + Counter.value, 30, getWidth()/2, getHeight()/2);
    }     
    /**
     * Sets the size and color of the text.
     */
    public void addText(String text, int textSize, int x, int y) {
        Color textColor = Color.YELLOW,
        bgColor = new Color(0, 0, 0, 0);
        GreenfootImage theText = new GreenfootImage(text, textSize, textColor, bgColor);
        getBackground().drawImage(theText, x - (theText.getWidth()/2), y);
    }   
    /**
     * Inserts a banana in the world.
     */
    public void addBananas() {
        Banana banana = new Banana();
        addObject(banana, 250, 360); 
    }     
}
