package classModelio;

public class LuckTile extends Tile {

    public LuckTile(Tile nextTile){
        this.name = "Case chance";
        this.nextTile = nextTile;
    }
}
