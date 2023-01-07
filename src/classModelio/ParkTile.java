package classModelio;

public class ParkTile extends Tile {

    public ParkTile(Tile nextTile){
        this.name = "Case parc gratuit";
        this.nextTile = nextTile;
    }
}
