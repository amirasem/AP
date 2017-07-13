package game.interactable;

import ui.UI;
import ui.interactable.PondUI;

/**
 * Created by ahay on 4/20/17.
 * GIBILI GIBILI
 */
public class Pond extends AbstractInteractable {

    private static Pond ourInstance = new Pond();

    public static Pond getInstance() {
        return ourInstance;
    }

    private Pond() {
        super();
    }

    @Override
    public UI getUI() {
        return new PondUI();
    }
}
