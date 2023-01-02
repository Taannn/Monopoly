package classModelio;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private int money;

    private char pawn;

    private boolean isBankrupt;

    private List<PropertyTile> propertyTiles = new ArrayList<PropertyTile> ();

    private Tile tile;

    public void sell(Player player, PropertyTile property) {
        // TODO
    }

    public void addPropertyTile(PropertyTile property) {
        // TODO
    }

    public void advance(int nbTiles) {
        // TODO
    }

    public void setTile(String tile) {
        // TODO
    }

    public int pay(int price) {
        if((money-price) <= 0) {
            setIsBankrupt(true);
            price = money;
            money = 0;
        }else{
            money -= price;
        }
        return price;
    }

    public void addMoney(int moneyToAdd) {
        // TODO
    }

    public void setIsBankrupt(boolean isBankrupt) {
        // TODO
    }

    public int getMoney() {
        return this.money;
    }

}
