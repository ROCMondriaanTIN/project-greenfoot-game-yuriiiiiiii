
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld2 extends World {

    private CollisionEngine ce;
    public static int starX = 100;
    public static int keyBlueX = 150;
    public static int keyGreenX = 150;
    public static int keyRedX = 150;
    public static boolean hud_heartFull = false;
    public Hero hero;
    
   
    /**
     * Constructor for objects of class MyWorld2.
     *
     */
    public MyWorld2() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 800, 1, false);
        this.setBackground("bg.png");

        int[][] map = {


};

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        hero = new Hero(te);

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 500, 200);
        addObject(new Heart (), 500, 100);
        addObject(new Enemy(), 1800, 300);
        
        addObject(new StartScreen(), 500, 400);
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
        if (hero.starAdded == true)
        {
            addObject(new CoinHUD(), starX, 100);
            
            starX += 30;
            hero.starAdded = false;
            return;
        }
        //if (hud_heartFull == false)
        // { Greenfoot.setWorld(new MyWorld2(500));
        //   
        //}
   if (hero.keyBlueAdded == true)
{
    addObject(new KeyBlue(), 100, 50);
    hero.keyBlueAdded = false;
    return;
}
 if (hero.keyGreenAdded == true)
{
    addObject(new KeyGreen(), 125, 50);
    hero.keyGreenAdded = false;
    return;
}
  if (hero.keyRedAdded == true)
{
    addObject(new KeyRed(), 150, 50);
    hero.keyRedAdded = false;
    return;
}
                     

        if (hero.starAdded == true)
        {
            addObject(new CoinHUD(), keyBlueX, 50);
            
            keyBlueX += 30;
            hero.keyBlueAdded = false;
            return;
        }
    }
} 