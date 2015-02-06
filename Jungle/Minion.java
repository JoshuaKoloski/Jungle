import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Minion extends Actor
{
    public void act() {
        move(3);
        turn(2);
        removeMonkey();
        removeApe();
        stopGame(); 
        turnTransparent2();
    }
    /**
     * Removes the monkey when the minion contacts it.
     */
    public void removeMonkey() {
        Actor monkey = getOneObjectAtOffset(0, 0, Monkey.class);
        if (monkey != null) {
            World world = getWorld();
            Greenfoot.playSound("eating.wav");
            world.removeObject(monkey);
        }    
    } 
    /**
     * Removes the ape when the minion contacts it.
     */
    public void removeApe() {
        Actor ape = getOneObjectAtOffset(0, 0, Ape.class);
        if (ape != null) {
            World world = getWorld();
            world.removeObject(ape);
        } 
    }
    /**
     * Stops the game when no monkeys remain in play.
     */
    public void stopGame() {
        if (getWorld().getObjects(Monkey.class).isEmpty()) {
            Greenfoot.setWorld(new Loser());
            Greenfoot.stop();
            
        } 
    } 
    /**
     * Turns the minion's white frame transparent.
     */
   public void turnTransparent2()
    {
        int range = 50; //Should be in the range 0-255.
        GreenfootImage img = getImage();
        Color transparent = new Color(0, 0, 0, 0);
        for(int x = 0; x < img.getWidth(); x++)
        {
            for(int y = 0; y < img.getHeight(); y++)
            {
                Color color = img.getColorAt(x, y);
                if(color.getRed()   > 255 - range
                && color.getGreen() > 255 - range
                && color.getBlue()  > 255 - range)
                    img.setColorAt(x, y, transparent);
            }
        }
    }
  
}
