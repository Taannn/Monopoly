package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateBought extends PropertyState {

    public StateBought(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 0;
    }
    @Override
    public void becomeConstructible() {
        this.streetTile.setPrice(this.streetTile.getPrice() * 2);
        this.streetTile.setPropertyState(new StateConstructible(this.streetTile));
    }

    @Override
    public void sellProperty(Player owner, Player newOwner) {
        if(newOwner.getMoney() > this.streetTile.buyingCost){
            owner.sell(newOwner, this.streetTile);
        } else {
            System.out.println(" Le joueur n'a pas assez pour l'acheter");
        }
    }

    @Override
    public void onStop(Player player) {
        if ( this.streetTile.owner != player){
            System.out.println("Vous devez payer " + this.streetTile.getPrice());
            int paidPrice = player.pay(this.streetTile.getPrice());
            this.streetTile.owner.addMoney(paidPrice);
        }
    }
}
