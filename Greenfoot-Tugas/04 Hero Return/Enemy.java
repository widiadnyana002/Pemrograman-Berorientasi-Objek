import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        setRotation(180);
        
    }
    
    public Enemy(int speed){ 
        setRotation(180);
        this.speed = speed;
    }
    
    private int speed = 2;
    public void act()
    {
        move(speed);
        edge();
    }
    
    public void edge(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
}
