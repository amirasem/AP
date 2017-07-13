package game.interactable;

import ui.UI;
import ui.interactable.RiverUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class River extends AbstractInteractable {

    private static River ourInstance = new River();

    public static River getInstance() {
        return ourInstance;
    }

    private River() {
        super();
    }

    @Override
    public UI getUI() {
        return new RiverUI();
    }
}
