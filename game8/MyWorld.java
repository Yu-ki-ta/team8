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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        titlelogo = new title();
        addObject(titlelogo, 600, 200 );
        addObject( new GorillaGorilla(), 150, 570);
<<<<<<< HEAD
        addObject( new apple(), 150, 200);
=======
        
        
        
    }
    
    public void act()
    {
        if(titlelogo != null){
            removeObject(titlelogo);
            titlelogo = null;
        }
>>>>>>> 46414ce42655064dde4b5f02e90a73b8ff2d7d8f
    }
}

