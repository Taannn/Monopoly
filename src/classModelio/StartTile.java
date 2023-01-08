package classModelio;

public class StartTile extends Tile {

    public StartTile() {
        this.name = "Case Départ";
    }

    @Override
    public void onPass(Player player) {
        player.addMoney(200);
    }

    public void setNextTile(Tile nextTile) {
        this.nextTile = nextTile;
    }
}
