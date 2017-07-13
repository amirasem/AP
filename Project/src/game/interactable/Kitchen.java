package game.interactable;

import ui.UI;
import ui.interactable.KitchenUI;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class Kitchen extends AbstractInteractable {
    private static Kitchen ourInstance = new Kitchen();

    public static Kitchen getInstance() {
        return ourInstance;
    }

    private Kitchen() {
    }

    @Override
    public UI getUI() {
        return new KitchenUI();
    }
}
