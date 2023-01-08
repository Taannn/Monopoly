package classModelio.district;

import classModelio.Player;
import classModelio.tile.PublicServiceTile;

import java.util.ArrayList;
import java.util.List;

public class PublicServiceDistrict implements District {
    private final List<PublicServiceTile> publicServicesTiles = new ArrayList<>();
    private final int[] listMultiplicators = {4,10};
    public PublicServiceDistrict() {}
    public void addPublicServiceTile(PublicServiceTile tile){
        publicServicesTiles.add(tile);
    }
    public void checkDistrict(Player player) {
        int multiplicator = listMultiplicators[getNbProperties(player) - 1];
        for (PublicServiceTile publicServicesTile : publicServicesTiles) {
            if(publicServicesTile.getOwner() == player){
                publicServicesTile.setMultiplicatore(multiplicator);
            }
        }
    }
    public int getNbProperties(Player player) {
        int nb = 0;
        for (PublicServiceTile tile: this.publicServicesTiles) {
            if(tile.getOwner() == player) nb++;
        }
        return nb;
    }
}
