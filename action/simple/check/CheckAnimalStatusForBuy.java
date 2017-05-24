package game.action.simple.check;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.CheckAnimalStatusForBuyUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CheckAnimalStatusForBuy extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new CheckAnimalStatusForBuyUI(this);
    }
}
