import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int bugX = 150;
        int x = getX();
        int y = getY();
        setLocation(x, y + 3);
        if ( isAtEdge() ){
            getWorld().removeObject ( this );
        }
        // Add your action code here.
    }    
}
