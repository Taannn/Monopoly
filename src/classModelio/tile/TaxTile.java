package classModelio.tile;

import classModelio.Player;

public class TaxTile extends Tile {

    private final int taxPrice;

    public TaxTile(String name, int taxPrice, Tile nextTile){
        this.setName(name);
        this.setNextTile(nextTile);
        this.taxPrice = taxPrice;
    }

    @Override
    public void onStop(Player player) {
        System.out.println("Vous devez payer " + this.taxPrice + " à cause de " + this.getName());
        player.pay(this.taxPrice);
    }
}
