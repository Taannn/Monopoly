package classModelio;

import java.util.ArrayList;
import java.util.List;

public class StreetDistrict implements District {

    private List<StreetTile> streetTiles = new ArrayList<StreetTile>();

    public void checkDistrict(Player player) {
        if(this.checkOwner(player)) {
            this.makeDistrictConstructible();
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


    public int getNbProperties(Player player) {
        int nb = 0;
        for (StreetTile tile: this.streetTiles) {
            if(tile.getOwner() == player) nb++;
        }
        return nb;
    }
}
