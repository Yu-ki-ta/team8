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
    
    public Actor titlelogo = null;
    
    public MyWorld()
    {
        super(1200, 700, 1);
        titlelogo = new title();
        addObject( titlelogo, 600, 200 );
        addObject( new GorillaGorilla(), 150, 570 );
        int A = 0;
        int B = 1200;
        int x = A + (int)(Math.random()*((B-A)+1));
        addObject( new apple(), x, 150);
        set setFruit = new set();
        setFruit.act();
    }
    
    public void act()
    {
        if(titlelogo != null) {
            removeObject(titlelogo);
            titlelogo = null;
        }
        
    }
}

