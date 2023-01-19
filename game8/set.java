import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class set here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class set extends Actor
{
    /**
     * Act - do whatever the set wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    
    public set() {
    };
    
    public void act() 
    {
        // Add your action code here.
        counter++;
        if (counter >= 50) {
            int A = 0;
            int B = 6;
            int C = A + (int)(Math.random()*((B-A)+1));
            A = 0;
            B = 1200;
            int D = A + (int)(Math.random()*((B-A)+1));
            switch (C)  {
                case 0: getWorld().addObject( new apple(), D, 150 ); break;
                case 1: getWorld().addObject( new apple(), D, 150 ); break;
                case 2: getWorld().addObject( new apple(), D, 150 ); break;
                case 3: getWorld().addObject( new apple(), D, 150 ); break;
                case 4: getWorld().addObject( new apple(), D, 150 ); break;
                case 5: getWorld().addObject( new apple(), D, 150 ); break;
                case 6: getWorld().addObject( new apple(), D, 150 ); break;
            }
            counter = 0;
        }
    }    
}
