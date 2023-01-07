package classModelio;

public class GoToJailTile extends Tile {

    public GoToJailTile(Tile nextTile){
        this.name = "Case aller en prison";
        this.nextTile = nextTile;
    }
}
