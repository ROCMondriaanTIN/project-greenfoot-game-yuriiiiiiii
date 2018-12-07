
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public boolean redUnlock = false;
    public boolean blueUnlock = false;
    public boolean starAdded = false;
    public boolean greenUnlock = false;
    public boolean keyBlueAdded = false;
    public boolean keyGreenAdded = false;
    public boolean keyRedAdded = false;
    public boolean  signExitadded = false;
    public boolean isDood;
    public int counter;
    private TileEngine tileEngine;
    
    public Hero(TileEngine tileEngine) {
        super();
        this.tileEngine = tileEngine;
        gravity = 9.8;
        acc = 2.6;
        drag = 0.8;
        setImage("p1.png");
        keyRedAdded = false;
        keyBlueAdded = false;
        keyGreenAdded = false;
    }
    public void kill() {
        Greenfoot.playSound("dood.wav");
        isDood = true;
    }
    @Override
    public void act() {
    
        
        if ( isDood == true) {
            velocityX = 0;
            velocityY = 0;
            getImage().setTransparency(0);
            
            counter++;
            if(counter > 100) {
                Greenfoot.setWorld(new MyWorld());
            }
            return;
        }
       // System.out.println(getX());
       // System.out.println(getY());
        GreenfootSound kevin = new GreenfootSound("kevin.wav");
        handleInput();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
       // System.out.println(keyGreenAdded);
        if(keyGreenAdded){
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_green") ) {
                        tileEngine.removeTile(tileLock);
                    }
                }
            }
            if(keyRedAdded){
                
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_red")) {
                        tileEngine.removeTile(tileLock);
                    }
                }
               
            }
            if(keyBlueAdded){
                
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_blue")) {
                        tileEngine.removeTile(tileLock);
                    }
                }
                
            }

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                kill();
                return;
            }
        }
        for (Tile tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("liquidLava")){
                kill();
                return;
            }
            if(tile.getImage().toString().contains("keyBlue")){

                keyBlueAdded = true;
                tileEngine.removeTile(tile);
                break;
            }
            if(tile.getImage().toString().contains("keyGreen")){

                keyGreenAdded = true;
                getWorld().removeObject(tile);
                break;
            }
            if(tile.getImage().toString().contains("keyRed")){

                keyRedAdded = true;
                getWorld().removeObject(tile);
                break;
            }
            
            if(tile.getImage().toString().contains("star")){

                starAdded = true;
                getWorld().removeObject(tile);
                return;
            }
            if(tile.getImage().toString().contains("signExit")){
                signExitadded = true; 
               Greenfoot.setWorld(new MyWorld2());
             return;   
            }
                
           if(keyGreenAdded){
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_green") ) {
                        tileEngine.removeTile(tileLock);
                    }
                }
                greenUnlock = true;
                return;
            }
            if(tile.getImage().toString().contains("lock_red") && keyGreenAdded){
                
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_red")) {
                        tileEngine.removeTile(tileLock);
                    }
                }
                redUnlock = true;
                return;
            }
            if(tile.getImage().toString().contains("lock_blue") && keyGreenAdded){
                
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_blue")) {
                        tileEngine.removeTile(tileLock);
                    }
                }
                blueUnlock = true;
                return;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")  && (isTouching(Tile.class) && (velocityY <= 0)))  {
                velocityY = -28;
            Greenfoot.playSound("jump.wav");}

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -7;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 7;
        }
    }
   
     

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}
    
    
    
    
