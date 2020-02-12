import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private ScoreCounter sc;
    private ScoreCounter sc1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby1(), 150, 200);
        addObject(new baby2(), 450, 200);
        addObject(new baby1(), 50, 200);
        addObject(new baby2(), 550, 200);
        //End of code that must be included in your solution
        sc=new ScoreCounter();
        addObject(sc,60,20);
        sc1=new ScoreCounter();
        addObject(sc1,460,20);
        addObject(new ball1(), 200,200);
        
    }
        public ScoreCounter getCounter()
    {
        return sc;
     }
             public ScoreCounter getCounter2()
    {
        return sc1;
     }
}
