import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jungle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jungle extends World
{

    /**
     * Constructor for objects of class Jungle.
     * 
     */
    public Jungle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Banana banana = new Banana();
        addObject(banana, 132, 146);
        Banana banana2 = new Banana();
        addObject(banana2, 136, 393);
        Banana banana3 = new Banana();
        addObject(banana3, 400, 151);
        Banana banana4 = new Banana();
        addObject(banana4, 395, 417);
        Banana banana5 = new Banana();
        addObject(banana5, 268, 127);
        Banana banana6 = new Banana();
        addObject(banana6, 260, 365);
        banana.setLocation(105, 120);
        banana2.setLocation(96, 421);
        banana3.setLocation(391, 124);
        banana4.setLocation(397, 417);
        banana2.setLocation(103, 412);
        banana6.setLocation(251, 382);
        banana5.setLocation(249, 95);
        Minion minion = new Minion();
        addObject(minion, 111, 64);
        minion.setLocation(106, 64);
        Minion minion2 = new Minion();
        addObject(minion2, 397, 65);
        Minion minion3 = new Minion();
        addObject(minion3, 257, 42);
        Minion minion4 = new Minion();
        addObject(minion4, 255, 326);
        Minion minion5 = new Minion();
        addObject(minion5, 115, 350);
        Minion minion6 = new Minion();
        addObject(minion6, 406, 348);
        minion3.setLocation(248, 41);
        minion4.setLocation(251, 326);
        minion5.setLocation(106, 352);
        minion6.setLocation(397, 354);
        minion4.setLocation(250, 322);
        minion5.setLocation(106, 349);
        minion.setLocation(106, 62);
        banana.setLocation(101, 126);
        banana3.setLocation(397, 127);
        banana5.setLocation(250, 95);
        minion2.setLocation(394, 67);
        minion3.setLocation(250, 41);
        banana5.setLocation(251, 103);
        banana6.setLocation(251, 388);
        minion4.setLocation(250, 329);
        Ape ape = new Ape();
        addObject(ape, 107, 193);
        Ape ape2 = new Ape();
        addObject(ape2, 261, 157);
        Ape ape3 = new Ape();
        addObject(ape3, 403, 199);
        Ape ape4 = new Ape();
        addObject(ape4, 264, 449);
        Ape ape5 = new Ape();
        addObject(ape5, 116, 466);
        Ape ape6 = new Ape();
        addObject(ape6, 409, 478);
        ape2.setLocation(252, 151);
        ape.setLocation(101, 175);
        ape5.setLocation(106, 459);
        ape4.setLocation(254, 435);
        ape6.setLocation(400, 465);
        Snake snake = new Snake();
        addObject(snake, 490, 18);
        Snake snake2 = new Snake();
        addObject(snake2, 25, 18);
        Snake snake3 = new Snake();
        addObject(snake3, 20, 269);
        Snake snake4 = new Snake();
        addObject(snake4, 478, 272);
        Snake snake5 = new Snake();
        addObject(snake5, 482, 467);
        Snake snake6 = new Snake();
        addObject(snake6, 18, 491);
        snake2.setLocation(17, 11);
        snake3.setLocation(16, 263);
        snake6.setLocation(14, 490);
        snake6.setLocation(17, 489);
        snake5.setLocation(484, 488);
        snake4.setLocation(483, 268);
        snake.setLocation(485, 11);
        Monkey monkey = new Monkey();
        addObject(monkey, 256, 246);
        monkey.setLocation(251, 246);
        Counter counter = new Counter();
        addObject(counter, 264, 490);
        counter.setLocation(257, 488);
    }
}
