package game.places;

import ui.UI;
import ui.place.FarmUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Farm extends AbstractPlace {

    private static Farm ourInstance = new Farm();

    public static Farm getInstance() {
        return ourInstance;
    }

    private Farm() {
        super();
    }

    @Override
    public UI getUI() {
        return new FarmUI();
    }
}
