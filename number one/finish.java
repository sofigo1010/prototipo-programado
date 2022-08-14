import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finish extends Actor
{
    public finish () {
        // ajustar el tamano del animal
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
    /**
     * Act - do whatever the finish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("left")){
            move(4);
            }
    }
}
