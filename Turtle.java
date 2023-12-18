import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{

    public Turtle() 
    {
        GreenfootImage img = new GreenfootImage("tile020.png");
        img.scale(150, 86);
        img.mirrorHorizontally();
        setImage(img);           
    }

    public void act()
    {
        setLocation(getX(), getY());
    }
}
