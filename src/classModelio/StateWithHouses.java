package classModelio;

public class StateWithHouses extends PropertyState {

    @Override
    public int buyHouse(Player player) {
        int constructionCost = this.streetTile.getConstructionCost();
        if(player.getMoney() >= constructionCost){
            this.streetTile.addHouse();
            player.pay(constructionCost);
            if(this.streetTile.getNbHouses() == 5){
                this.streetTile.setPropertyState(new StateWithHotel());
                return 1;
            }
            return 0;
        }else {
            System.out.println(" Vous n'avez pas assez d'argent !");
            return -1;
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
