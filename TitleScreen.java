import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen 
 * 
 * @author Dylan Dinesh
 * @version Jan 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Endagered Turtle", 60);
    GreenfootImage img = new GreenfootImage("trash.png");

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setImage(img);
        addObject(titleLabel, getWidth()/2-110, 50);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar. 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Move the turtle with your mouse. The turtle will go to the mouse.", 40);
        addObject(label,210,344);
        Turtle turtle = new Turtle();
        addObject(turtle,505,59);
    }
}
