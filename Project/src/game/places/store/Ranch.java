package game.places.store;

import game.places.AbstractPlace;
import ui.UI;
import ui.place.RanchUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Ranch extends AbstractPlace {
    private static Ranch ourInstance = new Ranch();

    public static Ranch getInstance() {
        return ourInstance;
    }

    private Ranch() {
        super();
    }

    @Override
    public UI getUI() {
        return new RanchUI();
    }
}
