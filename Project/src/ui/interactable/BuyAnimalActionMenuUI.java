package ui.interactable;

import game.action.ActionHelper;
import game.interactable.Interactable;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class BuyAnimalActionMenuUI extends InteractableMenuUI {
    public BuyAnimalActionMenuUI(Interactable interactable) {
        super("You Will buy " + interactable.getName() + " with " +
                ActionHelper.getInstance().getAnimalActionMoney(interactable.getName()) + " Gil. "
                +"Is this okay? (Y/N)", interactable);
    }
}
