package ui.interactable.entities;

import game.interactable.Interactable;
import ui.interactable.InteractableMenuUI;

/**
 * Created by ahay on 5/7/17.
 * <p>
 * GIBILI GIBILI
 */
public class CheckBackPackItemStatusMenuUI extends InteractableMenuUI {
    public CheckBackPackItemStatusMenuUI(Interactable interactable) {
        super("Choose an item want check status: ", interactable);
    }
}
