package classModelio;

public class PublicServiceTile extends PropertyTile {

    private int multiplicator;
    private int[] listMultiplicators = new int[2];

    public PublicServiceTile(String name, Tile nextTile){
        this.name = name;
        this.nextTile = nextTile;
        this.buyingCost = 150;
    }

    public int rollDice() {
        return multiply((int)(Math.random()*12+1));
    }

    public int multiply(int value) {
        return value*multiplicator;
    }

    public void setMultiplicatore(int multiplicator) {
        this.multiplicator = multiplicator;
    }

    public int getListMultiplicatorsByIndex(int index) {
        return this.listMultiplicators[index];
    }

    @Override
    public int getPrice() {
        return this.rollDice();
    }
}
