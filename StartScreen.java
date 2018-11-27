import greenfoot.Greenfoot;
public class StartScreen extends Mover                              
{

public StartScreen(){}
         public void act(){
   {
    setImage("startscherm.png");
   if(Greenfoot.isKeyDown("enter")){
   getWorld().removeObject(this);}
}
}
}