package classModelio.tile;

import classModelio.Player;

public class StartTile extends Tile {

    public StartTile() {
        this.setName("Case Départ");
    }

    @Override
    public void onPass(Player player) {
        player.addMoney(200);
    }
}
