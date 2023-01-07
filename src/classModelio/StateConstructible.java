package classModelio;

public class StateConstructible extends PropertyState {
    public StateConstructible(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 1;
    }

    @Override
    public int buyHouse(Player player) {
        int constructionCost = this.streetTile.getConstructionCost();
        if(player.getMoney() >= constructionCost){
            this.streetTile.addHouse();
            player.pay(constructionCost);
            return 0;
        }else {
            System.out.println(" Vous n'avez pas assez d'argent !");
            return -1;
        }
    }

    @Override
    public void becomeBought() {
        this.streetTile.setPrice(this.streetTile.getPrice() / 2);
        this.streetTile.setPropertyState(new StateBought(this.streetTile));
    }

    @Override
    public void sellProperty(Player owner, Player newOwner) {
        if(newOwner.getMoney() > this.streetTile.buyingCost){
            owner.sell(newOwner, this.streetTile);
            this.streetTile.getDistrict().checkDistrict(owner);
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
