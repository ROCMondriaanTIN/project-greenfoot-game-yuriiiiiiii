
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int yMin;
    private int yMax;
    private boolean firstAct;
    private int speed;

    public Enemy() {
        super();
        setImage("kevin.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        int y = getY();
        int x = getX();

        if (firstAct) {
            firstAct = false;
            yMin = y - walkRange / 2;
            yMax = y + walkRange / 2;
        }

        velocityY = speed;
        applyVelocity();
        if (getY() >= yMax) {
            speed *= -1;
            y = yMax;
            getImage().mirrorHorizontally();
        } else if (getY() <= yMin) {
            speed *= -1;
            y = yMin;
            getImage().mirrorHorizontally();
        }
    }
}
