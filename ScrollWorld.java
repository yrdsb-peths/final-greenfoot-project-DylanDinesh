import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollWorld extends World
{

    /**
     * Constructor for objects of class ScrollWorld.
     * 
     */

    Background bg1 = new Background();
    Background bg2 = new Background();
    
    public ScrollWorld()
    {    
        super(600, 400, 1, false); 

        bg1.setOtherBackground(bg2);
        bg2.setOtherBackground(bg1);

        addObject(bg1, 0, 200);
        addObject(bg2, 1024, 200);
    }

    public void act() {
        if(Greenfoot.mouseClicked(null)){
            bg1.increaseSpeed();
            bg2.increaseSpeed();
        }
    }
}
