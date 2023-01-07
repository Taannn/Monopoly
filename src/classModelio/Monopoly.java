package classModelio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Monopoly {

    private int nbHouses = 32;

    private int nbHotels = 12;

    private List<Player> players;

    private Player currentPlayer;

    private Board board;

    public Monopoly(List<Player> players, Board board) {
        if(!players.isEmpty()){
            this.board = board;
            this.players = players;
            for (Player player : players) {
                player.setTile(board.getStartTile());
            }
        }

        startGame();
    }

    public int rollDice() {
        int diceResult = new Random().nextInt(11) + 1;
        System.out.println(currentPlayer.toString() + "a fait" + diceResult);
        currentPlayer.advance(diceResult);
        return diceResult;
    }

    public void buyConstruction(StreetTile streetTile) {
        if ( streetTile.getNbHouses() == 4 && nbHotels > 0){
            if ( streetTile.buyHouse(currentPlayer) == 1 ) nbHotels--;
        } else if (nbHouses > 0 && streetTile.getNbHouses() < 4){
            if ( streetTile.buyHouse(currentPlayer) == 0 ) nbHouses--;
        }else {
            System.out.println("Tu ne peux pas construire.");
            System.out.println("Il reste " + nbHotels + " hotels et " + nbHouses + " maisons.");
        }
    }

    public void startGame() {
        while (players.size() != 1) {
            for (Player player : this.players) {
                currentPlayer = player;
                int dice = rollDice();
                System.out.println(currentPlayer.getName() + " a fait " + dice + " aux dés.");
                System.out.println(currentPlayer.getName() + "tombe sur la case " + currentPlayer.getTile().getName());

                currentPlayer.getTile().onStop(currentPlayer);
                System.out.println("Voici votre solde : " + player.getMoney() + " €");

                if(player.isBankrupt()){
                    players.remove(player);
                }else{
                    manageProperties(currentPlayer);
                }

                System.out.println("Vous avez donc " + player.getMoney() + " €");
            }
        }
    }

    public void manageProperties(Player player) {
        int i = 0;
        for (PropertyTile propertyTile : player.getPropertyTiles()) {
            if(propertyTile.getClass().getName().equals("StreetTile")){
                System.out.println(i + " : " + propertyTile.getName());
            }
            i++;
        }

        String answer = "0";
        while(!answer.equals("-1")) {
            System.out.println("Souhaitez vous construire sur une de vos propriétés ? Si oui donner le numéro correspondant ou -1 pour quitter");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                answer  = br.readLine();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(!Objects.equals(answer, "-1")){
                int answerInt = Integer.parseInt(answer);
                if(answerInt >= 0 && answerInt < player.getPropertyTiles().size()){
                    PropertyTile propertyTile = player.getPropertyTiles().get(answerInt);
                    this.buyConstruction((StreetTile) propertyTile);
                }
            }

            System.out.println("Il vous reste " + player.getMoney() + " €");
        }

    }

}
