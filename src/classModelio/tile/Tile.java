package classModelio.tile;

import classModelio.Player;

public abstract class Tile {

    private String name;

    private Tile nextTile;

    public void onStop(Player player) {    }

    public void onPass(Player player) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tile getNextTile() {
        return this.nextTile;
    }

    public void setNextTile(Tile nextTile) {
        this.nextTile = nextTile;
    }
}
