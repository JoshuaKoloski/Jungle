import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Banana extends Actor {
    public void act() {
        turnTransparent(); 
        Actor banana;
        banana = getOneObjectAtOffset(0, 0, Banana.class);
        if (banana != null) {   
            World world = getWorld();
            world.removeObject(banana);
            turnTransparent();    
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
}    
    
