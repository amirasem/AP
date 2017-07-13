package game.places.store;

import game.places.AbstractPlace;
import ui.UI;
import ui.place.WorkshopUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Workshop extends AbstractPlace {
    private static Workshop ourInstance = new Workshop();

    public static Workshop getInstance() {
        return ourInstance;
    }

    private Workshop() {
        super();
    }

    @Override
    public UI getUI() {
        return new WorkshopUI();
    }
}
