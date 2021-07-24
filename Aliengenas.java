import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aliengenas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aliengenas extends Actor
{
    public Aliengenas()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/12;
        int myNewWidht = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidht, myNewHight);
        
    }
    /**
     * Act - do whatever the Aliengenas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }

}
