import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby2 extends Actor
{
    /**
     * Act - do whatever the baby2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
                if (Greenfoot.isKeyDown("i"))
        {
            this.setLocation(getX(),getY()-3);
            
        }
        if (Greenfoot.isKeyDown("m"))
        {
            this.setLocation(getX(),getY()+3);
            
        }
    }    
}
