package classModelio;

public abstract class Tile {

    private Tile nextTile;

    public void onStop(Player player) {
        System.out.println("Vous êtes sur une " + this.getClass().getName());
    }

    public Tile getNextTile() {
        return null;
    }

    public void onPass(Player player) {
    }

}
