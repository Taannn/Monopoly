package classModelio;

public class StateBought extends PropertyState {

    public StateBought(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 0;

    }

    @Override
    public void becomeConstructible() {
        this.streetTile.setPropertyState(new StateConstructible(this.streetTile));
    }
}
