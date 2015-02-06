import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Monkey extends Actor {
    public static final int EAT_BANANA = 2;
    public static final int WIN_GAME = 1;
    public static int count = 0;
    public void act() { 
        removeBanana();
        moveAround();
        stopGame();
    }
    /**
     * Removes a banana if the monkey is touching it. Calls methods to change the score and 
     * make the monkey's white frame trandparent. 
     */
    public void removeBanana() {
        Actor banana = getOneObjectAtOffset(0, 0, Banana.class);
        if (banana != null) {
            World world = getWorld();
            Greenfoot.playSound("eating.wav");
            changeScore(EAT_BANANA);
            world.removeObject(banana);
            turnTransparent(); 
        } 
    } 
    /**
     * Moves monkey in response to the arrows. Left and right rotate the monkey accordingly while up 
     * and down actually move it (up moves the monkey in the direction it is facing and down moves the 
     * monkey opposite the direction it is facing).
     */
    public void moveAround() {
           if (Greenfoot.isKeyDown("up")) {
               move (5);
           } else if (Greenfoot.isKeyDown("down")) {
               move (-5);
           } else if (Greenfoot.isKeyDown("right")) {
               turn(5);
           } else if (Greenfoot.isKeyDown("left")) {
               turn(-5);
           }   
    }
    /**
     * Stops the game if no monkeys remain in play and calls a method to change the score. 
     */
    public void stopGame() { 
        if (getWorld().getObjects(Banana.class).isEmpty() && count == 5) {
            Greenfoot.setWorld(new Winner());
            Greenfoot.stop();            
        } else if (getWorld().getObjects(Banana.class).isEmpty()) { 
            changeScore(WIN_GAME);
            count++;
        }   
    } 
    /**
     * Makes the monkey's white frame transparent.
     */
    public void turnTransparent() {
        GreenfootImage img = getImage();
        Color transparent = new Color(0, 0, 0, 0);
        for(int x = 0; x < img.getWidth(); x++) {       
           for(int y = 0; y < img.getHeight(); y++) {        
              if(img.getColorAt(x, y).equals(Color.WHITE)) {
                 img.setColorAt(x, y, transparent);
              }
           }
        }
    }
    /**
     * Adds two to the score if the monkey eats a banana (except for the last banana). 
     * Adds five to the score if no bananas remain in play. 
     */
    public void changeScore(int x) {
        ((Counter) getWorld().getObjects(Counter.class).get(0)).add(x);
    }    
}
