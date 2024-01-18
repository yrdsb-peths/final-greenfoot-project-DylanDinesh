import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The trash class is for the trash actor which is the object that the player must dodge throughout. The trashs' speed increases over time. 
 * 
 * @Dylan Dinesh
 * @Jan 2024
 */
public class Trash extends Actor
{
    GreenfootImage img = new GreenfootImage("trash.png");
    public static int speed = 1;
    public static int sideSpawned; 

    public Trash()
    {
        img.scale(42, 59);
        setImage(img);  
    }

    /**
     * Trash moves to the opposite wall it spawned from. 
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

        missedTrash();
    }

    /**
     * Any trashed that missed is respawned. 
     */
    public void missedTrash()
    {
        if (isAtEdge()) {
            MyWorld world = (MyWorld) getWorld();
            getWorld().removeObject(world.trash);
            world.spawnTrash();
        }
    }

}
