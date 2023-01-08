package classModelio.tile;

import classModelio.Player;
import classModelio.district.District;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class PropertyTile extends Tile {

    private int buyingCost;
    private int price;
    private Player owner;
    private District district;

    public void buy(Player newOwner) {
        if(newOwner.getMoney() > this.buyingCost){
            newOwner.pay(this.buyingCost);
            newOwner.addPropertyTile(this);
            this.owner = newOwner;
            district.checkDistrict(newOwner);
        }else {
            System.out.println("Vous n'avez pas assez d'argent.");
        }
    }

    @Override
    public void onStop(Player player) {
        if (owner == null){
            System.out.println("Voulez-vous acheter " + this.getName() + " pour " + this.getBuyingCost() + " ? ( y / n ) ");
            String response;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                response  = br.readLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(response.equals("y") || response.equals("Y")) {
                buy(player);
            }
        }else if(player != owner) {
            int paidPrice = player.pay(this.getPrice());
            this.owner.addMoney(paidPrice);
        }
    }

    public void reset() {
        //TODO
        this.price = 0;
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

    public District getDistrict() {
        return this.district;
    }

    public int getBuyingCost() {
        return buyingCost;
    }

    public void setBuyingCost(int buyingCost) {
        this.buyingCost = buyingCost;
    }
    public void setDistrict(District district) {
        this.district = district;
    }
}
