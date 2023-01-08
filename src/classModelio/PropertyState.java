package classModelio;

public abstract class PropertyState {
    protected int indexPrice;

    protected StreetTile streetTile;

    public void buy(Player player) {
    }

    public void sellProperty(Player owner, Player newOwner) {
    }

    public int buyHouse(Player player) {
        System.out.println("Vous ne pouvez pas acheter de maison sur ce terrain.");
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
