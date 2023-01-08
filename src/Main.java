import classModelio.*;
import classModelio.district.PublicServiceDistrict;
import classModelio.district.StreetDistrict;
import classModelio.district.TrainStationDistrict;
import classModelio.tile.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Luc",'L'));
        players.add(new Player("Paul",'P'));
        players.add(new Player("Théo",'T'));

        StreetDistrict purple = new StreetDistrict("purple");
        StreetDistrict lightBlue = new StreetDistrict("lightBlue");
        StreetDistrict pink = new StreetDistrict("pink");
        StreetDistrict orange = new StreetDistrict("orange");
        StreetDistrict red = new StreetDistrict("red");
        StreetDistrict yellow = new StreetDistrict("yellow");
        StreetDistrict green = new StreetDistrict("green");
        StreetDistrict darkBlue = new StreetDistrict("darkBlue");

        TrainStationDistrict trainStationDistrict = new TrainStationDistrict();

        PublicServiceDistrict publicServiceDistrict = new PublicServiceDistrict();


        StartTile start = new StartTile();

        StreetTile boardWalk = new StreetTile("Board Walk",darkBlue,400,200,start, new int[]{50, 200, 600, 1400, 1700, 2000});

        TaxTile luxuryTaxTile = new TaxTile("Luxury Tax", 100 , boardWalk);

        StreetTile parkPlace = new StreetTile("Park Place",darkBlue,350,200,luxuryTaxTile, new int[]{35, 175, 500, 1100, 1300, 1500});

        LuckTile luckTile6 = new LuckTile(parkPlace);

        TrainStationTile shortLine = new TrainStationTile("Short Line", luckTile6, trainStationDistrict);

        StreetTile penAvenue = new StreetTile("Pennsylvania Avenue", green, 320, 200, shortLine, new int[]{28, 150, 450, 1000, 1200, 1400});

        LuckTile luckTile5 = new LuckTile(penAvenue);

        StreetTile northCarAvenue = new StreetTile("North Carolina Avenue", green, 300, 200, luckTile5, new int[]{26, 130, 390, 900, 1100, 1275});

        StreetTile pacificAvenue = new StreetTile("Pacific Avenue", green, 300, 200, northCarAvenue, new int[]{26, 130, 390, 900, 1100, 1275});

        GoToJailTile goToJail = new GoToJailTile(pacificAvenue);

        StreetTile marvinGardens = new StreetTile("Marvin Gardens", yellow, 260, 150, goToJail, new int[]{24, 120, 360, 850, 1025, 1200});

        PublicServiceTile waterWorks = new PublicServiceTile("Water Works", marvinGardens, publicServiceDistrict);

        StreetTile ventnorAvenue = new StreetTile("Ventnor Avenue", yellow, 260, 150, waterWorks, new int[]{22, 110, 330, 800, 975, 1150});

        StreetTile atlanticAvenue = new StreetTile("Atlantic Avenue", yellow, 260, 150, ventnorAvenue,new int[]{22, 110, 330, 800, 975, 1150});

        TrainStationTile bORailroad = new TrainStationTile("B & O Railroad", atlanticAvenue, trainStationDistrict);

        StreetTile illinoisAvenue = new StreetTile("Illinois Avenue", red, 240, 150, bORailroad, new int[]{20, 100, 300, 750, 925, 1100});

        StreetTile indianaAvenue = new StreetTile("Indiana Avenue", red, 220, 150, illinoisAvenue, new int[]{18, 90, 250, 700, 875, 1050});

        LuckTile luckTile4 = new LuckTile(indianaAvenue);

        StreetTile kentuckyAvenue = new StreetTile("Kentucky Avenue", red, 220, 150, luckTile4, new int[]{18,90,250,700,875,1050});

        ParkTile parkTile = new ParkTile(kentuckyAvenue);

        StreetTile newYorkAvenue = new StreetTile("New York Avenue", orange, 180, 100, parkTile, new int[]{16, 80, 220, 600, 800, 1000});

        StreetTile tenesseeAvenue = new StreetTile("Tennessee Avenue", orange, 180, 100, newYorkAvenue, new int[]{14,70,200,550,750,950});

        LuckTile luckTile3 = new LuckTile(tenesseeAvenue);

        StreetTile stJamesPlace = new StreetTile("St James Place", orange, 180, 100, luckTile3, new int[]{14, 70, 200, 550, 750, 950});

        TrainStationTile penRailroad = new TrainStationTile("Pennsylvania Railroad", stJamesPlace, trainStationDistrict);

        StreetTile virginiaAvenue = new StreetTile("Virginia Avenue", pink,160, 100, penRailroad, new int[]{12, 60, 180, 500, 700, 900});

        StreetTile statesAvenue = new StreetTile("States Avenue", pink, 140, 100, virginiaAvenue, new int[]{10, 50, 150, 450, 625, 750});

        PublicServiceTile electricCompany = new PublicServiceTile("Electric Company", statesAvenue, publicServiceDistrict);

        StreetTile stCharlesPlace = new StreetTile("St. Charles Place", pink, 140, 100, electricCompany, new int[]{10, 50, 150, 450, 625, 750});

        InJailTile inJailTile = new InJailTile(stCharlesPlace);

        StreetTile connecticutAvenue = new StreetTile("Connecticut Avenue", lightBlue, 120, 50, inJailTile, new int[]{8, 40, 100, 380, 450, 600});

        StreetTile vermontAvenue = new StreetTile("Vermont Avenue", lightBlue, 100, 50, connecticutAvenue, new int[]{6, 30, 90, 270, 400, 550});

        LuckTile luckTile2 = new LuckTile(vermontAvenue);

        StreetTile orientalAvenue = new StreetTile("Oriental Avenue", lightBlue, 100, 50, luckTile2, new int[]{6, 30, 90,270,400,550});

        TrainStationTile readingRailroad = new TrainStationTile("Reading Railroad", orientalAvenue, trainStationDistrict);

        TaxTile incomeTax = new TaxTile("Income Tax", 200, readingRailroad);

        StreetTile balticAvenue = new StreetTile("Baltic Avenue", purple, 60, 50, incomeTax, new int[]{4, 20, 60, 180, 320, 450});

        LuckTile luckTile1 = new LuckTile(balticAvenue);

        StreetTile mediterraneanAvenue = new StreetTile("Mediterranean Avenue", purple, 60, 50, luckTile1, new int[]{4, 20, 60, 180, 320, 450});

        start.setNextTile(mediterraneanAvenue);

        Monopoly monopoly = new Monopoly(players, start);

        monopoly.toggleDebugMode();

        monopoly.startGame();
    }
}