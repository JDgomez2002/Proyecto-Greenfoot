import greenfoot.*;

public class MiEfecto1 extends Actor
{
    public int vx = 0, vy = 0, rotation = 0;
    
    public MiEfecto1(GreenfootImage img)
    {
        GreenfootImage image = new GreenfootImage(10,10);
        image.drawImage(img, -Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
        setImage(image);
        
    }
    
    public void addedToWorld(World MiUniverso)
    {
        vx = -5+Greenfoot.getRandomNumber(10);
        vy = -5+Greenfoot.getRandomNumber(10);
        rotation = -10+Greenfoot.getRandomNumber(20);
        
        if(vx==0)vx=1;
        if(vy==0)vy=1;
    }
    
    public void act() 
    {
        setLocation(getX()+vx,getY()+vy);
        if(getX()<-200 || getY()<-200 || getX()>getWorld().getWidth()+200 || getY()>getWorld().getHeight()+200)//200
        {
            getWorld().removeObject(this);
        }
    }    
}
