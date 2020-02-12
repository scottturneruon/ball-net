import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby1 extends Actor
{
    /**
     * Act - do whatever the baby1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("w"))
        {
            this.setLocation(this.getX(),this.getY()-3);
            
        }
        if (Greenfoot.isKeyDown("z"))
        {
            this.setLocation(this.getX(),this.getY()+3);
            
        }
    }    
}
