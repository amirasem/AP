package ui.place;

import game.places.Place;
import game.places.store.Workshop;
import ui.UI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class WorkshopUI extends PlaceUI {

    public WorkshopUI() {
        super(Workshop.getInstance());
    }
}
