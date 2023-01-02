package classModelio;

@objid ("6d7b696e-d5de-4e4d-a6a1-b249d8bfeb65")
public class StreetTile extends PropertyTile {
    @objid ("27f9272c-dca9-4b2e-9964-5b9013fc91f5")
    private int constructionCost;

    @objid ("e6580de3-6d8a-4d50-86e7-5705e0ca101a")
    private int nbHouses;

    @objid ("1fd7410e-0159-4d07-98cc-c12e8b7288f7")
    private int[] listPrices = new int[7];

    @objid ("f6c02ac9-0824-4da9-b05f-041862bc5fa0")
    private PropertyState propertyState;

    @objid ("1324a765-b9da-43a6-900b-4850f4df598f")
    public void buyHouse() {
    }

    @objid ("e5daa000-f87b-4006-9422-ef775e05854d")
    public void newOwner() {
    }

    @objid ("f23641ba-1825-43da-8d43-565b2de2bdfe")
    public void sellHouse() {
    }

    @objid ("3d03e1a2-761f-4d2c-8d2a-b2fc4485a023")
    public void becomeConstructible() {
    }

    @objid ("36540a49-aa93-4589-900c-d46cd7f74127")
    public int getNbHouses() {
    }

    @objid ("fb339f8b-5232-4367-8269-735ef87646b4")
    public void sellProperty(Player newOwner) {
    }

    @objid ("f032ef7d-cec7-4278-b28c-85203e90a966")
    public int getListPricesByIndex(int index) {
    }

}
