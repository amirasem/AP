package ui;

import game.interactable.AbstractInteractable;
import ui.UI;
import ui.interactable.BuyAnimalActionMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class BuyAnimalActionMenu extends AbstractInteractable {
    @Override
    public UI getUI() {
        return new BuyAnimalActionMenuUI(this);
    }
}
