import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Aliengenas extends Actor
{
    private int vx=0;
    private boolean toRemove = false;
//25.50
    public Aliengenas()
    {
        // GreenfootImage myImage = getImage();
        // int myNewHight = (int)myImage.getHeight()/12;
        // int myNewWidht = (int)myImage.getWidth()/12;
        // myImage.scale(myNewWidht, myNewHight);
        
    }

    public Aliengenas(int v){
        vx=v;
    }
    
    public void addedToWorld(World MiUniverso){
        // GreenfootImage myImage = getImage();
        // int myNewHight = (int)myImage.getHeight()/12;
        // int myNewWidht = (int)myImage.getWidth()/12;
        // myImage.scale(myNewWidht, myNewHight);
        
        setRotation(0);
    }
    
    public void move(){
        setLocation(getX()+vx,getY());
        Actor actor=getOneIntersectingObject(MiCohete.class);
        if (actor!=null)
        {
            ((MiCohete)actor).Hancur();
            Hancur();
            
        }
        if(getX()<-200)toRemove=true;//-200
    }
    
    public void Hancur()
    {
        for(int i=0;i<10;i++)
        {
            int px = -20+Greenfoot.getRandomNumber(40);//-20.40
            int py = -20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new MiEfecto1(getImage()),getX()+px,getY()+py);
            //getWorld().addObject(new MiEfecto1(getImage()),px,py);
        }
        getWorld().addObject(new MiEfecto2(),getX(),getY());
        toRemove = true;
    }
    
    public void act() 
    {
        //move();
        if(!toRemove)move();
        else getWorld().removeObject(this);
    }

}
