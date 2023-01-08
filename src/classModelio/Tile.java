package classModelio;

public abstract class Tile {

    protected String name;

    protected Tile nextTile;

    public void onStop(Player player) {
        System.out.println("Vous êtes sur une " + this.getClass().getName());
    }

    public Tile getNextTile() {
        return null;
    }

    public void setNextTile(Tile nextTile) {
        this.nextTile = nextTile;
    }

    public void onPass(Player player) {
    }

    public String getName() {
        return name;
    }
}
