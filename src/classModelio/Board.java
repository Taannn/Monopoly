import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a6709fef-5c10-4955-bc7d-40a50bc6040c")
public class Board {
    @objid ("3185e740-935f-4905-a350-6c5f983f4558")
    private StartTile startTile;

    @objid ("2809a757-8da9-47fc-8c95-89a5ee3cbcdf")
    private List<District> districts = new ArrayList<District> ();

}
