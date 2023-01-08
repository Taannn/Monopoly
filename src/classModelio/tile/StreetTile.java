package classModelio.tile;

import classModelio.Player;
import classModelio.stateTiles.PropertyState;
import classModelio.stateTiles.StateNotBought;
import classModelio.district.StreetDistrict;

public class StreetTile extends PropertyTile {
    private final int constructionCost;

    private int nbHouses = 0;

    private final int[] listPrices;

    private PropertyState propertyState;

    public StreetTile(String name, StreetDistrict district, int buyingCost, int constructionCost, Tile nextTile, int[] listPrices) {
        this.setName(name);
        this.setNextTile(nextTile);
        this.setBuyingCost(buyingCost);
        this.setDistrict(district);
        this.constructionCost = constructionCost;
        this.listPrices = listPrices;
        this.propertyState = new StateNotBought(this);

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
        }
    }

    public void setPropertyState(PropertyState state) {
        this.propertyState = state;
    }

    public void sellProperty(Player newOwner) {
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

    public int getPriceFromList(int index) {
        return listPrices[index];
    }
}
