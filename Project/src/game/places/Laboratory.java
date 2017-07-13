package game.places;

import ui.UI;
import ui.place.LaboratoryUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Laboratory extends AbstractPlace {

    private static Laboratory ourInstance = new Laboratory();

    public static Laboratory getInstance() {
        return ourInstance;
    }

    private Laboratory() {
        super(     );
    }

    @Override
    public UI getUI() {
        return new LaboratoryUI();
    }
}
