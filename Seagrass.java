import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is what the player as the turtle has to pick up and eat for points. 
 * 
 * @Dylan Dinesh
 * @Jan 2024
 */
public class Seagrass extends Actor
{
    GreenfootImage img = new GreenfootImage("seagrass.png");
    int speed = 4;
    public static int sideSpawned; 

    public Seagrass()
    {
        img.scale(42, 59);
        setImage(img);  
    }

    /**
     * Contains the missed seagrass code as well as makes the seagrass go to the opposite wall it spawned from. 
     */
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
        else if (sideSpawned == 1) 
        {
            int x = getX();
            int y = getY() - speed;
            setLocation(x, y);
        }

        // Right Side
        else if (sideSpawned == 2) 
        {
            int x = getX() - speed;
            int y = getY();
            setLocation(x, y); 
        }

        // Left Side
        else if (sideSpawned == 3) 
        {
            int x = getX() + speed;
            int y = getY();
            setLocation(x, y); 
        }

        missedSeagrass();
    }

    /**
     * When the seagrass is at the edge of the world, d. it is respawned in another random location on the border of the world.
     */
    public void missedSeagrass()
    {
        if (isAtEdge()) {
            MyWorld world = (MyWorld) getWorld();
            getWorld().removeObject(world.seagrass);
            world.spawnSeagrass(); 
        }
    }
}
