package classModelio;

public class StateWithHotel extends PropertyState {

    @Override
    public void onStop(Player player) {
        if ( this.streetTile.owner != player){
            System.out.println("Vous devez payer " + this.streetTile.getPrice());
            int paidPrice = player.pay(this.streetTile.getPrice());
            this.streetTile.owner.addMoney(paidPrice);
        }
    }
}
