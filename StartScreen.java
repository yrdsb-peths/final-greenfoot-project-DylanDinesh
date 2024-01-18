import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting srceen with instructions for players. They must click space to start. 
 * 
 * @Dylan Dinesh  
 * @Jan 2024
 */
public class StartScreen extends World
{
    Label titleLabel = new Label("Endagered Turtles", 55);
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(titleLabel, getWidth()/2-85, 50);
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
        Label instructions = new Label("Move the turtle with your mouse. The turtle will go to the mouse.", 20);
        addObject(instructions,300,344);
        Label spaceToStart = new Label("Click space to start", 20);
        addObject(spaceToStart,300,380);
        Turtle turtle = new Turtle();
        addObject(turtle,505,59);

    }
}