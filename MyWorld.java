import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    Label scoreLabel;
    public int score;
    Background bg1 = new Background();
    Background bg2 = new Background();
    Seagrass seagrass = new Seagrass();
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        bg1.setOtherBackground(bg2);
        bg2.setOtherBackground(bg1);

        addObject(bg1, 150, 200);
        addObject(bg2, 1024, 200);

        Turtle turtle = new Turtle();
        addObject(turtle, 300, 300);

        spawnSeagrass();
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 35);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if (score % 5 == 0)
        {
            // level++;
        }
    }
    public void spawnSeagrass()
    {
 
        // seagrass.setSpeed(level);
        int random = Greenfoot.getRandomNumber(3);
        
        // Top Side 
        if (random == 0)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(seagrass, x, y);

            Seagrass.sideSpawned = 0;
        }
        
        // Bottom Side
        if (random == 1)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = 400;
            addObject(seagrass, x, y);

            Seagrass.sideSpawned = 1;
        }
        
        // Right Side
        if (random == 2)
        {
            int x = 600;
            int y = Greenfoot.getRandomNumber(400);
            addObject(seagrass, x, y);

            Seagrass.sideSpawned = 2;
        }
        
        // Left Side
        if (random == 3)
        {
            int x = 0;
            int y = Greenfoot.getRandomNumber(400);
            addObject(seagrass, x, y);

            Seagrass.sideSpawned = 3;
        }
    }
    
}
