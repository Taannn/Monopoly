package classModelio.stateTiles;

import classModelio.Player;
import classModelio.tile.StreetTile;

public class StateWithHouses extends PropertyState {

    public StateWithHouses(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = this.streetTile.getNbHouses();
    }

    @Override
    public int buyHouse(Player player) {
        int constructionCost = this.streetTile.getConstructionCost();
        if(player.getMoney() >= constructionCost){
            this.streetTile.addHouse();
            indexPrice = this.streetTile.getNbHouses();
            player.pay(constructionCost);
            if(this.streetTile.getNbHouses() == 5){
                this.streetTile.setPropertyState(new StateWithHotel(this.streetTile));
                System.out.println("Vous avez acheté un hôtel sur " + this.streetTile.getName());
                return 1;
            }
            System.out.println("Vous avez acheté une maison sur " + this.streetTile.getName());
            return 0;
        }else {
            System.out.println(" Vous n'avez pas assez d'argent !");
            return -1;
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
