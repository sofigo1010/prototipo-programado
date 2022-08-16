import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ammo extends Actor
{
    private int speed = 10;
    public ammo(){
        getImage().scale(getImage().getWidth()/6,getImage().getHeight()/6);
    }
    /**
     * Act - do whatever the ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(speed);
        
    }
    
}
