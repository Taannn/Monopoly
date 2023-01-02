package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public abstract class PropertyTile extends Tile {

    protected String name;

    protected int buyingCost;

    protected int price;

    protected Player owner;

    private District district;

    public void buy(Player newOwner) {
    }

    public void setOwner(Player player) {
        this.owner = player;
    }

    public Player getOwner() {
        return this.owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void buyTile(Player player) {
        System.out.println("Veux tu acheter " + this.name + " pour " + this.buyingCost + " ? (y/n)");
        String response;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            response  = br.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(response.equals("y") || response.equals("Y")) {
            if(player.getMoney() >= this.buyingCost) {
                this.buyingHandler(player);
            } else {
                System.out.println("Tu n'as pas assez d'argent !");
            }
        }
    }

    protected void buyingHandler(Player player) {
        player.pay(this.buyingCost);
        this.setOwner( player);
        this.getDistrict().checkDistrict(player);
    }

    protected District getDistrict() {
        return this.district;
    }

    @Override
    public void onStop(Player player) {
        if(this.owner != null) {
            if(player != this.owner) {
                int paidPrice = player.pay(getPrice());
                this.owner.addMoney(paidPrice);
            }
        }
    }

}
