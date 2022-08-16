import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public static int collect = 0; // contador de chests inicial
    
    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // tamano del background
        super(1000, 540, 1); 
        prepare();
    }
    public void act(){
        showText ("Chests recolectados: " + collect, 500, 50);
        if (Greenfoot.getRandomNumber(150)<=1){
            addObject(new culili(), getWidth()-1, Greenfoot.getRandomNumber(250)+100);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        saltiron saltiron = new saltiron();
        addObject(saltiron,193,419);
        saltiron.setLocation(76,468);
        saltiron saltiron2 = new saltiron();
        addObject(saltiron2,286,357);
        saltiron2.setLocation(306,383);
        saltiron saltiron3 = new saltiron();
        addObject(saltiron3,306,383);
        saltiron saltiron4 = new saltiron();
        addObject(saltiron4,422,421);
        saltiron3.setLocation(328,427);
        saltiron saltiron5 = new saltiron();
        addObject(saltiron5,328,427);
        saltiron2.setLocation(201,357);
        saltiron3.setLocation(290,287);
        saltiron5.setLocation(416,207);
        saltiron4.setLocation(552,281);
        saltiron2.setLocation(216,287);
        saltiron3.setLocation(312,230);
        saltiron4.setLocation(552,332);
        saltiron saltiron6 = new saltiron();
        addObject(saltiron6,382,418);
        saltiron saltiron7 = new saltiron();
        addObject(saltiron7,515,437);
        saltiron saltiron8 = new saltiron();
        addObject(saltiron8,661,415);
        saltiron8.setLocation(705,401);
        saltiron saltiron9 = new saltiron();
        addObject(saltiron9,705,401);
        saltiron saltiron10 = new saltiron();
        addObject(saltiron10,749,323);
        saltiron saltiron11 = new saltiron();
        addObject(saltiron11,952,194);
        saltiron saltiron12 = new saltiron();
        addObject(saltiron12,760,148);
        saltiron saltiron13 = new saltiron();
        addObject(saltiron13,1062,403);
        saltiron6.setLocation(214,512);
        saltiron7.setLocation(396,470);
        saltiron4.setLocation(553,355);
        saltiron8.setLocation(818,494);
        saltiron10.setLocation(848,242);
        saltiron12.setLocation(628,188);
        saltiron8.setLocation(730,389);
        saltiron9.setLocation(916,484);
        saltiron11.setLocation(1166,180);
        saltiron13.setLocation(1037,384);
        saltiron8.setLocation(724,396);
        saltiron5.setLocation(484,205);
        saltiron11.setLocation(1144,219);
        culili culili = new culili();
        addObject(culili,692,282);
        culili.setLocation(197,259);
        culili.setLocation(185,243);
        culili culili2 = new culili();
        addObject(culili2,642,232);
        culili2.setLocation(637,235);
        culili2.setLocation(632,96);
        culili2.setLocation(640,106);
        culili culili3 = new culili();
        addObject(culili3,345,248);
        saltiron3.setLocation(545,317);
        culili culili4 = new culili();
        addObject(culili4,1088,295);
        culili4.setLocation(1016,314);
        culili culili5 = new culili();
        addObject(culili5,738,311);
        culili5.setLocation(1151,138);
        saltiron3.setLocation(1048,545);
        saltiron8.setLocation(703,427);
        saltiron3.setLocation(376,331);
        saltiron2.setLocation(197,342);
        saltiron2.setLocation(192,364);
        culili.setLocation(191,277);
        culili.setLocation(191,291);
        culili3.setLocation(361,239);
        saltiron12.setLocation(682,185);
        culili2.setLocation(688,133);
        saltiron5.setLocation(524,231);
        saltiron8.setLocation(562,411);
        saltiron9.setLocation(782,444);
        saltiron4.setLocation(901,399);
        culili4.setLocation(563,377);
        saltiron8.setLocation(571,343);
        culili3.setLocation(381,256);
        saltiron11.setLocation(1137,208);
        culili2.setLocation(672,116);
        saltiron13.setLocation(1017,268);
        saltiron4.setLocation(962,386);
        saltiron8.setLocation(560,440);
        culili4.setLocation(569,395);
        saltiron7.setLocation(392,503);
        culili3.setLocation(363,231);
        saltiron3.setLocation(359,250);
        saltiron2.setLocation(204,331);
        saltiron2.setLocation(204,267);
        likin likin = new likin();
        addObject(likin,48,335);
        likin.setLocation(59,351);
        saltiron9.setLocation(747,425);
        removeObject(saltiron4);
        removeObject(saltiron13);
        saltiron11.setLocation(1016,186);
        removeObject(saltiron11);
        culili5.setLocation(1003,138);
        removeObject(culili5);
        finish finish = new finish();
        addObject(finish,956,340);
        finish.setLocation(1000,367);
        finish.setLocation(1535,446);
        finish.setLocation(1582,440);
        saltiron saltiron14 = new saltiron();
        addObject(saltiron14,1167,442);
        saltiron14.setLocation(991,443);
        saltiron saltiron15 = new saltiron();
        addObject(saltiron15,1216,309);
        saltiron15.setLocation(1095,326);
        saltiron saltiron16 = new saltiron();
        addObject(saltiron16,1345,337);
        saltiron16.setLocation(1229,414);
        saltiron saltiron17 = new saltiron();
        addObject(saltiron17,1400,369);
        saltiron17.setLocation(1398,339);
        removeObject(saltiron16);
        removeObject(saltiron17);
        removeObject(saltiron15);
        finish.setLocation(979,423);
        removeObject(saltiron14);
        finish.setLocation(1479,80);
        saltiron7.setLocation(1062,359);
        saltiron8.setLocation(1106,336);
        saltiron8.setLocation(1367,372);
        saltiron9.setLocation(1428,275);
        saltiron6.setLocation(1218,497);
        finish.setLocation(1917,254);
        saltiron saltiron18 = new saltiron();
        addObject(saltiron18,1836,369);
        saltiron18.setLocation(1563,445);
        saltiron saltiron19 = new saltiron();
        addObject(saltiron19,1750,418);
        saltiron19.setLocation(1748,391);
        saltiron saltiron20 = new saltiron();
        addObject(saltiron20,1933,438);
        saltiron20.setLocation(1942,338);
        removeObject(finish);
        culili4.setLocation(1053,276);
        removeObject(saltiron19);
        removeObject(saltiron18);
        removeObject(saltiron6);
        removeObject(saltiron20);
        saltiron7.setLocation(986,343);
        removeObject(saltiron8);
        removeObject(saltiron9);
        saltiron7.setLocation(984,323);
    }
}
