import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

