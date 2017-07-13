package game.places;

import ui.UI;
import ui.place.JungleUI;

/**
 * Created by ahay on 4/17/17.
 * GIBILI GIBILI
 */
public class Jungle extends AbstractPlace {

    private static Jungle ourInstance = new Jungle();

    public static Jungle getInstance() {
        return ourInstance;
    }

    private Jungle() {
        super(     );
    }

    public void goToFarm() {
        return;
    }

    public void goToCave() {
        return;
    }

    public void interactWithWood() {
        return;
    }

    public void interactWithRocks() {
        return;
    }

    public void interactWithRiver() {
        return;
    }

    @Override
    public UI getUI() {
        return new JungleUI();
    }
}
