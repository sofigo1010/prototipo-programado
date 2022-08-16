import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gallodepelea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gallodepelea extends Actor
{
    background thisGame;// para referenciar al contador en el background
    public gallodepelea () {
        // ajustar el tamano del animal
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
    }
    // para caer
    private int vSpeed = 0; // velocidad vertical del animalito
    private int acceleration = 1; // aceleracion
    private int jumpHeight = -20; // la altura a la que debe de saltar
    boolean topculili = false; // checa si es verdadero o falso que ya llego al objetivo de monedas recolectadas
    /**
     * Act - do whatever the likin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   moveAround();
        checkFalling ();
        pewpew();
    }
    private void fall(){
        //metodo para cuando caiga
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration; //ira aumentando la velocidad al caer
        
        
    }
    public void moveAround () {
        // esto es para indicar cuanto se tiene que mover al presionar las teclas
        
        if (Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")){
            move(4);
            }
        if (Greenfoot.isKeyDown("up")&&(getY()> 450)){
            //para saltar
            vSpeed = jumpHeight;
            fall();
        }
        
    
        
    }
    
    public void checkFalling (){
        // para que se active el caer si no esta sobre la plataforma
        if (getY() < 450){
            fall();
            
        }
        else{
            vSpeed=0;
        }
        
    }
    public void pewpew(){
        if (Greenfoot.mousePressed(null)){
            ammo arrow = new ammo();
            getWorld().addObject(arrow, getX(),getY());
            arrow.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    
    
}
