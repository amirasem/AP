package game.places;

import ui.UI;
import ui.place.MarketUI;

/**
 * Created by ahay on 5/2/17.
 * <p>
 * GIBILI GIBILI
 */
public class Market extends AbstractPlace {
    private static Market ourInstance = new Market();

    public static Market getInstance() {
        return ourInstance;
    }

    private Market() {
    }

    @Override
    public UI getUI() {
        return new MarketUI();
    }
}
