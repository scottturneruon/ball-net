import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        Actor net = getOneIntersectingObject(barrier.class);
        /*if (net!=null)
        {
            turn(180);
            move(1);
        }*/
          MyWorld beachWorld = (MyWorld) getWorld();  // get a reference to the world
       ScoreCounter counter = beachWorld.getCounter();  // get a reference to the counter
        ScoreCounter counter1 = beachWorld.getCounter2(); 
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            turn(135+Greenfoot.getRandomNumber(90));
            move(5);
            counter.updateScore(5);
        }
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            
            turn(135+Greenfoot.getRandomNumber(90));
            move(5);
            counter1.updateScore(5);
        }
        if ((this.getX()<16)||(this.getX()>590)||(this.getY()>390)||(this.getY()<16))
        {
            turn(90+getRotation());
        }
        

    } 
    
}
