

/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 251:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 276:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 277:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 12:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 13:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 258: 
                   tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 256:
                tile = new Tile ("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 257:
                tile = new Tile ("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
               tile.isSolid = true;
                break;
                case 255:
                tile = new Tile ("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
                case 266:
                tile = new Tile ("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 260:
                tile = new Tile ("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
                case 294:
            tile = new Tile ("gemYellow.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
                case 295:
            tile = new Tile ("star.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 283:
                tile = new Tile ("snowHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);    
            tile.isSolid = true;
            break;
            case 293:
            tile = new Tile ("keyRed.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 291:
            tile = new Tile ("keyBlue.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 292:
            tile = new Tile ("keyGreen.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 282:
                tile = new Tile ("snowHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);    
            break;
            case 281:
            tile = new Tile ("snowHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 270:
            tile = new Tile ("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 271:
            tile = new Tile ("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
           case 272:
            tile = new Tile ("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = true;
            break;
            case 273:
            tile = new Tile ("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 268:
            tile = new Tile ("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 267:
            tile = new Tile ("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 278:
            tile = new Tile ("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 279:
            tile = new Tile ("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 289:
            tile = new Tile ("snowLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 280:
            tile = new Tile ("snowHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 263:
            tile = new Tile ("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 264:
            tile = new Tile ("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 252:
            tile = new Tile ("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 269: 
            tile = new Tile ("grassCenter.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;

            break;
            
                        
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
