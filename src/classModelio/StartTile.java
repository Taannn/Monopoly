package classModelio;

public class StartTile extends Tile {

    public StartTile() {
        this.name = "Case Départ";
    }

    @Override
    public void onPass(Player player) {
        player.addMoney(200);
    }
}
