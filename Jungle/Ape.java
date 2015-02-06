import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Ape extends Actor {
    boolean touching = false;
    public void act() 
    {
       moveAround();
       removeBanana(); 
       removeSnake();   
    }
    /**
     * Moves the ape once the ape is tagged by the monkey. Moves the ape randomly.
     */
    public void moveAround() {
        Actor monkey = getOneObjectAtOffset(0, 0, Monkey.class);
        if (monkey != null) {
            touching = true;
            turnTransparent(); 
        } 
        if (touching == true) {
            move(15);
            if (Greenfoot.getRandomNumber(100) < 10) {
                turn(Greenfoot.getRandomNumber(90) - 45);
            } 
            if (getX() <= 5 || getX() >= getWorld().getWidth() - 5) {
                turn(180);
            }
            if (getY() <= 5 || getY() >= getWorld().getHeight() - 5) {
                turn(180);
            }    
        }
    }
    /**
     *Removes the banana when the ape touches it. Calls the method to change the score. 
     */
    public void removeBanana() {
        Actor banana = getOneObjectAtOffset(0, 0, Banana.class);
        if (banana != null) {
            World world;
            world = getWorld();
            world.removeObject(banana);  
            changeScore();
        }  
    }
    /**
     * Removes the snake when the ape touches it. 
     */
    public void removeSnake() {
        Actor snake = getOneObjectAtOffset(0, 0, Snake.class);
        if (snake != null && touching == true) {
            World world;
            world = getWorld();
            world.removeObject(snake);
        } 
    }  
    /**
     * Turns the ape's white frame transparent.
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
     * Adds one to the score.
     */
    public void changeScore() {
       ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
    }    
}
