package classModelio.stateTiles;

import classModelio.Player;
import classModelio.tile.StreetTile;

public class StateConstructible extends PropertyState {
    public StateConstructible(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 0;
    }

    @Override
    public int buyHouse(Player player) {
        int constructionCost = this.streetTile.getConstructionCost();
        if(player.getMoney() >= constructionCost){
            this.streetTile.addHouse();
            player.pay(constructionCost);
            this.streetTile.setPropertyState(new StateWithHouses(this.streetTile));
            System.out.println("Vous avez acheté votre première maison sur " + this.streetTile.getName());
            return 0;
        }else {
            System.out.println(" Vous n'avez pas assez d'argent !");
            return -1;
        }
    }

    @Override
    public void becomeBought() {
        this.streetTile.setPropertyState(new StateBought(this.streetTile));
    }

    @Override
    public void sellProperty(Player owner, Player newOwner) {
        if(newOwner.getMoney() > this.streetTile.getBuyingCost()){
            owner.sell(newOwner, this.streetTile);
            this.streetTile.getDistrict().checkDistrict(owner);
        } else {
            System.out.println(" Le joueur n'a pas assez pour l'acheter");
        }
    }

    @Override
    public void onStop(Player player) {
        if ( this.streetTile.getOwner() != player){
            int paidPrice = player.pay(this.streetTile.getPriceFromList(indexPrice) * 2);
            this.streetTile.getOwner().addMoney(paidPrice);
        }
    }


}
