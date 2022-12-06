import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    public void act()
    {
        super.act();
        shootLaser();
    }
    
    public Enemy2(){
        super();
    }
    
    public Enemy2(int speed){
        super(speed);
    }
    
    
    private int laserTimer = 0;
    public void shootLaser(){
        if(laserTimer==30){
            getWorld().addObject(new LaserEnemy(), getX()-80, getY());
            Greenfoot.playSound("laser.wav");
            laserTimer = 0;
        } else {
            laserTimer++;
        }
    }
}
