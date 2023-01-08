package classModelio.tile;

public class ParkTile extends Tile {

    public ParkTile(Tile nextTile){
        this.setName("Case parc gratuit");
        this.setNextTile(nextTile);
    }
}
