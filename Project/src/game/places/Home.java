package game.places;

import ui.UI;
import ui.place.HomeUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Home extends AbstractPlace {

    private static Home ourInstance = new Home();

    public static Home getInstance() {
        return ourInstance;
    }

    private Home() {
        super();
    }

    @Override
    public UI getUI() {
        return new HomeUI();
    }
}
