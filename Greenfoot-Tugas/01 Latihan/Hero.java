import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act()
    {
        move();
        //edge();
    }
    
    public void edge(){
        move(2);
        
        if (isAtEdge()){
            setLocation(0, getY());
        }

    }
    
    public void move(){
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
        }
        
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
        }
    }
}
