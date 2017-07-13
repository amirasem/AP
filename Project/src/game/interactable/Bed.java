package game.interactable;

import ui.UI;
import ui.interactable.BedUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class Bed extends AbstractInteractable {
    private static Bed ourInstance = new Bed();

    public static Bed getInstance() {
        return ourInstance;
    }

    private Bed() {
    }

    @Override
    public UI getUI() {
        return new BedUI(this);
    }
}
