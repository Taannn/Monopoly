import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8e6fe878-6aa8-413e-82c5-d04bc67e6e68")
public abstract class PropertyState {
    @objid ("cdfcfe96-cb5b-4c4f-a7c2-268b1bdf36c7")
    private int indexPrice;

    @objid ("7f08ec01-f5d0-4268-a0f9-bd57238280cd")
    private StreetTile streetTile;

    @objid ("5a596fc6-7dc0-42c3-a365-0e39472b98f9")
    public void buy(Player player) {
    }

    @objid ("405f6118-a3e7-4dc1-9183-66c0efc607f5")
    public void sellProperty(Player newOwner) {
    }

    @objid ("b459f669-77f9-437d-966a-5705132cbf88")
    public void buyHouse() {
    }

    @objid ("e1d25446-ed6a-4145-95bb-9e1e7badb2bd")
    public void sellHouse() {
    }

    @objid ("07b07b97-aae4-493b-9e2f-c897bb9be3ee")
    public void becomeConstuctible() {
    }

    @objid ("7071f135-1ce4-4496-9e51-e0f1ff871e2b")
    public void setPrice(int newPrice) {
    }

}
