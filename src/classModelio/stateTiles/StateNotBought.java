package classModelio.stateTiles;

import classModelio.Player;
import classModelio.tile.StreetTile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateNotBought extends PropertyState {


    public StateNotBought(StreetTile streetTile) {
        this.streetTile = streetTile;
    }

    @Override
    public void buy(Player player) {
        player.pay(this.streetTile.getBuyingCost());
        this.streetTile.setOwner(player);
        player.addPropertyTile(this.streetTile);
        this.streetTile.setPropertyState(new StateBought(this.streetTile));
        this.streetTile.getDistrict().checkDistrict(player);
    }

    @Override
    public void onStop(Player player) {
        System.out.println("Voulez-vous acheter " + this.streetTile.getName() + " pour " + this.streetTile.getBuyingCost() + " € ? ( y / n ) ");
        String response;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            response  = br.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(response.equals("y") || response.equals("Y")) {
            buy(player);
        }
    }
}
