import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ganegane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ganegane extends World
{

    /**
     * Constructor for objects of class ganegane.
     * 
     */
    public ganegane()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("ENTER")){ //cuando el usuario apache enter va a cambiar de pantalla
           Greenfoot.delay(15); //tiempo de 15 segundos
           Greenfoot.setWorld(new peleita()); // cambia la imagen al juego

    }
}
}
