package classModelio;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private StartTile startTile;

    private List<District> districts = new ArrayList<District> ();

    public StartTile getStartTile() {
        return startTile;
    }

    public List<District> getDistricts() {
        return districts;
    }
}
