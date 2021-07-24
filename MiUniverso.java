import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MiUniverso extends World
{
    private int jeda=0;
    public MiUniverso()
    {
        super(600, 400, 1,false);
        addObject(new MiCohete(),100,200);
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda = 20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new Aliengenas(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
            //addObject(new Aliengenas(-(2+Greenfoot.getRandomNumber(3))), getWidth()+200,py);
        }
    }
}
