import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        //上のプログラムにx（ランダムで決まる数＋定数）秒後にこれの分を実行するという条件を付ければ、
        //ランダムでりんごを発生させることができそう
        //座標appleX（ランダム）にリンゴを生成
        //getWorld().addObject( new apple(), 150, 200 );
        int x = getX();
        int y = getY();
        setLocation(x, y + 4);
        if ( isAtEdge() ){
            getWorld().removeObject ( this );
        }
        
    }
}
