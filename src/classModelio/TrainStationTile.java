package classModelio;

public class TrainStationTile extends PropertyTile {

    private int[] listPrices = new int[4];

    public TrainStationTile(String name, Tile nextTile){
        this.name = name;
        this.nextTile = nextTile;
        this.buyingCost = 200;
    }

    public int getListPricesByIndex(int index) {
        return listPrices[index];
    }

    public void onStop(Player player) {
        if(player != owner) {
            int paidPrice = player.pay(this.getPrice());
            this.owner.addMoney(paidPrice);
        }
    }

}
