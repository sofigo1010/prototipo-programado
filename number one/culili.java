import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class culili here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class culili extends Actor
{
    public culili () {
        // ajustar el tamano del animal
        getImage().scale(getImage().getWidth()/35,getImage().getHeight()/35);
    }
    /**
     * Act - do whatever the culili wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // para que se muevan con el jugador
        if (Greenfoot.isKeyDown("right")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("left")){
            move(4);
        }
        if (getX() == 0){
            //para que siga de largo y desaparezca cuando pase
            getWorld().removeObject(this);
        }

    }
}
