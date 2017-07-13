package game.places.store;

import game.places.AbstractPlace;
import ui.UI;
import ui.place.ClinicUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Clinic extends AbstractPlace {
    private static Clinic ourInstance = new Clinic();

    public static Clinic getInstance() {
        return ourInstance;
    }

    private Clinic() {
        super();
    }

    @Override
    public UI getUI() {
        return new ClinicUI();
    }
}
