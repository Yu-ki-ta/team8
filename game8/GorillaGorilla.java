import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GorillaGorilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GorillaGorilla extends Actor
{
    /**
     * Act - do whatever the GorillaGorilla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(5);
        }
        
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(0);
            move(-5);
        }
        
        Actor actor = getOneIntersectingObject(peach.class );
        Actor actor1 = getOneIntersectingObject(banana.class );
        Actor actor2 = getOneIntersectingObject(bug.class );
        Actor actor3 = getOneIntersectingObject(goldapple.class );
        Actor actor4 = getOneIntersectingObject(kiwi.class );
        Actor actor5 = getOneIntersectingObject(strawberry.class );
        Actor actor6 = getOneIntersectingObject(apple.class );
        if( actor != null ){
            getWorld().removeObject( actor );
        }  
        if( actor1 != null ){
            getWorld().removeObject( actor1 );
        }  
        if( actor2 != null ){
            getWorld().removeObject( actor2 );
        }  
        if( actor3 != null ){
            getWorld().removeObject( actor3 );
        }  
        if( actor4 != null ){
            getWorld().removeObject( actor4 );
        }  
        if( actor5 != null ){
            getWorld().removeObject( actor5 );
        }  
        if( actor6 != null ){
            getWorld().removeObject( actor6 );
        }  
    }
}
