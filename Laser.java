import greenfoot.*;
//import java.awt.Color;

public class Laser extends Actor
{
    private boolean toRemove=false;
    
    public void addedToWorld(World MiUniverso)
    {
        GreenfootImage image = new GreenfootImage(50,10);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
    }
    public void act() 
    {
        
    }    
}
