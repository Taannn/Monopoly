package classModelio;

public abstract class PropertyState {
    protected int indexPrice;

    protected StreetTile streetTile;

    public void buy(Player player) {
    }

    public void sellProperty(Player newOwner) {
    }

    public void buyHouse() {
    }

    public void sellHouse() {
    }

    public void becomeConstructible() {
    }

    public void setPrice(int newPrice) {
    }

    public int getRentPrice() {
        return this.streetTile.getListPricesByIndex(this.indexPrice);
    }

}
