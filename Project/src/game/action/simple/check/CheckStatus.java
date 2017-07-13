package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.gym.CheckStatusUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class CheckStatus extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new CheckStatusUI(this);
    }
}
