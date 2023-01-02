package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetTile extends PropertyTile {
    private int constructionCost;

    private int nbHouses;

    private int[] listPrices;

    protected PropertyState propertyState;

    public StreetTile() {
        this.propertyState = new StateNotBought();
    }

    public void buyHouse() {
        // TODO
    }

    public void newOwner() {
        // TODO
    }

    public void sellHouse() {
        // TODO
    }

    public void becomeConstructible() {
        this.propertyState.becomeConstructible();
    }

    public int getNbHouses() {
        return this.nbHouses;
    }

    public void setPropertyState(PropertyState state) {
        this.propertyState = state;
    }

    public void sellProperty(Player newOwner) {
    }

    public int getListPricesByIndex(int index) {
        return this.listPrices[index];
    }

    @Override
    public void buyingHandler(Player player) {
        this.propertyState.buy(player);
        this.getDistrict().checkDistrict(player);
    }

}
