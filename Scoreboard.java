import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class contains an image of the scoreboard used in the 
 * game over scene.
 * 
 * @Dylan Dinesh
 * @Jan 2024
 */
public class Scoreboard extends Actor
{

    /**
     * Resize scoreboard image. 
     */
    public Scoreboard()
    {
        GreenfootImage img = new GreenfootImage("scoreboard.png"); 
        img.scale(240, 270);
        setImage(img);
    }

    public void act()
    {

    }
}
