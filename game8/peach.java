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
<<<<<<< HEAD
                // Add your action code here.
        //getWorld().addObject( new apple(), 150, 300);
        //上のプログラムにx（ランダムで決まる数＋定数）秒後にこれの分を実行するという条件を付ければ、
        //ランダムでりんごを発生させることができそう
        //座標appleX（ランダム）にリンゴを生成
       
        int peachX = 150;
=======
        //int peachX = 200;
        //int x = getX();
        //int y = getY();
        //setLocation(x, y + 3);
        //if ( isAtEdge() ){
        //    getWorld().removeObject ( this );
        //}
>>>>>>> 956d56540ade6dc811c02f3f3f4eb71eec99bc45
        int x = getX();
        int y = getY();
        setLocation(x, y + 4);
        if ( isAtEdge() ){
            getWorld().removeObject ( this );
        }
<<<<<<< HEAD

  
=======
>>>>>>> 956d56540ade6dc811c02f3f3f4eb71eec99bc45
    }    
}
