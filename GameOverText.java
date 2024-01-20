import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Image fo the text for the game over screen saying "GAME OVER"
 * 
 * @Dylan Dinesh
 * @Jan 2024
 */
public class GameOverText extends Actor
{
    /**
     * Resizes the image
     */
    public GameOverText()
    {
        GreenfootImage img = new GreenfootImage("gameovertext.png"); 
        img.scale(392, 106);
        setImage(img);
    }

    public void act()
    {

    }
}
