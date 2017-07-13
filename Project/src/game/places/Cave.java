package game.places;

import ui.UI;
import ui.place.CaveUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Cave extends AbstractPlace {

    private static Cave ourInstance = new Cave();

    public static Cave getInstance() {
        return ourInstance;
    }

    private Cave() {
        super(     );
    }

    @Override
    public UI getUI() {
        return new CaveUI();
    }
}
