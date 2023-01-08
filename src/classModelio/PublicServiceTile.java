package classModelio;

public class PublicServiceTile extends PropertyTile {

    private int multiplicator;

    public PublicServiceTile(String name, Tile nextTile, PublicServiceDistrict district){
        this.name = name;
        this.nextTile = nextTile;
        this.buyingCost = 150;
        this.district = district;
        district.addPublicServiceTile(this);
    }

    public int rollDice() {
        int value = (int) ((Math.random() * 12) +1);
        System.out.println("Vous avez fait " + value);
        return multiply(value);
    }

    public int multiply(int value) {
        return value*multiplicator;
    }

    public void setMultiplicatore(int multiplicator) {
        this.multiplicator = multiplicator;
    }
    @Override
    public int getPrice() {
        return this.rollDice();
    }
}
