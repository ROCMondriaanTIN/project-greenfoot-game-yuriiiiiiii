import greenfoot.Greenfoot;
public class StartScreen extends Mover                              
{

public StartScreen(){}
         public void act(){
   {
    setImage("achtergrondgreenfoot.png");
   if(Greenfoot.isKeyDown("enter")){
   getWorld().removeObject(this);}
}
}
}