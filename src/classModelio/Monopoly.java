package classModelio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monopoly {

    private int nbHouses;

    private int nbHotels;

    private List<Player> players = new ArrayList<Player> ();

    private Player currentPlayer;

    private Board board;

    public void rollDice() {
        int diceResult = new Random().nextInt(11) + 1;
        System.out.println(currentPlayer.toString() + "a fait" + diceResult);
        currentPlayer.advance(diceResult);
    }

    public void buyProperty() {
        // TODO
    }

    public void buyHouse(StreetTile streetTile) {
        // TODO
    }

    public void addHouses(int nbHouses) {
        // TODO
    }

    public void addHotels(int nbHotels) {
        // TODO
    }

}
