import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MiCohete extends Actor
{
    public MiCohete()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/12;
        int myNewWidht = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidht, myNewHight);
        
    }
    private int targetx=0,targety=0;
    
    public void addedToWorld(World MiUniverso)
    {
        targetx=getX();targety=getY();
    }

    public void move()
    {
        double rx=targetx-getX();
        double ry=targety-getY();
        double r=Math.sqrt(rx*rx+ry*ry);
        int bts=5;
        int posx=0,posy=0;
        if(r>bts){
            posx=(int)(getX()+bts*rx/r);
            posy=(int)(getY()+bts*ry/r);
        }
        else{
            posx=targetx;
            posy=targety;
        }
        setLocation(posx,posy);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            targetx=mouse.getX();
            targety=mouse.getY();
        }
        move();
    }    
}
