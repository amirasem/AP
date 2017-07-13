package ui.interactable;

import game.action.complex.buy.BuyDeprecated;
import game.interactable.Interactable;

/**
 * Created by ahay on 5/6/17.
 * <p>
 * GIBILI GIBILI
 */
public class BuyUI extends InteractableMenuUI {
    public BuyUI(Interactable interactable) {
        super("Choose the item you want buy:" , BuyDeprecated.getInstance());
    }
}
