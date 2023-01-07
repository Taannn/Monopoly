package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateNotBought extends PropertyState {

    @Override
    public void buy(Player player) {
        player.pay(this.streetTile.buyingCost);
        this.streetTile.setOwner(player);
        player.addPropertyTile(this.streetTile);
        this.streetTile.setPropertyState(new StateBought(this.streetTile));
        this.streetTile.getDistrict().checkDistrict(player);
    }

    @Override
    public void onStop(Player player) {
        System.out.println("Voulez-vous acheter " + this.streetTile.name + " pour " + this.streetTile.getPrice() + " ? ( y / n ) ");
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
