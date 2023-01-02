import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e865ff68-bbe0-42ef-bf1f-9089eb6db8e9")
public abstract class Tile {
    @objid ("0547281b-ba21-4afb-87d6-4abc87a2675d")
    private Tile nextTile;

    @objid ("faf01275-b536-47c8-b7bc-f725850b5894")
    public void onStop(Player player) {
    }

    @objid ("dffbc585-30c3-4652-a3cf-acd7bd93c530")
    public Tile getNextTile() {
    }

    @objid ("edd32856-6cc8-4238-a065-882da139b8be")
    public void onPass(Player player) {
    }

}
