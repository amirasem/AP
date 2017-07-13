package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.CheckShopMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CheckShopMenu extends AbstractInteractable {

    @Override
    public UI getUI() {
        return new CheckShopMenuUI(this);
    }
}
