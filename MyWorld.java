import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main world of this game. This is where the game itself occurs. The player must avoid trash 
 * or else they will lose and try to pick up as much seagrass as possible. 
 * 
 * @Dylan Dinesh
 * @18/01/2024
 */
public class MyWorld extends World
{
    Label scoreLabel;
    public int score;
    Background bg1 = new Background();
    Background bg2 = new Background();
    Seagrass seagrass = new Seagrass();
    Trash trash = new Trash();
    SimpleTimer animationTimer = new SimpleTimer();
    int trashInterval = 100;
    int speedBoostInterval;
    public boolean lose = false;

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
        spawnTrash();

        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 35);

    }

    public void act()
    {
        if (lose == true)
        {
            // EndScreen end = new EndScreen();
            ///Greenfoot.setWorld(end);
            Label gameOver = new Label("GAME OVER", 40);
            addObject(gameOver,300,344);
            Label  scoreLabel = new Label(score, 20);
            addObject(scoreLabel,300,344);
            removeObject(seagrass);
        }
    }

    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if (score % 10 == 0)
        {
            Trash.speed++;
        }
    }

    public void spawnSeagrass()
    {

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

    public void spawnTrash()
    {
        int random = Greenfoot.getRandomNumber(3);

        // Top Side 
        if (random == 0)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(trash, x, y);

            Trash.sideSpawned = 0;
        }

        // Bottom Side
        if (random == 1)
        {
            int x = Greenfoot.getRandomNumber(600);
            int y = 400;
            addObject(trash, x, y);

            Trash.sideSpawned = 1;
        }

        // Right Side
        if (random == 2)
        {
            int x = 600;
            int y = Greenfoot.getRandomNumber(400);
            addObject(trash, x, y);

            Trash.sideSpawned = 2;
        }

        // Left Side
        if (random == 3)
        {
            int x = 0;
            int y = Greenfoot.getRandomNumber(400);
            addObject(trash, x, y);

            Trash.sideSpawned = 3;
        }
    }

}
