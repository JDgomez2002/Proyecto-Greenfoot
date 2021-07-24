import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MiUniverso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiUniverso extends World
{


    public MiUniverso()
    {
        super(600, 400, 1,false);
        addObject(new MiCohete(),100,200);
    }
}
