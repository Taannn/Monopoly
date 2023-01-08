package classModelio.tile;

public class LuckTile extends Tile {

    public LuckTile(Tile nextTile){
        this.setName("Case chance");
        this.setNextTile(nextTile);
    }
}
