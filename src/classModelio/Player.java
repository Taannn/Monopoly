import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cee2bf27-86e9-4170-baa8-ef8f81852520")
public class Player {
    @objid ("e9f59498-35c8-4284-8ca3-c8f27154eb34")
    private String name;

    @objid ("7f0d3feb-401e-46f9-94d1-11b66af983f6")
    private int money;

    @objid ("47447d28-293c-4124-886e-f67a2c6f8c6d")
    private char pawn;

    @objid ("52f896b4-11c7-4393-961f-4e60a788944c")
    private boolean isBankrupt;

    @objid ("5328a731-c77a-4d36-8a3c-5e9aad9e2920")
    private List<PropertyTile> propertyTiles = new ArrayList<PropertyTile> ();

    @objid ("cc966376-26a0-4ab5-9327-14e268904d24")
    private Tile tile;

    @objid ("29c4a554-447b-4853-920f-ea95ac834465")
    public void sell(Player player, PropertyTile property) {
    }

    @objid ("d55b5b8f-697a-45a5-992c-0f9948098ea1")
    public void addPropertyTile(PropertyTile property) {
    }

    @objid ("cc729d1e-37a3-491c-aa15-3be3e4ceb910")
    public void advance(int nbTiles) {
    }

    @objid ("3020fe83-c2f9-44d2-a85d-edc6b8e31a11")
    public void setTile(String tile) {
    }

    @objid ("42272885-2b5c-407e-92e0-9fc7bfbfe5c1")
    public void addPropertyCurrentTile() {
    }

    @objid ("4249a7be-0d5f-4ec0-8e77-08ddf8316b8a")
    public void pay(int price) {
    }

    @objid ("05268b6c-92e8-4e2e-88ee-b2face19cd9e")
    public void addMoney(int moneyToAdd) {
    }

    @objid ("5c9aaac7-02f6-4689-b936-45b65b157f21")
    public void buyCurrentTile() {
    }

    @objid ("cc4f2b38-397e-4321-ae59-f07583c42ec5")
    public void setIsBankrupt(boolean isBankrupt) {
    }

}
