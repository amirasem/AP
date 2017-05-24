package game.action.simple.fishing;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.GiveFishUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class GiveFish  extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new GiveFishUI(this);
    }
}
