package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.CheckAnimalStatusForSellUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CheckAnimalStatusForSell extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new CheckAnimalStatusForSellUI(this);
    }
}
