package game.places;

import ui.UI;
import ui.place.GymUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */

public class Gym extends AbstractPlace {
    private static Gym ourInstance = new Gym();

    public static Gym getInstance() {
        return ourInstance;
    }

    private Gym() {
        super();
    }

    @Override
    public UI getUI() {
        return new GymUI();
    }
}
