import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("27dfd1ce-eb2a-423d-ad80-6e49f0f2682d")
public class Monopoly {
    @objid ("ba2e9cea-6859-41d1-87d4-f586a705d930")
    private int nbHouses;

    @objid ("4cc0e481-6633-43bd-a614-72cc47f5c843")
    private int nbHotels;

    @objid ("b3726974-67d6-4e46-9e76-7b2360b194a0")
    private List<Player> players = new ArrayList<Player> ();

    @objid ("17ca4d37-c7ea-48d7-ae39-d315ea941a6e")
    private Player currentPlayer;

    @objid ("0e041e6b-4c60-4da4-9087-25dc6389efbb")
    private Board board;

    @objid ("cda9fcc3-eabe-417e-a82d-82a121813b9f")
    public void rollDice() {
    }

    @objid ("0540c8c7-5534-4342-b4fc-af96c08aed68")
    public void buyProperty() {
    }

    @objid ("4f29b055-56f4-4a21-8a8d-3c30e286ada9")
    public void buyHouse(StreetTile streetTile) {
    }

    @objid ("b49bab4e-7c5e-417f-9cf2-446fe90c4b6b")
    public void addHouses(int nbHouses) {
    }

    @objid ("562ac888-5ac1-413d-b175-4b40a6cfc49f")
    public void addHotels(int nbHotels) {
    }

}
