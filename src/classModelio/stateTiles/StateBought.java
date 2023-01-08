package classModelio.stateTiles;

import classModelio.Player;
import classModelio.tile.StreetTile;

public class StateBought extends PropertyState {

    public StateBought(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 0;
    }
    @Override
    public void becomeConstructible() {
        this.streetTile.setPropertyState(new StateConstructible(this.streetTile));
    }

    @Override
    public void sellProperty(Player owner, Player newOwner) {
        if(newOwner.getMoney() > this.streetTile.getBuyingCost()){
            owner.sell(newOwner, this.streetTile);
        } else {
            System.out.println(" Le joueur n'a pas assez pour l'acheter");
        }
    }

    @Override
    public void onStop(Player player) {
        if ( this.streetTile.getOwner() != player){
            int paidPrice = player.pay(this.streetTile.getPriceFromList(indexPrice));
            this.streetTile.getOwner().addMoney(paidPrice);
        }
    }
}
