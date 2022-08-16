import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peleita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peleita extends World
{

    /**
     * Constructor for objects of class peleita.
     * 
     */
    public peleita()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        likin likin = new likin();
        addObject(likin,344,306);
        likin.setLocation(287,450);
        rawr rawr = new rawr();
        addObject(rawr,735,343);
        rawr.setLocation(732,399);
        removeObject(likin);
        gallodepelea gallodepelea = new gallodepelea();
        addObject(gallodepelea,245,385);
        gallodepelea.setLocation(245,466);
        rawr.setLocation(489,467);
        rawr.setLocation(426,452);
        rawr.setLocation(754,321);
        rawr.setLocation(741,255);
        rawr.setLocation(587,277);
        rawr.setLocation(672,495);
        rawr.setLocation(716,442);
        rawr.setLocation(715,462);
        rawr.setLocation(616,351);
        rawr.setLocation(648,364);
        gallodepelea.setLocation(167,389);
        rawr.setLocation(842,380);
    }
}
