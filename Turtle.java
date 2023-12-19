import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    GreenfootImage[] img = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Turtle() 
    {
        for (int i = 0; i < img.length; i++)
        {
            img[i] = new GreenfootImage("tile02" + i + ".png");
            img[i].scale(150, 86);
            img[i].mirrorHorizontally();
            setImage(img[i]);            
        }
        
    }

    public void act()
    {
        setLocation(getX(), getY());
        animateTurtle();
    }
    int imageIndex = 0; 
    public void animateTurtle()
    {
        if (animationTimer.millisElapsed() < 100)
        {
            return;
        }


        setImage(img[imageIndex]);
        imageIndex = ((imageIndex + 1) % img.length);
        animationTimer.mark();
    }
}
