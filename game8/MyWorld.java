import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int timecount = 2000;
    public Actor titlelogo = null;
    
    public MyWorld()
    {
        super(1200, 700, 1);
        titlelogo = new title();
        addObject( titlelogo, 600, 200 );
        addObject( new GorillaGorilla(), 150, 570 );
        addObject( new apple(), 150, 200 );
    }
    
    public void act()
    {
        if(titlelogo != null) {
            removeObject(titlelogo);
            titlelogo = null;
        }
        timecount--;
        showText( ""+timecount, 50,50 );
        if(timecount == 0){
            showText( "TIME OVER", 400,200 );
            Greenfoot.stop();
        }
    }
    
}

