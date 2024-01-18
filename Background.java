import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The code here is used to have a continous scrolling background when the game starts. 
 * 
 * @aDylan Dinesh
 * @Dec 2023
 */
public class Background extends Actor
{
    private int imageWidth;
    private int offset = 250;
    private Background otherBackground;
    private int speed = 4;

    public Background() {
        imageWidth = getImage().getWidth();    
    }

    public void setOtherBackground(Background otherBackground) {
        this.otherBackground = otherBackground;
    }

    public void act()
    {
        if(getX() < -imageWidth + offset) {
            int newX = otherBackground.getX() + imageWidth;
            setLocation(newX, getY());
        }
        move(-speed);
    }
}

