import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quick extends Bonus
{
    /**
     * Act - do whatever the Quick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();    
    } 
    public boolean prueba1()
    {
        if(getWorld()!=null)
            if(this.isTouching(Avatar.class))
            {
                this.removeTouching(Quick.class);
                return true;
            }
            else 
                return false;
        else 
            return false;
    }
}