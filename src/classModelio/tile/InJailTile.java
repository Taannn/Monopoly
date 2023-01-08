package classModelio.tile;

public class InJailTile extends Tile {

    public InJailTile(Tile nextTile){
        this.setName("Case prison");
        this.setNextTile(nextTile);
    }
}
