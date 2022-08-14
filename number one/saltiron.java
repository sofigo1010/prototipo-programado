import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saltiron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saltiron extends Actor
{
    public saltiron () {
        getImage().scale(getImage().getWidth()/6,getImage().getHeight()/6);
    }
    /**
     * Act - do whatever the saltiron wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // esto es para indicar cuanto se tiene que mover al presionar las teclas y se mueve el jugador
        if (Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("left")){
            move(4);
            }
        if (getX() == 0){
            //para que siga de largo y no se quede pegada en los limites y siga apareciendo
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(350)+200);
        }
        
    }
}
