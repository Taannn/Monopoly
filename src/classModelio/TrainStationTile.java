package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainStationTile extends PropertyTile {

    public TrainStationTile(String name, Tile nextTile, TrainStationDistrict district){
        this.name = name;
        this.nextTile = nextTile;
        this.buyingCost = 200;
        this.district = district;
        district.addTrainStationTile(this);
    }

}
