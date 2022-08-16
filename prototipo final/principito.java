import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class principito extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public principito()
    {    
        // tamaño de la imagen.
        super(1000, 560, 1); 
        musica();
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("ENTER")){ //cuando el usuario apache enter va a cambiar de pantalla
           Greenfoot.delay(15); //tiempo de 15 segundos
           Greenfoot.setWorld(new background()); // cambia la imagen al juego

    }
    }
    private void musica(){
        GreenfootSound musica = new GreenfootSound("musiquita.mp3"); //se agrega la musica 
        musica.setVolume(30); //volumen de 30
        musica.playLoop(); //loop para que se repita
    
    }

    
}
