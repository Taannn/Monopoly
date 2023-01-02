import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e6ad2929-b847-469d-9c02-ddcc00beb13b")
public abstract class PropertyTile extends Tile {
    @objid ("27cc14c1-791d-400a-8ff5-be9386ad849a")
    private String name;

    @objid ("55195c7e-8240-4dd6-848e-a4a82ba9165a")
    private int buyingCost;

    @objid ("c6fc2110-d12f-42e7-9d6c-a530d04040d1")
    private int price;

    @objid ("51db3d2c-29a2-4b25-86b1-4b1db897386a")
    private Player owner;

    @objid ("77a92a4a-7d67-4c20-92fc-6a0e84e13fea")
    private District district;

    @objid ("9b0b51fd-272f-4781-91d6-21c4e179f84f")
    public void buy(Player newOwner) {
    }

    @objid ("6a3e11df-0a5d-472c-bb2e-36e8c4ff5078")
    public void setOwner(Player player) {
    }

    @objid ("1401bfac-8d2c-4b86-88d4-b9eac9fe765e")
    public int getPrice() {
    }

    @objid ("f766361b-494a-46a2-acae-c9068381eff0")
    public void setPrice(int newPrice) {
    }

}
