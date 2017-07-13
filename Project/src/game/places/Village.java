package game.places;

import ui.UI;
import ui.place.VillageUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Village extends AbstractPlace {
    private static Village ourInstance = new Village();

    public static Village getInstance() {
        return ourInstance;
    }

    private Village() {
        super(     );
    }

    public void goToMarket() {
        return;
    }

    public void goToGym() {
        return;
    }

    public void goToRanch() {
        return;
    }

    public void goToClinic() {
        return;
    }

    public void goToLaboratory() {
        return;
    }

    public void goToCafe() {
        return;
    }

    public void goToWorkshop() {
        return;
    }


    @Override
    public UI getUI() {
        return new VillageUI();
    }
}
