import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    private int score=0;
    public ScoreCounter()
    {
        score=0;
        updateScore();
    } 
    public void updateScore()
    {
        String scoreText="Score: "+score;
        setImage(new GreenfootImage(scoreText, 24, Color.BLACK, new Color(0,0,0,0)));
    }
    public void updateScore(int value)
    {
        score=score+value;
        updateScore();
    }
    public int getScore()
    {
        return score;
    }
    
    
}
