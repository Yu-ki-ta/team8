<<<<<<< HEAD
            import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
            import java.text.ParseException;
            import java.util.Timer;
            import java.util.TimerTask;
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
                //addObject( new apple(), 150, 200 );
=======
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
        //addObject( new apple(), 150, 200 );
        
        /*int A = 0;
        int B = 1200;
        int C = A + (int)(Math.random()*((B-A)+1));
        addObject( new bug(), C, 200 );*/
           
        int A = 0;
        int B = 1200;
        int x = A + (int)(Math.random()*((B-A)+1));
        //addObject( new peach(), x, 150);
        addObject( new set(), 0, 0);
        //set setFruit = new set();
        //setFruit.act();
>>>>>>> 956d56540ade6dc811c02f3f3f4eb71eec99bc45
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

