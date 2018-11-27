
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public static boolean redUnlock = false;
    public static boolean blueUnlock = false;
    public static boolean starAdded = false;
    public static boolean greenUnlock = false;
    public static boolean keyBlueAdded = false;
    public static boolean keyGreenAdded = false;
    public static boolean keyRedAdded = false;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 2.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        //System.out.println(getX());
        //System.out.println(getY());
        handleInput();
        GreenfootSound kevin = new GreenfootSound("kevin.wav");

        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                kevin.play();
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("liquidLava")){
kevin.play();
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyBlue")){
kevin.play();
                keyBlueAdded = true;
                getWorld().removeObject(tile);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyGreen")){
kevin.play();
                keyGreenAdded = true;
                getWorld().removeObject(tile);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyRed")){
kevin.play();
                keyRedAdded = true;
                getWorld().removeObject(tile);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("star")){
kevin.play();
                starAdded = true;
                getWorld().removeObject(tile);
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyRed")){
                kevin.play();
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_red")) {
                        tileLock.isSolid = false;
                        tileLock.getImage().clear();
                    }
                }
                getWorld().removeObject(tile);
                redUnlock = true;
                return;
            }
        }
        
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyGreen")){
                kevin.play();
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_green")) {
                        tileLock.isSolid = false;
                        tileLock.getImage().clear();
                    }
                }
                getWorld().removeObject(tile);
                redUnlock = true;
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("lock_green")){
                kevin.play();
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_green")) {
                        tileLock.isSolid = false;
                        tileLock.getImage().clear();
                    }
                }
                getWorld().removeObject(tile);
                redUnlock = true;
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if(tile.getImage().toString().contains("keyBlue")){
                kevin.play();
                for (Tile tileLock : getWorld().getObjects(Tile.class)) {
                    if (tileLock.getImage().toString().contains("lock_blue")) {
                        tileLock.isSolid = false;
                        tileLock.getImage().clear();
                    }
                }
                getWorld().removeObject(tile);
                redUnlock = true;
                return;
            }
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if (redUnlock == true){
            if(tile.getImage().toString().contains("lock_red")){
kevin.play();
                getWorld().removeObject(tile);
                
                return;
            }}
            
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if (blueUnlock == true){
            if(tile.getImage().toString().contains("lock_blue")){
kevin.play();
                getWorld().removeObject(tile);
                
                return;
            }}
        }
        for (Actor tile : getIntersectingObjects(Tile.class)) {
            if (greenUnlock == true){
            if(tile.getImage().toString().contains("lock_green")){
kevin.play();
                getWorld().removeObject(tile);
                
                return;
            }}
        }
       
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && (isTouching(Tile.class) && (velocityY <= 0))) {
                velocityY = -28;}

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
     
    
