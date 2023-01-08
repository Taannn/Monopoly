package classModelio.tile;

import classModelio.district.TrainStationDistrict;

public class TrainStationTile extends PropertyTile {

    public TrainStationTile(String name, Tile nextTile, TrainStationDistrict district){
        this.setName(name);
        this.setNextTile(nextTile);
        this.setBuyingCost(200);
        this.setDistrict(district);
        district.addTrainStationTile(this);
    }

}
