package classModelio;

public class StateNotBought extends PropertyState {

    @Override
    public void buy(Player player) {
        player.pay(this.streetTile.buyingCost);
        this.streetTile.setOwner(player);
        player.addPropertyTile(this.streetTile);
        this.streetTile.setPropertyState(new StateBought(this.streetTile));
    }
}
