package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public abstract class PropertyTile extends Tile {

    protected int buyingCost;

    protected int price;

    protected Player owner;

    protected District district;

    public void buy(Player newOwner) {
    }

    public void reset() {
        //TODO
        this.price = 0;
    }

    public void setOwner(Player player) {
        this.owner = player;
    }

    public Player getOwner() {
        return this.owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    protected District getDistrict() {
        return this.district;
    }

}
