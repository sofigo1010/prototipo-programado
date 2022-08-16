import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rawr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rawr extends Actor
{
    int speed = -3;
    int tiempo = 0;
    int vida = 10;
    boolean hitbyammo =false;
    public rawr () {
        // ajustar el tamano del animal
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    /**
     * Act - do whatever the rawr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        tiempo ++;
        moveAround();
        peleishon();
    }
    public void moveAround(){
        if (tiempo <60){
            // para que se mueva para arriba y abajo
            setLocation(getX(),getY()+ speed);
        }
        else {
            speed = -speed;
            tiempo=0;
        }
    }
    public void peleishon (){
        // para ir restando vida cada vez que le peguen 
        Actor arrow = getOneIntersectingObject(ammo.class);
        if (arrow != null && !hitbyammo){
            vida--;
            hitbyammo = true; // si le pegan entonces es cierto
            getWorld().removeObject(arrow);
            
        }
        else if (!isTouching(ammo.class)){
            hitbyammo = false; // si no le pegan sigue siendo false
        }
        if (vida<=0){
            getWorld().removeObject(this);
            Greenfoot.delay(50); //tiempo de 50 segundos
            Greenfoot.setWorld(new yayuuuyyy()); // cambia la imagen al final
            
            
        }
    }
}
