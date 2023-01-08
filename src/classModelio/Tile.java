package classModelio;

public abstract class Tile {

    protected String name;

    protected Tile nextTile;

    public void onStop(Player player) {    }

    public Tile getNextTile() {
        return this.nextTile;
    }

    public void onPass(Player player) {
    }

    public String getName() {
        return name;
    }
}
