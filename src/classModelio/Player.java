package classModelio;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private int money;

    private char pawn;

    private boolean isBankrupt = false;

    private List<PropertyTile> propertyTiles = new ArrayList<PropertyTile> ();

    private Tile tile = null;

    public Player( String name, char pawn) {
        this.name = name;
        this.pawn = pawn;
        this.money = 1500;
    }

    public void sell(Player newOwner, PropertyTile property) {
        int find = this.propertyTiles.indexOf(property);
        if (find != -1) {
            this.propertyTiles.remove(property);
            newOwner.addPropertyTile(property);
            property.setOwner(newOwner);
        }
    }

    public void addPropertyTile(PropertyTile property) {
        this.propertyTiles.add(property);
    }

    public void advance(int nbTiles) {
        for (int i = 0; i < nbTiles; i++) {
            this.tile = this.tile.getNextTile();
            tile.onPass(this);
        }
    }

    public int pay(int price) {
        if((money-price) <= 0) {
            setIsBankrupt();
            price = money;
            money = 0;
        }else{
            money -= price;
        }
        return price;
    }

    public void addMoney(int moneyToAdd) { this.money+=moneyToAdd; }

    public void setIsBankrupt() {
        for (PropertyTile propertyTile : propertyTiles) {
            propertyTile.reset();
        }
        this.isBankrupt = true;
    }

    public int getMoney() {
        return this.money;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public List<PropertyTile> getPropertyTiles() {
        return propertyTiles;
    }

    public boolean isBankrupt() {
        return isBankrupt;
    }

    public String getName() {
        return name;
    }

    public Tile getTile() {
        return tile;
    }
}
