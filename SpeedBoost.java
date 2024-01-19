import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * SpeedBoost class is an actor which spawn in at every 5 points earned. 
 * If the player (the turtle) comes in contact the speed boost, 
 * their speed will increase by 1. 
 * This speed increase can be stacked. 
 * 
 * @Dylan Dinesh
 * @Jan 2024
 */
public class SpeedBoost extends Actor
{
    GreenfootImage img = new GreenfootImage("speed.png");
    public int speed = 5;
    public static int sideSpawned; 

    public SpeedBoost()
    {
        img.scale(42, 59);
        setImage(img);  
    }

    /**
     * SpeedBoost moves to the opposite wall it spawned from. 
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();

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

        missedSpeedBoost();
    }

    public void missedSpeedBoost()
    {
        if (isAtEdge()) {
            MyWorld world = (MyWorld) getWorld();
            getWorld().removeObject(world.boost); 
        }
    }
}
