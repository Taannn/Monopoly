package classModelio;

public abstract class PropertyTile extends Tile {

    private String name;

    private int buyingCost;

    private int price;

    private Player owner;

    private District district;

    public void buy(Player newOwner) {
    }

    public void setOwner(Player player) {
    }

    public int getPrice() {
        return 1;
    }

    public void setPrice(int newPrice) {
    }

}
