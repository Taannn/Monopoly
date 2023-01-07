import classModelio.*;

public class Main {
    public static void main(String[] args) {

        Player luc = new Player("Luc",'L');
        Player paul = new Player("Paul",'P');
        Player theo = new Player("Théo",'T');

        StreetDistrict purple = new StreetDistrict("purple");
        StreetDistrict lightBlue = new StreetDistrict("lightBlue");
        StreetDistrict pink = new StreetDistrict("pink");
        StreetDistrict orange = new StreetDistrict("orange");
        StreetDistrict red = new StreetDistrict("red");
        StreetDistrict yellow = new StreetDistrict("yellow");
        StreetDistrict green = new StreetDistrict("green");
        StreetDistrict darkBlue = new StreetDistrict("darkBlue");

        StartTile start = new StartTile();

        StreetTile boardWalk = new StreetTile("Board Walk",darkBlue,400,200,start, new int[]{50, 200, 600, 1400, 1700, 2000});

    }

}