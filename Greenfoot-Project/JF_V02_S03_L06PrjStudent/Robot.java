import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
    
    public void robotMovement(){

    }
    
    public void detectWallCollision(){
        if(isTouching(Wall.class)){
            setLocation(48, 50);
        }
    }
    
    public void detectBlockCollision(){
        if(isTouching(Block.class)){
            setLocation(48, 50);
        }
    }
}
