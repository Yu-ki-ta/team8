import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peach extends Actor
{
    /**
     * Act - do whatever the peach wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //int peachX = 200;
        //int x = getX();
        //int y = getY();
        //setLocation(x, y + 3);
        //if ( isAtEdge() ){
        //    getWorld().removeObject ( this );
        //}
        int x = getX();
        int y = getY();
        setLocation(x, y + 4);
        if ( isAtEdge() ){
            getWorld().removeObject ( this );
        }
    }    
}
