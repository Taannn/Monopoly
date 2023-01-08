package classModelio;

public class StateWithHotel extends PropertyState {

    public StateWithHotel(StreetTile tile) {
        this.streetTile = tile;
        this.indexPrice = 5;
    }

    @Override
    public void onStop(Player player) {
        if ( this.streetTile.owner != player){
            int paidPrice = player.pay(this.streetTile.getPriceFromList(indexPrice));
            this.streetTile.owner.addMoney(paidPrice);
        }
    }
}
