import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Collider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collider extends Actor
{
    /**
     * Act - do whatever the Collider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Collider()
    {
        GreenfootImage img = new GreenfootImage("collider.png");
        img.scale(6, 6);
        setImage(img);
    }
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            //use this to get the x position of the mouse.
            int n = mouse.getX();
            //use this to get the y position of the mouse.
            int b = mouse.getY();
            setLocation(5, 5);
        }
        
    }
}