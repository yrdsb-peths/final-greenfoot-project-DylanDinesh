import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    GreenfootSound gameOverMusic = new GreenfootSound("lose.mp3");
    
    public EndScreen(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("gameover.jpg");
        gameOverMusic.play();
        Label gameOver = new Label("GAME OVER", 40);
        addObject(gameOver,300,344);
        Label  finalScore = new Label("Final Score is: " + score, 40);
        addObject(finalScore,300,250);
        Label spaceToRetry = new Label("Press Space to retry....", 40);
        addObject(spaceToRetry,300,300);    
        if (Greenfoot.isKeyDown("space")) {
            gameOverMusic.pause();
            Trash.speed = 1;
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
