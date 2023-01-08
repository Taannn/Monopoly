package classModelio;

import java.util.ArrayList;
import java.util.List;

public class PublicServiceDistrict implements District {
    private List<PublicServiceTile> publicServicesTiles = new ArrayList<>();
    private final int[] listMultiplicators = {4,10};
    public PublicServiceDistrict() {}
    public void addPublicServiceTile(PublicServiceTile tile){
        publicServicesTiles.add(tile);
    }
    public void checkDistrict(Player player) {
        int multiplicator = listMultiplicators[getNbProperties(player)];
        for (PublicServiceTile publicServicesTile : publicServicesTiles) {
            if(publicServicesTile.owner == player){
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
