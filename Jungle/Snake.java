import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Snake extends Actor {
    public static final int BITE_MONKEY = -2;
    public int score = 0; 
    public void act() {
       moveAround();
       multiplyBananas(); 
       turnTransparent();
    } 
    /**
     * moveAround- moves the snake in random patterns.
     */
    public void moveAround() {
        move(2);
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
    /**
     * Multiplies the amount of bananas on screen when the snake bites the monkey. The amount of bananas 
     * added to the game depends on how long the snake bites the monkey for. At most, three bananas will 
     * be added. 
     */
    public void multiplyBananas() {
        Actor monkey = getOneObjectAtOffset(0, 0, Monkey.class);    
        if (monkey!= null && score < 3) {
            score++;
            World world = getWorld();
            Banana banana = new Banana();
            world.addObject(banana, Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
            if (score == 3) {
               lowerScore();
               world.removeObject(this);
            }    
        } 
    }
    /**
     * Turns the actor's white fame transparent.
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
     * Lower's the score by 2.
     */
    public void lowerScore() {
        ((Counter) getWorld().getObjects(Counter.class).get(0)).add(BITE_MONKEY);
    }        
}
