package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetTile extends PropertyTile {
    private int constructionCost;

    private int nbHouses = 0;

    private int[] listPrices;

    protected PropertyState propertyState;

    public StreetTile( String name, StreetDistrict district, int buyingCost, int constructionCost, Tile nextTile, int[] listPrices) {
        this.name = name;
        this.district = district;
        this.buyingCost = buyingCost;
        this.constructionCost = constructionCost;
        this.nextTile = nextTile;
        this.listPrices = listPrices;
        this.propertyState = new StateNotBought();

        district.addStreetTile(this);
    }

    public void becomeConstructible() {
        this.propertyState.becomeConstructible();
    }

    public void becomeBought() {
        this.propertyState.becomeBought();
    }

    public int getNbHouses() {
        return this.nbHouses;
    }

    public void addHouse() {
        if(this.nbHouses < 5) {
            this.nbHouses += 1;
            this.price = this.listPrices[this.nbHouses];
        }
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
    public void onStop(Player player) {
        this.propertyState.onStop(player);
    }

    public int getConstructionCost() {
        return constructionCost;
    }

    public int buyHouse(Player player) {
        return this.propertyState.buyHouse(player);
    }
}
