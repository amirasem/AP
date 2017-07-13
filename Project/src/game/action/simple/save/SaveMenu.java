package game.action.simple.save;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.SaveMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class SaveMenu extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new SaveMenuUI(this);
    }
}
