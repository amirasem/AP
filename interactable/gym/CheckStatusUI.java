package ui.interactable.gym;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by Amir on 5/12/2017.
 * AHAY
 */
public class CheckStatusUI extends InteractableMenuUI {
    public CheckStatusUI(Interactable interactable) {
        super("You have x of this value at this time you increase this with y gils to z value", interactable);
    }
}
