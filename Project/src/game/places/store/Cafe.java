package game.places.store;

import game.places.AbstractPlace;
import ui.UI;
import ui.place.CafeUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Cafe extends AbstractPlace {
    private static Cafe ourInstance = new Cafe();

    public static Cafe getInstance() {
        return ourInstance;
    }

    private Cafe() {
        super(     );
    }

    public void interactWithMissionBoard() {
        return;
    }

    public void interactWithDiningTable() {
        return;
    }


    @Override
    public UI getUI() {
        return new CafeUI();
    }
}
