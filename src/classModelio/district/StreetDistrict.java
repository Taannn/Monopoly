package classModelio.district;

import classModelio.Player;
import classModelio.tile.StreetTile;

import java.util.ArrayList;
import java.util.List;

public class StreetDistrict implements District {

    private String color;
    private final List<StreetTile> streetTiles = new ArrayList<>();

    public StreetDistrict(String color) {

    }

    public void addStreetTile(StreetTile tile){
        streetTiles.add(tile);
    }

    public void checkDistrict(Player player) {
        if(this.checkOwner(player)) {
            this.makeDistrictConstructible();
        }else {
            this.makeDistrictBought();
        }
    }


    private boolean checkOwner(Player player) {
        return this.getNbProperties(player) == this.streetTiles.size();
    }


    private void makeDistrictConstructible() {
        for (StreetTile tile : this.streetTiles) {
            tile.becomeConstructible();
        }
    }

    private void makeDistrictBought() {
        for (StreetTile tile : this.streetTiles) {
            tile.becomeBought();
        }
    }


    public int getNbProperties(Player player) {
        int nb = 0;
        for (StreetTile tile: this.streetTiles) {
            if(tile.getOwner() == player) nb++;
        }
        return nb;
    }
}
