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
    boolean go = false;
    public void act()
    {
        setLocation(getX(), getY());
        animateTurtle();
        eat();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            //use this to get the x position of the mouse.
            int x = mouse.getX();
            //use this to get the y position of the mouse.
            int y = mouse.getY();
            int turtleX = getX();
            int turtleY = getY();
            if (Math.abs(turtleX - x) > 2 && Math.abs(turtleY - y) > 2) 
            {
                turnTowards(x, y);
                move(7);    
            }

        }

       
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

    public void eat()
    {
        if (isTouching(Seagrass.class))
        {
            removeTouching(Seagrass.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnSeagrass();
            world.increaseScore();

        }
    }

}
