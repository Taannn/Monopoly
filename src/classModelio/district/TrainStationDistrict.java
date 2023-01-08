package classModelio.district;

import classModelio.Player;
import classModelio.tile.TrainStationTile;

import java.util.ArrayList;
import java.util.List;

public class TrainStationDistrict implements District {
    private final List<TrainStationTile> trainTiles = new ArrayList<>();

    private final int[] listPrices = {50,100,150,200};

    public TrainStationDistrict() {}
    public void addTrainStationTile(TrainStationTile tile){
        trainTiles.add(tile);
    }

    public void checkDistrict(Player player) {
        int price = listPrices[getNbProperties(player) - 1];
        for (TrainStationTile trainTile : trainTiles) {
            if(trainTile.getOwner() == player){
                trainTile.setPrice(price);
            }
        }
    }

    public int getNbProperties(Player player) {
        int nb = 0;
        for (TrainStationTile tile: this.trainTiles) {
            if(tile.getOwner() == player) nb++;
        }
        return nb;
    }
}
