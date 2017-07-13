package game.action.simple.sleep;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.SleepMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class SleepMenu extends AbstractInteractable {
    @Override
    public UI getUI() {

        return new SleepMenuUI(this);
    }
}
