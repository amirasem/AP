package game.interactable;

import ui.UI;
import ui.interactable.WoodsUI;

/**
 * Created by ahay on 5/8/17.
 * <p>
 * GIBILI GIBILI
 */
public class Woods extends AbstractInteractable {
    private static Woods ourInstance = new Woods();

    public static Woods getInstance() {
        return ourInstance;
    }

    public Woods() {
    }

    @Override
    public UI getUI() {
        return new WoodsUI(this);
    }
}
