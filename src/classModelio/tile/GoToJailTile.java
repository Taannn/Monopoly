package classModelio.tile;

public class GoToJailTile extends Tile {

    public GoToJailTile(Tile nextTile){
        this.setName("Case aller en prison");
        this.setNextTile(nextTile);
    }
}
