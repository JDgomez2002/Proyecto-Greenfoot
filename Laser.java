    import greenfoot.*;
    
    public class Laser extends Actor
    {
        private boolean toRemove=false;
        private int vx = 8;
        
    public void addedToWorld(World MiUniverso)
    {
        GreenfootImage image = new GreenfootImage(20,10);//50.10
        image.setColor(Color.WHITE);
        image.drawLine(0,5,image.getWidth()-1,5);//5.1
        setImage(image);
    }
    
    public void act() 
    {
        if(!toRemove){
            setLocation(getX()+vx,getY());
            Actor actor = getOneIntersectingObject(Aliengenas.class);
            if(actor != null)
            {
                ((Aliengenas)actor).Hancur();
            }
            if (getX()>getWorld().getWidth()-120)toRemove=true;//+200
        }
        else{
            getWorld().removeObject(this);
        }
    }    
}
