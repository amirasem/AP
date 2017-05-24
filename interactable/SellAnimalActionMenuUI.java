package ui.interactable;

import game.action.ActionHelper;
import game.interactable.Interactable;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class SellAnimalActionMenuUI extends InteractableMenuUI {
    public SellAnimalActionMenuUI(Interactable interactable) {
        super("You will sell " + interactable.getName() +" for " + ActionHelper.getInstance().getAnimalActionMoney(interactable.getName())
                +" Gil. " + "Is this okay? (Y/N)", interactable);

    }
}
