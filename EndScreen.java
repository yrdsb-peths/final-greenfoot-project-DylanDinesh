import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    Label scoreLabel;
    Label gameOver;
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        gameOver = new Label("GAME OVER", 40);
        addObject(gameOver,300,344);
      //  scoreLabel = new Label(world.score, 20);
        addObject(scoreLabel,300,344);
    }
}
