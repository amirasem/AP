package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.cafe.CheckDiningTableMenuUI;

/**
 * Created by Amir on 5/10/2017.
 * AHAY
 */
public class CheckDiningTableMenu extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new CheckDiningTableMenuUI(this);
    }
}
