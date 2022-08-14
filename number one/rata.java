import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rata extends Actor
{
    public rata () {
        // para hacerla mas peque
        getImage().scale(getImage().getWidth()/6,getImage().getHeight()/6);
    }
    /**
     * Act - do whatever the rata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // para que se muevan con el jugador
        if (Greenfoot.isKeyDown("right")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("left")){
            move(1);
        }
        if (getX() == 0){
            //para que siga de largo y no se quede pegada en los limites y siga apareciendo
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(170)+30);
        }
    }
}
