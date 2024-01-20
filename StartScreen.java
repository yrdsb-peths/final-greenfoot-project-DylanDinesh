import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting srceen with instructions for players. They must click space to start. 
 * 
 * @Dylan Dinesh  
 * @Jan 2024
 */
public class StartScreen extends World
{
    Label titleLabel = new Label("Endangered Turtles", 55);
    GreenfootSound openingSong = new GreenfootSound("openingtheme.mp3");
    /**
     * Constructor for objects of class StartScreen.
     * Plays opening music as well.
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setBackground("start.png");
        openingSong.play(); 
        addObject(titleLabel, getWidth()/2, 40);
        prepare();  
    } 

    /**
     * The main world opens by clicking the space bar. 
     */
    public void act()
    {
        // Start the game if user presses the space bar. 
        if (Greenfoot.isKeyDown("space"))
        {
            openingSong.stop();
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
        Label instructionsOne = new Label("Move the turtle with your mouse. The turtle will go to the mouse.", 20);
        instructionsOne.setLineColor(Color.WHITE);
        addObject(instructionsOne,300,304);
        Label instructionsTwo = new Label("Eat seagrass for points and go the the lightning for a speed power up.", 20);
        instructionsTwo.setLineColor(Color.WHITE);
        addObject(instructionsTwo,300,327);
        Label instructionsThree = new Label("Avoid the trash or else you lose!", 25);
        instructionsThree.setLineColor(Color.WHITE);    
        addObject(instructionsThree,300,350);
        Label spaceToStart = new Label("Click space to start...", 20);
        spaceToStart.setLineColor(Color.WHITE);
        addObject(spaceToStart,300,380);
        Turtle turtle = new Turtle();
        addObject(turtle,getWidth()/2,250);

    }
}