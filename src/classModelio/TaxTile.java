package classModelio;

public class TaxTile extends Tile {

    private int taxPrice;

    public TaxTile(String name, int taxPrice, Tile nextTile){
        this.name = name;
        this.nextTile = nextTile;
        this.taxPrice = taxPrice;
    }

    @Override
    public void onStop(Player player) {
        System.out.println("Vous devez payer " + this.taxPrice + " à cause de " + this.name);
        player.pay(this.taxPrice);
    }
}
