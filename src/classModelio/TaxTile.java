package classModelio;

public class TaxTile extends Tile {
    private String name;

    private int taxPrice;

    @Override
    public void onStop(Player player) {
        System.out.println("Vous devez payer " + this.taxPrice + " à cause de " + this.name);
        player.pay(this.taxPrice);
    }
}
