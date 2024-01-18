import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seagrass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seagrass extends Actor
{
    GreenfootImage img = new GreenfootImage("seagrass.png");
    int speed = 4;
    public static int sideSpawned; 

    public Seagrass()
    {
        img.scale(52, 74);
        setImage(img);  
    }

    public void act()
    {
        // Top Side
        if (sideSpawned == 0) 
        {
            int x = getX();
            int y = getY() + speed;
            setLocation(x, y);

        }

        // Bottom Side
        if (sideSpawned == 1) 
        {
            int x = getX();
            int y = getY() - speed;
            setLocation(x, y);
        }

        // Right Side
        if (sideSpawned == 2) 
        {
            int x = getX() - speed;
            int y = getY();
            setLocation(x, y); 
        }

        // Left Side
        if (sideSpawned == 3) 
        {
            int x = getX() + speed;
            int y = getY();
            setLocation(x, y); 
        }

        missedSeagrass();
    }

    public void missedSeagrass()
    {
        if (isAtEdge()) {
            MyWorld world = (MyWorld) getWorld();
            getWorld().removeObject(world.seagrass);
            world.spawnSeagrass(); 
        }
    }
}
