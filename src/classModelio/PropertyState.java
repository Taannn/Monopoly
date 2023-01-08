package classModelio;

public abstract class PropertyState {
    protected int indexPrice;

    protected StreetTile streetTile;

    public void buy(Player player) {
    }

    public void sellProperty(Player owner, Player newOwner) {
    }

    public int buyHouse(Player player) {
        return -1;
    }

    public void sellHouse() {
    }

    public void becomeConstructible() {
    }

    public void onStop(Player player) {
    }

    public void becomeBought() {
    }
}
