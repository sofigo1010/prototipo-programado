import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class likin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class likin extends Actor
{
    
    public likin () {
        // ajustar el tamano del animal
        getImage().scale(getImage().getWidth()/18,getImage().getHeight()/18);
    }
    // para caer
    private int vSpeed = 0; // velocidad vertical del animalito
    private int acceleration = 1; // aceleracion
    private int jumpHeight = -20; // la altura a la que debe de saltar
    private int collect = 0; // contador de monedas inicial
    boolean topculili = false; // checa si es verdadero o falso que ya llego al objetivo de monedas recolectadas
    /**
     * Act - do whatever the likin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   moveAround();
        checkFalling ();
        collect();
        loser();
        win();
        //
    }
    private void fall(){
        //metodo para cuando caiga
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration; //ira aumentando la velocidad al caer
        
        
    }
    public void moveAround () {
        // esto es para indicar cuanto se tiene que mover al presionar las teclas
        
        if (Greenfoot.isKeyDown("up")&&(onGround()==true)){
            //para saltar
            vSpeed = jumpHeight;
            fall();
        }
        
    
        
    }
    boolean onGround(){
        // para checar si hay algun objeto abajo del jugador o que esta parado en el
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,saltiron.class);
        return under != null;
    }
    public void checkFalling (){
        // para que se active el caer si no esta sobre la plataforma
        if (onGround () == false){
            fall();
            
        }
        if (onGround () == true){
            vSpeed=0;
        }
        
    }
    public void collect (){
        // para colectar monedas
        Actor culili = getOneIntersectingObject(culili.class);
        if(culili!= null){
            getWorld().removeObject(culili);
            collect++; // para sumar 1 al contador cada vez que se agarra un chest
        }
        if (collect == 2 && topculili == false){
            // para que cuando recolecte 15 chests salga el castillo y pueda ganar
            getWorld().addObject(new finish(), 2024, 288);
            topculili= true;
        }
       
    }
    public void loser(){
        if (getY() > 450){
            getWorld().addObject(new cagaishon(),getWorld().getWidth()/3, getWorld().getHeight()/3);
            Greenfoot.stop();
        }
    }
    public void win (){
        Actor finish = getOneIntersectingObject(finish.class);
        if (finish != null){
            Greenfoot.setWorld(new background2());
        }
    }

}
