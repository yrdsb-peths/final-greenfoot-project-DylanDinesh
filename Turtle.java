import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the clas for the turtle. This contains the sounds the turtle gets for eatnig seagrass, what happens when the turtle collides with other 
 * actors, as well as the turtle animation and movement. 
 * 
 * @Dylan Dinesh 
 * @Jan 2024 
 */
public class Turtle extends Actor
{
    GreenfootImage[] img = new GreenfootImage[3];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootSound scoreUpSound = new GreenfootSound("scoreup.mp3");
    public int moveSpeed = 7; 
    public Turtle() 
    {
        for (int i = 0; i < img.length; i++)
        {
            img[i] = new GreenfootImage("tile02" + i + ".png");
            img[i].scale(105, 60);
            img[i].mirrorHorizontally();
            setImage(img[i]);            
        }

    }

    /**
     * Turtle is animated, can eat seagrass and goes to wherever the cursor is. 
     */
    public void act()
    {
        setLocation(getX(), getY());
        animateTurtle();
        eat();
        gameOver();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            //use this to get the x position of the mouse.
            int x = mouse.getX();
            //use this to get the y position of the mouse.
            int y = mouse.getY();
            int turtleX = getX();
            int turtleY = getY();
            if (Math.abs(turtleX - x) > 2 && Math.abs(turtleY - y) > 2) 
            {
                turnTowards(x, y);
                move(moveSpeed);    
            }

        }

        turtleGetsSpeedBoost();
    }
    int imageIndex = 0; 
    public void animateTurtle()
    {
        if (animationTimer.millisElapsed() < 100)
        {
            return;
        }

        setImage(img[imageIndex]);
        imageIndex = ((imageIndex + 1) % img.length);
        animationTimer.mark();
    }

    public void eat()
    {
        if (isTouching(Seagrass.class))
        {
            removeTouching(Seagrass.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnSeagrass();
            world.increaseScore();
            scoreUpSound.play();
        }
    }

    /**
     * When turtle touches seagrass, the trash is removed and the lose boolean under the world class is set to true. 
     */
    public void gameOver()
    {
        if (isTouching(Trash.class))
        {
            removeTouching(Trash.class);
            MyWorld world = (MyWorld) getWorld();
            world.lose = true;
        }
    }

    public void turtleGetsSpeedBoost()
    {
        if (isTouching(SpeedBoost.class))
        {
            removeTouching(SpeedBoost.class);
            MyWorld world = (MyWorld) getWorld();
            moveSpeed++;
        }

    }
}
