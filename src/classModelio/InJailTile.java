package classModelio;

public class InJailTile extends Tile {

    public InJailTile(Tile nextTile){
        this.name = "Case prison";
        this.nextTile = nextTile;
    }
}
